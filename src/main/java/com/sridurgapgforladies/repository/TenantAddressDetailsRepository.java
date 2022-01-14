package com.sridurgapgforladies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sridurgapgforladies.entity.TenantAddressDetailsEntity;

@Repository
public interface TenantAddressDetailsRepository extends JpaRepository<TenantAddressDetailsEntity, Integer> {

}