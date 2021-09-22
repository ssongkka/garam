package com.garam.common.model;

public class Ve_Id2_VO {

	private String car_number;
	private String id;

	public String getCar_number() {
		return car_number;
	}

	public void setCar_number(String car_number) {
		this.car_number = car_number;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Ve_Id2_VO [car_number=" + car_number + ", id=" + id + ", getCar_number()=" + getCar_number()
				+ ", getId()=" + getId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
