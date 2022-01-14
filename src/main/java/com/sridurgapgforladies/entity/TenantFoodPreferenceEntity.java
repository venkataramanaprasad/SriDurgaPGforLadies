package com.sridurgapgforladies.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="TENANT_FOOD_PREFERENCE")
public class TenantFoodPreferenceEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TENANT_FOOD_PREFERENCE_ID")
	private Integer tenantFoodPreferenceId;
	@Column(name = "VEG")
	private String veg;
	@Column(name = "EGG")
	private String egg;
	@Column(name = "CHICKEN")
	private String chicken;
	@Column(name = "MUSHROOM")
	private String mushroom;
	@Column(name = "TENANT_FOOD_ID")
	private Integer tenantFoodId;
	
	public TenantFoodPreferenceEntity() {
		super();
	}

	public Integer getTenantFoodPreferenceId() {
		return tenantFoodPreferenceId;
	}

	public void setTenantFoodPreferenceId(Integer tenantFoodPreferenceId) {
		this.tenantFoodPreferenceId = tenantFoodPreferenceId;
	}

	public String getVeg() {
		return veg;
	}

	public void setVeg(String veg) {
		this.veg = veg;
	}

	public String getEgg() {
		return egg;
	}

	public void setEgg(String egg) {
		this.egg = egg;
	}

	public String getChicken() {
		return chicken;
	}

	public void setChicken(String chicken) {
		this.chicken = chicken;
	}

	public String getMushroom() {
		return mushroom;
	}

	public void setMushroom(String mushroom) {
		this.mushroom = mushroom;
	}

	public Integer getTenantFoodId() {
		return tenantFoodId;
	}

	public void setTenantFoodId(Integer tenantFoodId) {
		this.tenantFoodId = tenantFoodId;
	}

	@Override
	public String toString() {
		return "TenantFoodPreferenceEntity [tenantFoodPreferenceId=" + tenantFoodPreferenceId + ", veg=" + veg
				+ ", egg=" + egg + ", chicken=" + chicken + ", mushroom=" + mushroom + ", tenantFoodId=" + tenantFoodId
				+ "]";
	}

	
}
