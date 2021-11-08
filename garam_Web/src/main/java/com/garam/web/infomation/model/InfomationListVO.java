package com.garam.web.infomation.model;

import com.garam.common.util.cal_Util;

public class InfomationListVO {
	private int no;
	private String insert_date;
	private String edit_date;
	private String date_end;
	private String date_com;
	private int grade;
	private String name;
	private String title;
	private String contents;
	private int trash;
	private int cnt;

	private String insert_date_Ch;
	private String edit_date_Ch;
	private String date_end_Ch;
	private String date_com_Ch;
	private String grade_Ch;

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

	public String getEdit_date() {
		return edit_date;
	}

	public void setEdit_date(String edit_date) {
		this.edit_date = edit_date;
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

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public String getInsert_date_Ch() {
		return cal_Util.dateTime_DBtoHTML(this.getInsert_date());
	}

	public String getEdit_date_Ch() {
		if (this.getEdit_date() != null) {
			return cal_Util.dateTime_DBtoHTML(this.getEdit_date());
		} else {
			return "없음";
		}
	}

	public String getDate_end_Ch() {
		if (this.getDate_end() != null) {
			return cal_Util.dateTime_DBtoHTML(this.getDate_end());
		} else {
			return "없음";
		}
	}

	public String getDate_com_Ch() {
		if (this.getDate_com() != null) {
			return cal_Util.dateTime_DBtoHTML(this.getDate_com());
		} else {
			return "미완료";
		}
	}

	public String getGrade_Ch() {
		if (this.getGrade() > 0) {
			return "중요";
		} else {
			return "";
		}
	}

	@Override
	public String toString() {
		return "InfomationListVO [no=" + no + ", insert_date=" + insert_date + ", edit_date=" + edit_date
				+ ", date_end=" + date_end + ", date_com=" + date_com + ", grade=" + grade + ", name=" + name
				+ ", title=" + title + ", contents=" + contents + ", trash=" + trash + ", insert_date_Ch="
				+ insert_date_Ch + ", edit_date_Ch=" + edit_date_Ch + ", date_end_Ch=" + date_end_Ch + ", date_com_Ch="
				+ date_com_Ch + ", grade_Ch=" + grade_Ch + ", getNo()=" + getNo() + ", getInsert_date()="
				+ getInsert_date() + ", getEdit_date()=" + getEdit_date() + ", getDate_end()=" + getDate_end()
				+ ", getDate_com()=" + getDate_com() + ", getGrade()=" + getGrade() + ", getName()=" + getName()
				+ ", getTitle()=" + getTitle() + ", getContents()=" + getContents() + ", getTrash()=" + getTrash()
				+ ", getInsert_date_Ch()=" + getInsert_date_Ch() + ", getEdit_date_Ch()=" + getEdit_date_Ch()
				+ ", getDate_end_Ch()=" + getDate_end_Ch() + ", getDate_com_Ch()=" + getDate_com_Ch()
				+ ", getGrade_Ch()=" + getGrade_Ch() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
