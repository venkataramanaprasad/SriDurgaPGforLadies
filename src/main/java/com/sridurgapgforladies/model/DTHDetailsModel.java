package com.sridurgapgforladies.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.sridurgapgforladies.entity.DTHRoomDetailsEntity;


public class DTHDetailsModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer dthDetailsId;
	private Integer subscriberId;
	private Date startDate;
	private Date endDate;
	private Integer rechargeAmount;
	private List<DTHRoomDetailsModel> dthRoomDetailsModels;
	
	public DTHDetailsModel() {
		super();
	}

	public Integer getDthDetailsId() {
		return dthDetailsId;
	}

	public void setDthDetailsId(Integer dthDetailsId) {
		this.dthDetailsId = dthDetailsId;
	}

	public Integer getSubscriberId() {
		return subscriberId;
	}

	public void setSubscriberId(Integer subscriberId) {
		this.subscriberId = subscriberId;
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

	public List<DTHRoomDetailsModel> getDthRoomDetailsModels() {
		return dthRoomDetailsModels;
	}

	public void setDthRoomDetailsModels(List<DTHRoomDetailsModel> dthRoomDetailsModels) {
		this.dthRoomDetailsModels = dthRoomDetailsModels;
	}

	@Override
	public String toString() {
		return "DTHDetailsModel [dthDetailsId=" + dthDetailsId + ", subscriberId=" + subscriberId + ", startDate="
				+ startDate + ", endDate=" + endDate + ", rechargeAmount=" + rechargeAmount + ", dthRoomDetailsModels="
				+ dthRoomDetailsModels + "]";
	}

}
