package com.garam.common.model;

public class VehicleInfo_VO {

	// 차대번호
	private String car_number;

	// 차량번호
	private String vehicle;

	// 회사이름
	private String company;

	// 소유자
	private String owner;

	// 인승
	private String bus;

	// 제조자
	private String brand;

	// 차량명
	private String name;

	// 등급
	private String grade;

	// 연료종류
	private String fuel;

	// 승차인원
	private String num;

	// 차량색상
	private String color;

	// 차량등록일
	private String regist;

	// 차량만료일
	private String expire;

	// 출고가
	private int price;

	// 특이사항
	private String special;

	// 차량등록증스캔일
	private String reg_d;

	// 차량등록증
	private String reg_add;

	// 보험스캔일
	private String insu_d;

	// 보험
	private String insu_add;

	// 적법스캔일
	private String juk_d;

	// 적법
	private String juk_add;

	// 차량사진_옆
	private String img1;

	// 차량사진_앞
	private String img2;

	// 차량사진_내부
	private String img3;

	// 삭제여부
	private int trash;

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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getBus() {
		return bus;
	}

	public void setBus(String bus) {
		this.bus = bus;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRegist() {
		return regist;
	}

	public void setRegist(String regist) {
		this.regist = regist;
	}

	public String getExpire() {
		return expire;
	}

	public void setExpire(String expire) {
		this.expire = expire;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getSpecial() {
		return special;
	}

	public void setSpecial(String special) {
		this.special = special;
	}

	public String getReg_d() {
		return reg_d;
	}

	public void setReg_d(String reg_d) {
		this.reg_d = reg_d;
	}

	public String getReg_add() {
		return reg_add;
	}

	public void setReg_add(String reg_add) {
		this.reg_add = reg_add;
	}

	public String getInsu_d() {
		return insu_d;
	}

	public void setInsu_d(String insu_d) {
		this.insu_d = insu_d;
	}

	public String getInsu_add() {
		return insu_add;
	}

	public void setInsu_add(String insu_add) {
		this.insu_add = insu_add;
	}

	public String getJuk_d() {
		return juk_d;
	}

	public void setJuk_d(String juk_d) {
		this.juk_d = juk_d;
	}

	public String getJuk_add() {
		return juk_add;
	}

	public void setJuk_add(String juk_add) {
		this.juk_add = juk_add;
	}

	public String getImg1() {
		return img1;
	}

	public void setImg1(String img1) {
		this.img1 = img1;
	}

	public String getImg2() {
		return img2;
	}

	public void setImg2(String img2) {
		this.img2 = img2;
	}

	public String getImg3() {
		return img3;
	}

	public void setImg3(String img3) {
		this.img3 = img3;
	}

	public int getTrash() {
		return trash;
	}

	public void setTrash(int trash) {
		this.trash = trash;
	}

	@Override
	public String toString() {
		return "VehicleInfo_VO [car_number=" + car_number + ", vehicle=" + vehicle + ", company=" + company + ", owner="
				+ owner + ", bus=" + bus + ", brand=" + brand + ", name=" + name + ", grade=" + grade + ", fuel=" + fuel
				+ ", num=" + num + ", color=" + color + ", regist=" + regist + ", expire=" + expire + ", price=" + price
				+ ", special=" + special + ", reg_d=" + reg_d + ", reg_add=" + reg_add + ", insu_d=" + insu_d
				+ ", insu_add=" + insu_add + ", juk_d=" + juk_d + ", juk_add=" + juk_add + ", img1=" + img1 + ", img2="
				+ img2 + ", img3=" + img3 + ", trash=" + trash + ", getCar_number()=" + getCar_number()
				+ ", getVehicle()=" + getVehicle() + ", getCompany()=" + getCompany() + ", getOwner()=" + getOwner()
				+ ", getBus()=" + getBus() + ", getBrand()=" + getBrand() + ", getName()=" + getName() + ", getGrade()="
				+ getGrade() + ", getFuel()=" + getFuel() + ", getNum()=" + getNum() + ", getColor()=" + getColor()
				+ ", getRegist()=" + getRegist() + ", getExpire()=" + getExpire() + ", getPrice()=" + getPrice()
				+ ", getSpecial()=" + getSpecial() + ", getReg_d()=" + getReg_d() + ", getReg_add()=" + getReg_add()
				+ ", getInsu_d()=" + getInsu_d() + ", getInsu_add()=" + getInsu_add() + ", getJuk_d()=" + getJuk_d()
				+ ", getJuk_add()=" + getJuk_add() + ", getImg1()=" + getImg1() + ", getImg2()=" + getImg2()
				+ ", getImg3()=" + getImg3() + ", getTrash()=" + getTrash() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
