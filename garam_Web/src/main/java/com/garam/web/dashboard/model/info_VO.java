package com.garam.web.dashboard.model;

public class info_VO {

	int no;
	String insert_date;
	String date_end;
	String date_com;
	int grade;
	String name;
	String title;
	String contents;
	int trash;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getInsert_date() {
		return insert_date;
	}

	public void setInsert_date(String insert_date) {
		this.insert_date = insert_date;
	}

	public String getDate_end() {
		return date_end;
	}

	public void setDate_end(String date_end) {
		this.date_end = date_end;
	}

	public String getDate_com() {
		return date_com;
	}

	public void setDate_com(String date_com) {
		this.date_com = date_com;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public int getTrash() {
		return trash;
	}

	public void setTrash(int trash) {
		this.trash = trash;
	}

	@Override
	public String toString() {
		return "info_VO [no=" + no + ", insert_date=" + insert_date + ", date_end=" + date_end + ", date_com="
				+ date_com + ", grade=" + grade + ", name=" + name + ", title=" + title + ", contents=" + contents
				+ ", trash=" + trash + ", getNo()=" + getNo() + ", getInsert_date()=" + getInsert_date()
				+ ", getDate_end()=" + getDate_end() + ", getDate_com()=" + getDate_com() + ", getGrade()=" + getGrade()
				+ ", getName()=" + getName() + ", getTitle()=" + getTitle() + ", getContents()=" + getContents()
				+ ", getTrash()=" + getTrash() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
