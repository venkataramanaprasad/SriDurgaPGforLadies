package com.sridurgapgforladies.model;

import java.util.Date;
import java.util.List;

public class TenantBasicDetailsModel {
	private Integer tenantId;
	private String fullName;
	private Long mobileNumber;
	private Date dob;
	private Integer age;
	private String fatherName;
	private String emailId;
	private String adharNumber;
	private Long emergencyContactNumber;

	private List<TenantAddressDetailsModel> tenantAddressDetailsModels;
	private List<TenantRoomShareDetailsModel> tenantRoomShareDetailsModels;
	private List<TenantFoodPreferenceModel> tenantFoodPreferenceModels;
	public TenantBasicDetailsModel() {
		super();
	}
	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAdharNumber() {
		return adharNumber;
	}
	public void setAdharNumber(String adharNumber) {
		this.adharNumber = adharNumber;
	}
	public Long getEmergencyContactNumber() {
		return emergencyContactNumber;
	}
	public void setEmergencyContactNumber(Long emergencyContactNumber) {
		this.emergencyContactNumber = emergencyContactNumber;
	}
	public List<TenantAddressDetailsModel> getTenantAddressDetailsModels() {
		return tenantAddressDetailsModels;
	}
	public void setTenantAddressDetailsModels(List<TenantAddressDetailsModel> tenantAddressDetailsModels) {
		this.tenantAddressDetailsModels = tenantAddressDetailsModels;
	}
	public List<TenantRoomShareDetailsModel> getTenantRoomShareDetailsModels() {
		return tenantRoomShareDetailsModels;
	}
	public void setTenantRoomShareDetailsModels(List<TenantRoomShareDetailsModel> tenantRoomShareDetailsModels) {
		this.tenantRoomShareDetailsModels = tenantRoomShareDetailsModels;
	}
	public List<TenantFoodPreferenceModel> getTenantFoodPreferenceModels() {
		return tenantFoodPreferenceModels;
	}
	public void setTenantFoodPreferenceModels(List<TenantFoodPreferenceModel> tenantFoodPreferenceModels) {
		this.tenantFoodPreferenceModels = tenantFoodPreferenceModels;
	}
	@Override
	public String toString() {
		return "TenantBasicDetailsModel [tenantId=" + tenantId + ", fullName=" + fullName + ", mobileNumber="
				+ mobileNumber + ", dob=" + dob + ", age=" + age + ", fatherName=" + fatherName + ", emailId=" + emailId
				+ ", adharNumber=" + adharNumber + ", emergencyContactNumber=" + emergencyContactNumber
				+ ", tenantAddressDetailsModels=" + tenantAddressDetailsModels + ", tenantRoomShareDetailsModels="
				+ tenantRoomShareDetailsModels + ", tenantFoodPreferenceModels=" + tenantFoodPreferenceModels + "]";
	}
	
	
}
