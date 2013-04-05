package com.petergeng.data;

import java.util.ArrayList;
import java.util.List;

public class DataType {
	private String comm = ""; //注释
	private String name = ""; //变量名
	private int type; //变量类型 1.整型；2.字符串；
	private int structType; //1.单值；2.数组；3.json对象
	
	private List<DataType> datas = new ArrayList<DataType>(); //如果数组或json对象的类型，对应的还有数据
	
	public DataType(){
		
	}

	public String getComm() {
		return comm;
	}

	public void setComm(String comm) {
		this.comm = comm;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getStructType() {
		return structType;
	}

	public void setStructType(int structType) {
		this.structType = structType;
	}

	public List<DataType> getDatas() {
		return datas;
	}

	public void setDatas(List<DataType> datas) {
		this.datas = datas;
	}

	public DataType(String comm, String name, int type, int structType,
			List<DataType> datas) {
		super();
		this.comm = comm;
		this.name = name;
		this.type = type;
		this.structType = structType;
		this.datas = datas;
	}
	
}
