package com.hpe;

import java.sql.Date;

public class ExchangeRate {
	
	public String RATE_TYPE;//--- P Price Reate M Acc Rate
	public String FROM_CURR;
	public String TO_CURRNCY;
	public String VALID_FROM;
	public String EXCH_RATE;
	//public Date  endDate;
	public String FROM_FACTOR;
	public String TO_FACTOR;
	
	public int partitionId;
	
	
	public String getRATE_TYPE() {
		return RATE_TYPE;
	}


	public void setRATE_TYPE(String rATE_TYPE) {
		RATE_TYPE = rATE_TYPE;
	}


	public String getFROM_CURR() {
		return FROM_CURR;
	}


	public void setFROM_CURR(String fROM_CURR) {
		FROM_CURR = fROM_CURR;
	}


	public String getTO_CURRNCY() {
		return TO_CURRNCY;
	}


	public void setTO_CURRNCY(String tO_CURRNCY) {
		TO_CURRNCY = tO_CURRNCY;
	}


	public String getVALID_FROM() {
		return VALID_FROM;
	}


	public void setVALID_FROM(String vALID_FROM) {
		VALID_FROM = vALID_FROM;
	}


	public String getEXCH_RATE() {
		return EXCH_RATE;
	}


	public void setEXCH_RATE(String eXCH_RATE) {
		EXCH_RATE = eXCH_RATE;
	}


	public String getFROM_FACTOR() {
		return FROM_FACTOR;
	}


	public void setFROM_FACTOR(String fROM_FACTOR) {
		FROM_FACTOR = fROM_FACTOR;
	}


	public String getTO_FACTOR() {
		return TO_FACTOR;
	}


	public void setTO_FACTOR(String tO_FACTOR) {
		TO_FACTOR = tO_FACTOR;
	}
	
	


	public int getPartitionId() {
		return partitionId;
	}


	public void setPartitionId(int partitionId) {
		this.partitionId = partitionId;
	}


	/*public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}*/
	@Override
	public String toString() {
		return "ExchangeRate [RATE_TYPE=" + getRATE_TYPE() + ", FROM_CURR=" + getFROM_CURR() + ", TO_CURRNCY=" + getTO_CURRNCY()
				+ ", VALID_FROM=" + getVALID_FROM() + ", EXCH_RATE=" + getEXCH_RATE() +
				", FROM_FACTOR=" + getFROM_FACTOR() +", TO_FACTOR=" + getTO_FACTOR() + ", PARTITION-ID=" + getPartitionId() + "]";
	}
	
	
	
	
	
}
