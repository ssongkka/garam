package com.garam.common.model;

public class Calendar_VO {
	int no;
	String solar_Cal;
	String lunar_Cal;
	String season;
	String etc;
	String holiday;
	String anniversary;
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

	public String getLunar_Cal() {
		return lunar_Cal;
	}

	public void setLunar_Cal(String lunar_Cal) {
		this.lunar_Cal = lunar_Cal;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getEtc() {
		return etc;
	}

	public void setEtc(String etc) {
		this.etc = etc;
	}

	public String getHoliday() {
		return holiday;
	}

	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}

	public String getAnniversary() {
		return anniversary;
	}

	public void setAnniversary(String anniversary) {
		this.anniversary = anniversary;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	@Override
	public String toString() {
		return "Calendar_VO [no=" + no + ", solar_Cal=" + solar_Cal + ", lunar_Cal=" + lunar_Cal + ", season=" + season
				+ ", etc=" + etc + ", holiday=" + holiday + ", anniversary=" + anniversary + ", event=" + event
				+ ", getNo()=" + getNo() + ", getSolar_Cal()=" + getSolar_Cal() + ", getLunar_Cal()=" + getLunar_Cal()
				+ ", getSeason()=" + getSeason() + ", getEtc()=" + getEtc() + ", getHoliday()=" + getHoliday()
				+ ", getAnniversary()=" + getAnniversary() + ", getEvent()=" + getEvent() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
