package com.petergeng.data;

import java.util.ArrayList;
import java.util.List;

public class DataType {
	private String comm = ""; //ע��
	private String name = ""; //������
	private int type; //�������� 1.���ͣ�2.�ַ�����
	private int structType; //1.��ֵ��2.���飻3.json����
	
	private List<DataType> datas = new ArrayList<DataType>(); //��������json��������ͣ���Ӧ�Ļ�������
	
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
