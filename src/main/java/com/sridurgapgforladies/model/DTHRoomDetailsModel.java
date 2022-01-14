package com.sridurgapgforladies.model;

import java.io.Serializable;

public class DTHRoomDetailsModel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer dthRoomDetailsId;
	private String roomNo;
	private Integer boxId;
	private Integer dthDTHId;
	
	public DTHRoomDetailsModel() {
		super();
	}

	public Integer getDthRoomDetailsId() {
		return dthRoomDetailsId;
	}

	public void setDthRoomDetailsId(Integer dthRoomDetailsId) {
		this.dthRoomDetailsId = dthRoomDetailsId;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public Integer getBoxId() {
		return boxId;
	}

	public void setBoxId(Integer boxId) {
		this.boxId = boxId;
	}

	public Integer getDthDTHId() {
		return dthDTHId;
	}

	public void setDthDTHId(Integer dthDTHId) {
		this.dthDTHId = dthDTHId;
	}

	@Override
	public String toString() {
		return "DTHRoomDetailsModel [dthRoomDetailsId=" + dthRoomDetailsId + ", roomNo=" + roomNo + ", boxId=" + boxId
				+ ", dthDTHId=" + dthDTHId + "]";
	}
	
	
}
