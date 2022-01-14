package com.sridurgapgforladies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sridurgapgforladies.entity.TenantRoomShareDetailsEntity;


@Repository
public interface TenantRoomShareDetailsRepository extends JpaRepository<TenantRoomShareDetailsEntity, Integer>{

}
