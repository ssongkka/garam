package com.garam.common.model;

public class EmployeeList_VO {
	// 사원번호
	private String id;
	// 사원이름
	private String name;
	// 연락처
	private String phone1;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	@Override
	public String toString() {
		return "EmployeeList_VO [id=" + id + ", name=" + name + ", phone1=" + phone1 + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getPhone1()=" + getPhone1() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
