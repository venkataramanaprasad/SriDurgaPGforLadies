package com.sridurgapg.beans;

public class Tenant {
	private int id;
	private int roomNo;
	private String name;
	private int ShareType;
	private int Rent;
	private String student;
	private String working;
	private String payment;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getShareType() {
		return ShareType;
	}
	public void setShareType(int shareType) {
		ShareType = shareType;
	}
	public int getRent() {
		return Rent;
	}
	public void setRent(int rent) {
		Rent = rent;
	}
	public String getStudent() {
		return student;
	}
	public void setStudent(String student) {
		this.student = student;
	}
	public String getWorking() {
		return working;
	}
	public void setWorking(String working) {
		this.working = working;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	

}
