package com.sridurgapgforladies.model;

import javax.persistence.Column;

public class TenantAddressDetailsModel {
	private Integer tenantAddressId;
	private String addressLine1;
	 private String addressLine2;
	 private String addressLine3;
	 private String state;
	 private String district;
	 private Integer pinCode;
	 private Integer tenantTenantAddressId;
	 
	public TenantAddressDetailsModel() {
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
		return "TenantAddressDetailsModel [tenantAddressId=" + tenantAddressId + ", addressLine1=" + addressLine1
				+ ", addressLine2=" + addressLine2 + ", addressLine3=" + addressLine3 + ", state=" + state
				+ ", district=" + district + ", pinCode=" + pinCode + ", tenantTenantAddressId=" + tenantTenantAddressId
				+ "]";
	}

	 
}
