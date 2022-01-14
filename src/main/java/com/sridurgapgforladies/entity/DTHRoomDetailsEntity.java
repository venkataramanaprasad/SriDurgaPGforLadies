package com.sridurgapgforladies.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "DTHRoomDetailsEntity")
@Table(name = "DTH_ROOM_DETAILS")
public class DTHRoomDetailsEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DTH_ROOM_DETAILS_ID")
	private Integer dthRoomDetailsId;
	@Column(name = "ROOM_NO")
	private String roomNo;
	@Column(name = "BOX_ID")
	private Integer boxId;
	@Column(name = "DTH_DTH_ID")
	private Integer dthDTHId;
	
	public DTHRoomDetailsEntity() {
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
		return "DTHRoomDetailsEntity [dthRoomDetailsId=" + dthRoomDetailsId + ", roomNo=" + roomNo + ", boxId=" + boxId
				+ ", dthDTHId=" + dthDTHId + "]";
	}

	
}
