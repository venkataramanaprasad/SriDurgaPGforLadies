package com.sridurgapgforladies.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "DTHDetailsEntity")
@Table(name = "DTH_DETAILS")
public class DTHDetailsEntity implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DTH_DETAILS_ID")
	private Integer dthDetailsId;
	@Column(name = "SUBSCRIBER_ID")
	private Integer subscriberId;
	@Column(name = "START_DATE")
	private Date startDate;
	@Column(name = "END_DATE")
	private Date endDate;
	@Column(name = "RECHARGE_AMOUNT")
	private Integer rechargeAmount;
	
	@OneToMany(targetEntity=DTHRoomDetailsEntity.class, cascade =CascadeType.ALL)
	  @JoinColumn(name = "DTH_DTH_ID", referencedColumnName = "DTH_DETAILS_ID")
	   private List<DTHRoomDetailsEntity> dthRoomDetailsEntities;
	
	public DTHDetailsEntity() {
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

	public List<DTHRoomDetailsEntity> getDthRoomDetailsEntities() {
		return dthRoomDetailsEntities;
	}

	public void setDthRoomDetailsEntities(List<DTHRoomDetailsEntity> dthRoomDetailsEntities) {
		this.dthRoomDetailsEntities = dthRoomDetailsEntities;
	}

	@Override
	public String toString() {
		return "DTHDetailsEntity [dthDetailsId=" + dthDetailsId + ", subscriberId=" + subscriberId + ", startDate="
				+ startDate + ", endDate=" + endDate + ", rechargeAmount=" + rechargeAmount
				+ ", dthRoomDetailsEntities=" + dthRoomDetailsEntities + "]";
	}
	
	

}
