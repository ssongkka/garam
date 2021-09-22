package com.garam.common.util;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class cal_Util {

	static public Map<Integer, LocalDate> asd(String year, String month) {
		Map<Integer, LocalDate> map_RT = new HashMap<Integer, LocalDate>();

		LocalDate lt_Now = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), 1);

		System.out.println(lt_Now.getDayOfWeek().getValue());

		int day_M = 42 - (43 - lt_Now.getDayOfWeek().getValue());

		LocalDate st_D = lt_Now.minusDays(day_M);

		for (int i = 0; i < 42; i++) {
			map_RT.put(i + 1, st_D.plusDays(i));
		}

		return map_RT;
	}
}