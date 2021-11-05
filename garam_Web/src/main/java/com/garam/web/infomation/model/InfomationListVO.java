package com.garam.web.infomation.model;

import com.garam.common.util.cal_Util;

public class InfomationListVO {
	int no;
	String insert_date;
	String date_end;
	String date_com;
	int grade;
	String name;
	String title;
	String contents;
	int trash;

	String insert_date_Ch;
	String date_end_Ch;
	String date_com_Ch;
	String grade_Ch;

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

	public String getInsert_date_Ch() {
		return cal_Util.dateTime_DBtoHTML(this.getInsert_date());
	}

	public String getDate_end_Ch() {
		if (this.getDate_end() != null) {
			return cal_Util.dateTime_DBtoHTML(this.getDate_end());
		} else {
			return "����";
		}
	}

	public String getDate_com_Ch() {
		if (this.getDate_com() != null) {
			return cal_Util.dateTime_DBtoHTML(this.getDate_com());
		} else {
			return "�̿Ϸ�";
		}
	}

	public String getGrade_Ch() {
		if (this.getGrade() > 0) {
			return "�߿�";
		} else {
			return "";
		}
	}

	@Override
	public String toString() {
		return "InfomationListParamVO [no=" + no + ", insert_date=" + insert_date + ", date_end=" + date_end
				+ ", date_com=" + date_com + ", grade=" + grade + ", name=" + name + ", title=" + title + ", contents="
				+ contents + ", trash=" + trash + ", insert_date_Ch=" + insert_date_Ch + ", date_end_Ch=" + date_end_Ch
				+ ", date_com_Ch=" + date_com_Ch + ", grade_Ch=" + grade_Ch + ", getNo()=" + getNo()
				+ ", getInsert_date()=" + getInsert_date() + ", getDate_end()=" + getDate_end() + ", getDate_com()="
				+ getDate_com() + ", getGrade()=" + getGrade() + ", getName()=" + getName() + ", getTitle()="
				+ getTitle() + ", getContents()=" + getContents() + ", getTrash()=" + getTrash()
				+ ", getInsert_date_Ch()=" + getInsert_date_Ch() + ", getDate_end_Ch()=" + getDate_end_Ch()
				+ ", getDate_com_Ch()=" + getDate_com_Ch() + ", getGrade_Ch()=" + getGrade_Ch() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
