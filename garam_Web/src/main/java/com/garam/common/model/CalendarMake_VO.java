package com.garam.common.model;

public class CalendarMake_VO {
	int no;
	String solar_Cal;
	String holiday;
	String event;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getSolar_Cal() {
		return solar_Cal;
	}

	public void setSolar_Cal(String solar_Cal) {
		this.solar_Cal = solar_Cal;
	}

	public String getHoliday() {
		return holiday;
	}

	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	@Override
	public String toString() {
		return "CalendarMake_VO [no=" + no + ", solar_Cal=" + solar_Cal + ", holiday=" + holiday + ", event=" + event
				+ ", getNo()=" + getNo() + ", getSolar_Cal()=" + getSolar_Cal() + ", getHoliday()=" + getHoliday()
				+ ", getEvent()=" + getEvent() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
