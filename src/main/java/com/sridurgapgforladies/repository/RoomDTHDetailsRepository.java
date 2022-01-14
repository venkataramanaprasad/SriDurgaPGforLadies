package com.sridurgapgforladies.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sridurgapgforladies.entity.RoomDTHDetailsEntity;

public interface RoomDTHDetailsRepository extends JpaRepository<RoomDTHDetailsEntity, Integer> {

	List<RoomDTHDetailsEntity> findBySubscriberId(Integer subscriberId);

}
