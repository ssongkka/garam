package com.garam.common.model;

public class Ve_Id_VO {

	private String carNumber;
	private String id;
	private String stD;
	private String edD;

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStD() {
		return stD;
	}

	public void setStD(String stD) {
		this.stD = stD;
	}

	public String getEdD() {
		return edD;
	}

	public void setEdD(String edD) {
		this.edD = edD;
	}

	@Override
	public String toString() {
		return "Ve_Id_VO [carNumber=" + carNumber + ", id=" + id + ", stD=" + stD + ", edD=" + edD + ", getCarNumber()="
				+ getCarNumber() + ", getId()=" + getId() + ", getStD()=" + getStD() + ", getEdD()=" + getEdD()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
