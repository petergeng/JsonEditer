package com.petergeng.logic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.tree.TreeNode;

import com.petergeng.util.Util;

public class JsonPraser {

	public static void parseJson(String path, String filename, Object obj){
		String jsonData = Util.objectToJson(obj);
		Util.writeFile(path, filename + Util.dataPrix, jsonData);
	}
	
	public static void main(String[] args) {
		Map<TreeNode,List<TreeNode>> treeNodeMap = new HashMap<TreeNode,List<TreeNode>>();
		JsonPraser.parseJson("E:/", "test.config", treeNodeMap);
	}
	
}
