package com.sridurgapgforladies.model;

import java.util.Date;

public class TenantRoomShareDetailsModel {

	private Integer tenantRoomShareId;
	private Integer shareType;
	 private Integer roomNumber;
	 private Date admissionDate;
	 private Double advanceAmount;
	 private Double rentAmount;
	 private Double maintenanceCharges;
	 private Integer tenantRoomId;
	 
	public TenantRoomShareDetailsModel() {
		super();
	}

	public Integer getTenantRoomShareId() {
		return tenantRoomShareId;
	}

	public void setTenantRoomShareId(Integer tenantRoomShareId) {
		this.tenantRoomShareId = tenantRoomShareId;
	}

	public Integer getShareType() {
		return shareType;
	}

	public void setShareType(Integer shareType) {
		this.shareType = shareType;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	public Double getAdvanceAmount() {
		return advanceAmount;
	}

	public void setAdvanceAmount(Double advanceAmount) {
		this.advanceAmount = advanceAmount;
	}

	public Double getRentAmount() {
		return rentAmount;
	}

	public void setRentAmount(Double rentAmount) {
		this.rentAmount = rentAmount;
	}

	public Double getMaintenanceCharges() {
		return maintenanceCharges;
	}

	public void setMaintenanceCharges(Double maintenanceCharges) {
		this.maintenanceCharges = maintenanceCharges;
	}

	public Integer getTenantRoomId() {
		return tenantRoomId;
	}

	public void setTenantRoomId(Integer tenantRoomId) {
		this.tenantRoomId = tenantRoomId;
	}

	@Override
	public String toString() {
		return "TenantRoomShareDetailsModel [tenantRoomShareId=" + tenantRoomShareId + ", shareType=" + shareType
				+ ", roomNumber=" + roomNumber + ", admissionDate=" + admissionDate + ", advanceAmount=" + advanceAmount
				+ ", rentAmount=" + rentAmount + ", maintenanceCharges=" + maintenanceCharges + ", tenantRoomId="
				+ tenantRoomId + "]";
	}
	 
	 
}
