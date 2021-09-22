package com.garam.common.model;

public class VehicleInfo_VO {

	// 차대번호
	private String carNumber;
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
	private String regD;
	// 차량등록증
	private String regAdd;
	// 보험스캔일
	private String insuD;
	// 보험
	private String insuAdd;
	// 적법스캔일
	private String jukD;
	// 적법
	private String jukAdd;
	// 차량사진_옆
	private String img1;
	// 차량사진_앞
	private String img2;
	// 삭제여부
	private int trash;

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
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

	public String getRegD() {
		return regD;
	}

	public void setRegD(String regD) {
		this.regD = regD;
	}

	public String getRegAdd() {
		return regAdd;
	}

	public void setRegAdd(String regAdd) {
		this.regAdd = regAdd;
	}

	public String getInsuD() {
		return insuD;
	}

	public void setInsuD(String insuD) {
		this.insuD = insuD;
	}

	public String getInsuAdd() {
		return insuAdd;
	}

	public void setInsuAdd(String insuAdd) {
		this.insuAdd = insuAdd;
	}

	public String getJukD() {
		return jukD;
	}

	public void setJukD(String jukD) {
		this.jukD = jukD;
	}

	public String getJukAdd() {
		return jukAdd;
	}

	public void setJukAdd(String jukAdd) {
		this.jukAdd = jukAdd;
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

	public int getTrash() {
		return trash;
	}

	public void setTrash(int trash) {
		this.trash = trash;
	}

	@Override
	public String toString() {
		return "VehicleInfo [carNumber=" + carNumber + ", vehicle=" + vehicle + ", company=" + company + ", owner="
				+ owner + ", bus=" + bus + ", brand=" + brand + ", name=" + name + ", grade=" + grade + ", fuel=" + fuel
				+ ", num=" + num + ", color=" + color + ", regist=" + regist + ", expire=" + expire + ", price=" + price
				+ ", special=" + special + ", regD=" + regD + ", regAdd=" + regAdd + ", insuD=" + insuD + ", insuAdd="
				+ insuAdd + ", jukD=" + jukD + ", jukAdd=" + jukAdd + ", img1=" + img1 + ", img2=" + img2 + ", trash="
				+ trash + "]";
	}

}
