package com.sridurgapgforladies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sridurgapgforladies.entity.TenantFoodPreferenceEntity;

@Repository
public interface TenantFoodPreferenceRepository extends JpaRepository<TenantFoodPreferenceEntity, Integer>{

}
