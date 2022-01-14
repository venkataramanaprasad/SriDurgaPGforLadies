package com.sridurgapgforladies.model;

import javax.persistence.Column;

public class TenantFoodPreferenceModel {
	private Integer tenantFoodPreferenceId;
	private String veg;
	private String egg;
	private String chicken;
	private String mushroom;
	private Integer tenantFoodId;
	
	public TenantFoodPreferenceModel() {
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
		return "TenantFoodPreferenceModel [tenantFoodPreferenceId=" + tenantFoodPreferenceId + ", veg=" + veg + ", egg="
				+ egg + ", chicken=" + chicken + ", mushroom=" + mushroom + ", tenantFoodId=" + tenantFoodId + "]";
	}
	
	
}
