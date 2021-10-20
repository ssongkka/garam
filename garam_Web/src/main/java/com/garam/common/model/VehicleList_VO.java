package com.garam.common.model;

public class VehicleList_VO {
	// 사원번호
	private String car_number;
	// 사원이름
	private String vehicle;
	// 연락처
	private String grade;

	public String getCar_number() {
		return car_number;
	}

	public void setCar_number(String car_number) {
		this.car_number = car_number;
	}

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "VehicleList_VO [car_number=" + car_number + ", vehicle=" + vehicle + ", grade=" + grade
				+ ", getCar_number()=" + getCar_number() + ", getVehicle()=" + getVehicle() + ", getGrade()="
				+ getGrade() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
