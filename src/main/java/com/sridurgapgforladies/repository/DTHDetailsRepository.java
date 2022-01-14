package com.sridurgapgforladies.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sridurgapgforladies.entity.DTHDetailsEntity;

public interface DTHDetailsRepository extends JpaRepository<DTHDetailsEntity, Integer> {

	@Query(value="SELECT SUM(RECHARGE_AMOUNT) FROM DTH_DETAILS", nativeQuery = true)
	List<DTHDetailsEntity> getTotalDTHAmount();

}
