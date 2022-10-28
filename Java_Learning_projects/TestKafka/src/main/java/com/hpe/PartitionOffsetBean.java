package com.hpe;

import java.sql.Date;
import java.sql.Timestamp;

public class PartitionOffsetBean {
	
	public String topic ;
	public int partition ;
	public long offset ;
	public String updatedTime;
	
	
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public int getPartition() {
		return partition;
	}
	public void setPartition(int partition) {
		this.partition = partition;
	}
	public long getOffset() {
		return offset;
	}
	public void setOffset(long offset) {
		this.offset = offset;
	}
	public String getUpdatedTime() {
		return updatedTime;
	}
	public void setUpdatedTime(String timeStamp) {
		this.updatedTime = timeStamp;
	}
	
	
	
	
	

}
