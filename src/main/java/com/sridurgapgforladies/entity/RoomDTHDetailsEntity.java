package com.sridurgapgforladies.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "RoomDTHDetailsEntity")
@Table(name = "ROOM_DTH_DETAILS")
public class RoomDTHDetailsEntity implements Serializable {
		
		private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "ROOM_DTH_DETAILS_ID")
		private Integer roomDTHDetailsId;
		@Column(name = "ROOM_NO")
		private String roomNo;
		@Column(name = "SUBSCRIBER_ID")
		private Integer subscriberId;
		@Column(name = "BOX_ID")
		private Integer boxId;
		@Column(name = "START_DATE")
		private Date startDate;
		@Column(name = "END_DATE")
		private Date endDate;
		@Column(name = "RECHARGE_AMOUNT")
		private Integer rechargeAmount;
		
		public RoomDTHDetailsEntity() {
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
			return "RoomDTHDetailsEntity [roomDTHDetailsId=" + roomDTHDetailsId + ", roomNo=" + roomNo
					+ ", subscriberId=" + subscriberId + ", boxId=" + boxId + ", startDate=" + startDate + ", endDate="
					+ endDate + ", rechargeAmount=" + rechargeAmount + "]";
		}
		
		
}
