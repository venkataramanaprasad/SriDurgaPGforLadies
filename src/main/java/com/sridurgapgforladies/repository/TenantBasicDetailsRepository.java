package com.sridurgapgforladies.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sridurgapgforladies.entity.TenantBasicDetailsEntity;
import com.sridurgapgforladies.model.TenantBasicDetailsModel;

@Repository
public interface TenantBasicDetailsRepository extends JpaRepository<TenantBasicDetailsEntity, Integer>{

	TenantBasicDetailsEntity save(TenantBasicDetailsModel tenantBasicDetailsModel);

	Optional<TenantBasicDetailsEntity> findById(Integer inputTenantId);

}
