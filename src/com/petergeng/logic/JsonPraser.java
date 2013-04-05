package com.petergeng.logic;

import java.util.Map;

import com.petergeng.util.Util;

public class JsonPraser {

	public static void parseJson(String path, String filename, Map map){
		String jsonData = Util.objectToJson(map);
		Util.writeFile(path, filename + Util.dataPrix, jsonData);
	}
	
}
