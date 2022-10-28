package com.hpe;

import org.springframework.stereotype.Service;


import com.hpe.PartitionOffsetBean;

@Service
public interface ExchangeRatesDao {

	public Integer saveExchRatesOffsetData(PartitionOffsetBean partitionData);

	public void saveExchangeRates(ExchangeRate exchangeRate);

}
