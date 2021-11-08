package com.garam.web.infomation.model;

import com.garam.common.util.cal_Util;

public class InfomationReplyVO {
	private int rno;
	private int no;
	private int parent_no;
	private int depth;
	private String insert_date;
	private String edit_date;
	private String content;
	private String name;
	private int trash;

	private String insert_date_Ch;
	private String edit_date_Ch;

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getParent_no() {
		return parent_no;
	}

	public void setParent_no(int parent_no) {
		this.parent_no = parent_no;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getEdit_date_Ch() {
		if (this.getEdit_date() != null) {
			return cal_Util.dateTime_DBtoHTML(this.getEdit_date());
		} else {
			return "";
		}
	}

	@Override
	public String toString() {
		return "InfomationReplyVO [rno=" + rno + ", no=" + no + ", parent_no=" + parent_no + ", depth=" + depth
				+ ", insert_date=" + insert_date + ", edit_date=" + edit_date + ", content=" + content + ", name="
				+ name + ", trash=" + trash + ", insert_date_Ch=" + insert_date_Ch + ", edit_date_Ch=" + edit_date_Ch
				+ ", getRno()=" + getRno() + ", getNo()=" + getNo() + ", getParent_no()=" + getParent_no()
				+ ", getDepth()=" + getDepth() + ", getInsert_date()=" + getInsert_date() + ", getEdit_date()="
				+ getEdit_date() + ", getContent()=" + getContent() + ", getName()=" + getName() + ", getTrash()="
				+ getTrash() + ", getInsert_date_Ch()=" + getInsert_date_Ch() + ", getEdit_date_Ch()="
				+ getEdit_date_Ch() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
