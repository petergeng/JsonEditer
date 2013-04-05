package com.petergeng.data;

import java.util.Map;

public class DataValue {

	private DataType dataType;
	private Map dataValue;
	
	public DataValue(DataType dataType, Map dataValue) {
		this.dataType = dataType;
		this.dataValue = dataValue;
	}
	public void setDataValue(Map dataValue) {
		this.dataValue = dataValue;
	}
	public Map getDataValue() {
		return dataValue;
	}
	public void setDataType(DataType dataType) {
		this.dataType = dataType;
	}
	public DataType getDataType() {
		return dataType;
	}
	
}
