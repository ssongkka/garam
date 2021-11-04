package com.garam.common.util;

public class cal_Util {
	static public String dateTime_DBtoHTML(String dateTime) {
		String tmp_Date = dateTime.substring(0, 10);
		String rtn_Date = tmp_Date.replace("-", ".") + ".";

		String tmp_Time = dateTime.substring(11, 16);

		return rtn_Date + " " + tmp_Time;
	}

	static public String date_DBtoHTML(String dateTime) {
		String tmp_Date = dateTime.substring(0, 10);
		String rtn_Date = tmp_Date.replace("-", ".") + ".";

		return rtn_Date;
	}
}