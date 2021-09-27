package com.garam.common.util;

import java.util.HashMap;
import java.util.Map;

public class save_Map {

	static Map<String, String> map_Emp_ID_Name = new HashMap<String, String>();
	static Map<String, String> map_Ve_ID_Name = new HashMap<String, String>();

	public static Map<String, String> getMap_Emp_ID_Name() {
		return map_Emp_ID_Name;
	}

	public static void setMap_Emp_ID_Name(Map<String, String> map_Emp_ID_Name) {
		save_Map.map_Emp_ID_Name = map_Emp_ID_Name;
	}

	public static Map<String, String> getMap_Ve_ID_Name() {
		return map_Ve_ID_Name;
	}

	public static void setMap_Ve_ID_Name(Map<String, String> map_Ve_ID_Name) {
		save_Map.map_Ve_ID_Name = map_Ve_ID_Name;
	}

}
