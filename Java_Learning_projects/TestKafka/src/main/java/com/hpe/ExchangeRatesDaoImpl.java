package com.hpe;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.sql.DataSource;

import org.json.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

import com.hpe.ExchangeRate;
import com.hpe.PartitionOffsetBean;

@Service
public class ExchangeRatesDaoImpl implements ExchangeRatesDao {

	private static final Logger LOG = LoggerFactory.getLogger(ExchangeRatesDaoImpl.class);

	private JdbcTemplate jdbcTemplate;

	public ExchangeRatesDaoImpl(DataSource dataSource) throws SQLException {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public Integer saveExchRatesOffsetData(PartitionOffsetBean partitionData) {
		int res = -1;
		String sql = null;
		try {
			MapSqlParameterSource parameters = new MapSqlParameterSource();
			JSONArray templateData = null;
			if (partitionData != null) {
				parameters.addValue("topic", partitionData.getTopic());
				parameters.addValue("partition", partitionData.getPartition());
				parameters.addValue("offset", partitionData.getOffset());
				parameters.addValue("updatedTime", partitionData.getUpdatedTime());
			}

			sql = "Update S4_PARTITION_OFFSET set OFFSET =:offset,PARTITION=:partition,UPDATED_TIME=:updatedTime where TOPIC=:topic and PARTITION=:partition";
			res = new NamedParameterJdbcTemplate(this.jdbcTemplate.getDataSource()).update(sql, parameters);

			if (res == 0) {
				sql = " Insert into S4_PARTITION_OFFSET (TOPIC,PARTITION,OFFSET,UPDATED_TIME) VALUES (:topic,:partition,:offset,:updatedTime)";
				res = new NamedParameterJdbcTemplate(this.jdbcTemplate.getDataSource()).update(sql, parameters);
			}

		} catch (Exception e) {
			e.printStackTrace();
			LOG.info("MAST DB OFFSET INSERTION FAILURE" + e.getMessage());
		}
		return res;
	}

	/** Method to save Exchange Rates Data **/

	public void saveExchangeRates(ExchangeRate exchangeRate) {
		try {
			java.util.Date date = new java.util.Date();
			long t = date.getTime();
			java.sql.Date sqlDate = new java.sql.Date(t);
			String rateType = "";
			if (exchangeRate.getRATE_TYPE().equalsIgnoreCase("M")) {
				rateType = "ACCT";
			} else if (exchangeRate.getRATE_TYPE().equalsIgnoreCase("PXHW")
					|| exchangeRate.getRATE_TYPE().equalsIgnoreCase("PX")) {
				// || exchangeRate.getRATE_TYPE().equalsIgnoreCase("P")) {
				rateType = "PRCE";
			}

			Date fromDate = convertDate(exchangeRate.getVALID_FROM());
			Date fromDateNew = new Date();
			if (fromDate != null) {
				fromDateNew = fromDate;
			}
			BigDecimal exchRate = new BigDecimal(exchangeRate.getEXCH_RATE());
			exchRate = exchRate.multiply(new BigDecimal(exchangeRate.getTO_FACTOR()));
			exchRate = exchRate.divide(new BigDecimal(exchangeRate.getFROM_FACTOR()));
			SqlParameterSource paramSource = new MapSqlParameterSource()
					// .addValue("exchangeRate", exchangeRate.getEXCH_RATE())
					.addValue("exchangeRate", exchRate).addValue("fromCurr", exchangeRate.getFROM_CURR())
					.addValue("rateType", rateType).addValue("toCurr", exchangeRate.getTO_CURRNCY())
					// .addValue("validFrom", null !=
					// convertDate(exchangeRate.getVALID_FROM()) ?
					// convertDate(exchangeRate.getVALID_FROM()) : "")
					.addValue("validFrom", fromDateNew)
					.addValue("createdDate", new java.sql.Timestamp(System.currentTimeMillis()));// sqlDate);

			String sql = "Insert into TEMP_EXCHANGERATES (EXCH_RATE,FROM_CURR,RATE_TYPE,TO_CURRNCY,FROM_DATE,CREATED_DATE) "
					+ "VALUES (:exchangeRate,:fromCurr,:rateType,:toCurr,:validFrom,:createdDate)";

			int successFlag = new NamedParameterJdbcTemplate(this.jdbcTemplate.getDataSource()).update(sql,
					paramSource);

			String sqlcheck = "SELECT count(*) FROM S4_EXCH_RATE where (RATE_TYPE || FROM_CURR || TO_CURRNCY || FROM_DATE) IN "
					+ "	(SELECT (RATE_TYPE || FROM_CURR || TO_CURRNCY || FROM_DATE) FROM TEMP_EXCHANGERATES)";

			int count = jdbcTemplate.queryForObject(sqlcheck, new Object[] {}, Integer.class);

			if (count > 0) {
				/***** AFTER MTP CHANGES ********/
				/****String updateQuery = "UPDATE S4_EXCH_RATE S4ER SET S4ER.TO_DATE = ( SELECT GLBLER.FROM_DATE -1 "
						+ "				 FROM TEMP_EXCHANGERATES GLBLER  WHERE (S4ER.RATE_TYPE || S4ER.FROM_CURR || S4ER.TO_CURRNCY) ="
						+ "					  (GLBLER.RATE_TYPE || GLBLER.FROM_CURR || GLBLER.TO_CURRNCY)) where "
						+ "           S4ER.TO_DATE is NULL and (RATE_TYPE || FROM_CURR || TO_CURRNCY) IN "
						+ "           (SELECT (RATE_TYPE || FROM_CURR || TO_CURRNCY) FROM TEMP_EXCHANGERATES)";

				int updateFlag = new NamedParameterJdbcTemplate(this.jdbcTemplate.getDataSource()).update(updateQuery,
						paramSource);

				String insertQuery = "INSERT INTO S4_EXCH_RATE SELECT RATE_TYPE, FROM_CURR, TO_CURRNCY, FROM_DATE, TO_DATE, EXCH_RATE, CREATED_DATE FROM TEMP_EXCHANGERATES";

				int insertcount = new NamedParameterJdbcTemplate(this.jdbcTemplate.getDataSource()).update(insertQuery,
						paramSource);****/
			}
			else{
			String insertQuery = "INSERT INTO S4_EXCH_RATE SELECT RATE_TYPE, FROM_CURR, TO_CURRNCY, FROM_DATE, TO_DATE, EXCH_RATE, CREATED_DATE FROM TEMP_EXCHANGERATES";

			int insertcount = new NamedParameterJdbcTemplate(this.jdbcTemplate.getDataSource()).update(insertQuery,
					paramSource);
			}
			truncateTable("TEMP_EXCHANGERATES");

		} catch (Exception e) {
			e.printStackTrace();
			truncateTable("TEMP_EXCHANGERATES");
			LOG.info("MAST DB EXCHANGE RATES INSERTION FAILURE" + e.getMessage());
		}
	}

	public Date convertDate(String date) {
		StringBuffer fromdate = new StringBuffer(date);
		fromdate.insert(4, "-");
		fromdate.insert(7, "-");
		Date frmDate = null;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try {
			frmDate = new java.sql.Date(formatter.parse(fromdate.toString()).getTime());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return frmDate;
	}

	/** Method to Truncate table **/

	public void truncateTable(String tableName) {
		String truncateQuery = "TRUNCATE TABLE " + tableName;
		new NamedParameterJdbcTemplate(this.jdbcTemplate.getDataSource()).update(truncateQuery,
				new MapSqlParameterSource());

	}

}
