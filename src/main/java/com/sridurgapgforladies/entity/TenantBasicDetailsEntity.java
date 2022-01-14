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

@Entity(name = "TenantBasicDetailsEntity")
@Table(name = "TENANT_BASIC_DETAILS")
public class TenantBasicDetailsEntity implements Serializable {
	
	private static final long serialVersionUID = 2743246193684523234L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TENANT_ID")
	private Integer tenantId;
	@Column(name = "FULL_NAME")
	private String fullName;
	@Column(name = "MOBILE_NUMBER")
	private Long mobileNumber;
	@Column(name = "DOB")
	private Date dob;
	@Column(name = "AGE")
	private Integer age;
	@Column(name = "FATHER_NAME")
	private String fatherName;
	@Column(name = "EMAIL_ID")
	private String emailId;
	@Column(name = "ADHAR_NUMBER")
	private String adharNumber;
	@Column(name = "EMERGENCY_CONTACT_NUMBER")
	private Long emergencyContactNumber;

	
	  @OneToMany(targetEntity=TenantAddressDetailsEntity.class, cascade =CascadeType.ALL)
	  @JoinColumn(name = "TENANT_TENANT_ADDRESS_ID", referencedColumnName = "TENANT_ID")
	   private List<TenantAddressDetailsEntity> tenantAddressDetailsEntities;
	  
	  @OneToMany(targetEntity=TenantRoomShareDetailsEntity.class, cascade =CascadeType.ALL)
	  @JoinColumn(name = "TENANT_ROOM_ID", referencedColumnName = "TENANT_ID")
	   private List<TenantRoomShareDetailsEntity> tenantRoomShareDetailsEntities;
	  
	  @OneToMany(targetEntity=TenantFoodPreferenceEntity.class, cascade =CascadeType.ALL)
	  @JoinColumn(name = "TENANT_FOOD_ID", referencedColumnName = "TENANT_ID")
	   private List<TenantFoodPreferenceEntity> tenantFoodPreferenceEntities;

	public TenantBasicDetailsEntity() {
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

	public List<TenantAddressDetailsEntity> getTenantAddressDetailsEntities() {
		return tenantAddressDetailsEntities;
	}

	public void setTenantAddressDetailsEntities(List<TenantAddressDetailsEntity> tenantAddressDetailsEntities) {
		this.tenantAddressDetailsEntities = tenantAddressDetailsEntities;
	}

	public List<TenantRoomShareDetailsEntity> getTenantRoomShareDetailsEntities() {
		return tenantRoomShareDetailsEntities;
	}

	public void setTenantRoomShareDetailsEntities(List<TenantRoomShareDetailsEntity> tenantRoomShareDetailsEntities) {
		this.tenantRoomShareDetailsEntities = tenantRoomShareDetailsEntities;
	}

	public List<TenantFoodPreferenceEntity> getTenantFoodPreferenceEntities() {
		return tenantFoodPreferenceEntities;
	}

	public void setTenantFoodPreferenceEntities(List<TenantFoodPreferenceEntity> tenantFoodPreferenceEntities) {
		this.tenantFoodPreferenceEntities = tenantFoodPreferenceEntities;
	}

	@Override
	public String toString() {
		return "TenantBasicDetailsEntity [tenantId=" + tenantId + ", fullName=" + fullName + ", mobileNumber="
				+ mobileNumber + ", dob=" + dob + ", age=" + age + ", fatherName=" + fatherName + ", emailId=" + emailId
				+ ", adharNumber=" + adharNumber + ", emergencyContactNumber=" + emergencyContactNumber
				+ ", tenantAddressDetailsEntities=" + tenantAddressDetailsEntities + ", tenantRoomShareDetailsEntities="
				+ tenantRoomShareDetailsEntities + ", tenantFoodPreferenceEntities=" + tenantFoodPreferenceEntities
				+ "]";
	}

	
}
