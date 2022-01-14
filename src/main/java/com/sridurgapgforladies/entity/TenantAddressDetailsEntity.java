package com.sridurgapgforladies.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name="TenantAddressDetailsEntity")
@Table(name="TENANT_ADDRESS_DETAILS")
public class TenantAddressDetailsEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="TENANT_ADDRESS_ID")
	private Integer tenantAddressId;
	@Column(name="ADDRESS_LINE1")
	private String addressLine1;
	 @Column(name="ADDRESS_LINE2")
	 private String addressLine2;
	 @Column(name="ADDRESS_LINE3")
	 private String addressLine3;
	 @Column(name="STATE")
	 private String state;
	 @Column(name="DISTRICT")
	 private String district;
	 @Column(name="PINCODE")
	 private Integer pinCode;
	 @Column(name="TENANT_TENANT_ADDRESS_ID")
	 private Integer tenantTenantAddressId;
	 
	public TenantAddressDetailsEntity() {
		super();
	}

	public Integer getTenantAddressId() {
		return tenantAddressId;
	}

	public void setTenantAddressId(Integer tenantAddressId) {
		this.tenantAddressId = tenantAddressId;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public Integer getPinCode() {
		return pinCode;
	}

	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}

	public Integer getTenantTenantAddressId() {
		return tenantTenantAddressId;
	}

	public void setTenantTenantAddressId(Integer tenantTenantAddressId) {
		this.tenantTenantAddressId = tenantTenantAddressId;
	}

	@Override
	public String toString() {
		return "TenantAddressDetailsEntity [tenantAddressId=" + tenantAddressId + ", addressLine1=" + addressLine1
				+ ", addressLine2=" + addressLine2 + ", addressLine3=" + addressLine3 + ", state=" + state
				+ ", district=" + district + ", pinCode=" + pinCode + ", tenantTenantAddressId=" + tenantTenantAddressId
				+ "]";
	}
	
}
