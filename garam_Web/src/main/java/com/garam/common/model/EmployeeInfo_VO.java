package com.garam.common.model;

// 인사 정보
public class EmployeeInfo_VO {

	// 사원번호
	private String id;
	// 회사이름
	private String company;
	// 사원유형
	private String kind;
	// 입사일
	private String joind;
	// 입사일
	private String endd;
	// 사원이름
	private String name;
	// 성별
	private String gender;
	// 생년월일
	private String birthday;
	// 연락처
	private String phone1;
	// 연락처
	private String phone2;
	// 주소
	private String address;
	// 차고지
	private String garage;
	// 보수교육일
	private String bosuM;
	// 보수교육구분
	private String bobuJ;
	// 면허번호
	private String drvl;
	// 버스자격증번호
	private String busl;
	// 메모
	private String memo;
	// 은행
	private String bank;
	// 계좌번호
	private String gye;
	// 예금주
	private String gyename;
	// 기본급
	private int baseM;
	// 국민연금
	private int kukM;
	// 건강보험
	private int gunM;
	// 고용보험
	private int goM;
	// 산재보험
	private int sanM;
	// 기사사진
	private String img;
	// 재직여부
	private int trash;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getJoind() {
		return joind;
	}

	public void setJoind(String joind) {
		this.joind = joind;
	}

	public String getEndd() {
		return endd;
	}

	public void setEndd(String endd) {
		this.endd = endd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGarage() {
		return garage;
	}

	public void setGarage(String garage) {
		this.garage = garage;
	}

	public String getBosuM() {
		return bosuM;
	}

	public void setBosuM(String bosuM) {
		this.bosuM = bosuM;
	}

	public String getBobuJ() {
		return bobuJ;
	}

	public void setBobuJ(String bobuJ) {
		this.bobuJ = bobuJ;
	}

	public String getDrvl() {
		return drvl;
	}

	public void setDrvl(String drvl) {
		this.drvl = drvl;
	}

	public String getBusl() {
		return busl;
	}

	public void setBusl(String busl) {
		this.busl = busl;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getGye() {
		return gye;
	}

	public void setGye(String gye) {
		this.gye = gye;
	}

	public String getGyename() {
		return gyename;
	}

	public void setGyename(String gyename) {
		this.gyename = gyename;
	}

	public int getBaseM() {
		return baseM;
	}

	public void setBaseM(int baseM) {
		this.baseM = baseM;
	}

	public int getKukM() {
		return kukM;
	}

	public void setKukM(int kukM) {
		this.kukM = kukM;
	}

	public int getGunM() {
		return gunM;
	}

	public void setGunM(int gunM) {
		this.gunM = gunM;
	}

	public int getGoM() {
		return goM;
	}

	public void setGoM(int goM) {
		this.goM = goM;
	}

	public int getSanM() {
		return sanM;
	}

	public void setSanM(int sanM) {
		this.sanM = sanM;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getTrash() {
		return trash;
	}

	public void setTrash(int trash) {
		this.trash = trash;
	}

	@Override
	public String toString() {
		return "EmployeeInfo_VO [id=" + id + ", company=" + company + ", kind=" + kind + ", joind=" + joind + ", endd="
				+ endd + ", name=" + name + ", gender=" + gender + ", birthday=" + birthday + ", phone1=" + phone1
				+ ", phone2=" + phone2 + ", address=" + address + ", garage=" + garage + ", bosuM=" + bosuM + ", bobuJ="
				+ bobuJ + ", drvl=" + drvl + ", busl=" + busl + ", memo=" + memo + ", bank=" + bank + ", gye=" + gye
				+ ", gyename=" + gyename + ", baseM=" + baseM + ", kukM=" + kukM + ", gunM=" + gunM + ", goM=" + goM
				+ ", sanM=" + sanM + ", img=" + img + ", trash=" + trash + ", getId()=" + getId() + ", getCompany()="
				+ getCompany() + ", getKind()=" + getKind() + ", getJoind()=" + getJoind() + ", getEndd()=" + getEndd()
				+ ", getName()=" + getName() + ", getGender()=" + getGender() + ", getBirthday()=" + getBirthday()
				+ ", getPhone1()=" + getPhone1() + ", getPhone2()=" + getPhone2() + ", getAddress()=" + getAddress()
				+ ", getGarage()=" + getGarage() + ", getBosuM()=" + getBosuM() + ", getBobuJ()=" + getBobuJ()
				+ ", getDrvl()=" + getDrvl() + ", getBusl()=" + getBusl() + ", getMemo()=" + getMemo() + ", getBank()="
				+ getBank() + ", getGye()=" + getGye() + ", getGyename()=" + getGyename() + ", getBaseM()=" + getBaseM()
				+ ", getKukM()=" + getKukM() + ", getGunM()=" + getGunM() + ", getGoM()=" + getGoM() + ", getSanM()="
				+ getSanM() + ", getImg()=" + getImg() + ", getTrash()=" + getTrash() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}