package com.sridurgapgforladies.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TENANT_ROOM_SHARE_DETAILS")
public class TenantRoomShareDetailsEntity implements Serializable{

	private static final long serialVersionUID = 6875889842364088341L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="TENANT_ROOM_SHARE_ID")
	private Integer tenantRoomShareId;
	@Column(name="SHARE_TYPE")
	private Integer shareType;
	 @Column(name="ROOM_NUMBER")
	 private Integer roomNumber;
	 @Column(name="ADMISSION_DATE")
	 private Date admissionDate;
	 @Column(name="ADVANCE_AMOUNT")
	 private Double advanceAmount;
	 @Column(name="RENT_AMOUNT")
	 private Double rentAmount;
	 @Column(name="MAINTENANCE_CHARGES")
	 private Double maintenanceCharges;
	 @Column(name="TENANT_ROOM_ID")
	 private Integer tenantRoomId;
	 
	public TenantRoomShareDetailsEntity() {
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
		return "TenantRoomShareDetailsEntity [tenantRoomShareId=" + tenantRoomShareId + ", shareType=" + shareType
				+ ", roomNumber=" + roomNumber + ", admissionDate=" + admissionDate + ", advanceAmount=" + advanceAmount
				+ ", rentAmount=" + rentAmount + ", maintenanceCharges=" + maintenanceCharges + ", tenantRoomId="
				+ tenantRoomId + "]";
	}

	
	 
	 

}
