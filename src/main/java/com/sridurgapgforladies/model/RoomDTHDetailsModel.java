package com.sridurgapgforladies.model;

import java.util.Date;

public class RoomDTHDetailsModel {
	private Integer roomDTHDetailsId;
	private String roomNo;
	private Integer subscriberId;
	private Integer boxId;
	private Date startDate;
	private Date endDate;
	private Integer rechargeAmount;
	
	public RoomDTHDetailsModel() {
		super();
	}

	public Integer getRoomDTHDetailsId() {
		return roomDTHDetailsId;
	}

	public void setRoomDTHDetailsId(Integer roomDTHDetailsId) {
		this.roomDTHDetailsId = roomDTHDetailsId;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public Integer getSubscriberId() {
		return subscriberId;
	}

	public void setSubscriberId(Integer subscriberId) {
		this.subscriberId = subscriberId;
	}

	public Integer getBoxId() {
		return boxId;
	}

	public void setBoxId(Integer boxId) {
		this.boxId = boxId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getRechargeAmount() {
		return rechargeAmount;
	}

	public void setRechargeAmount(Integer rechargeAmount) {
		this.rechargeAmount = rechargeAmount;
	}

	@Override
	public String toString() {
		return "RoomDTHDetailsModel [roomDTHDetailsId=" + roomDTHDetailsId + ", roomNo=" + roomNo + ", subscriberId="
				+ subscriberId + ", boxId=" + boxId + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", rechargeAmount=" + rechargeAmount + "]";
	}
}
