package com.sridurgapgforladies.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sridurgapgforladies.entity.DTHDetailsEntity;
import com.sridurgapgforladies.entity.DTHRoomDetailsEntity;
import com.sridurgapgforladies.exception.ResourceNotFoundException;
import com.sridurgapgforladies.model.DTHDetailsModel;
import com.sridurgapgforladies.model.DTHRoomDetailsModel;
import com.sridurgapgforladies.repository.DTHDetailsRepository;

@Service
public class DTHService {
	
	static final Logger LOGGER = LogManager.getLogger(DTHService.class);
	
	@Autowired
	DTHDetailsRepository dthDetailsRepository;

	public DTHDetailsEntity insertDTHDetails(DTHDetailsModel dthDetailsModel) {
		LOGGER.info("insertDTHDetails() method called");
		
		DTHDetailsEntity insertDTHDetails = new DTHDetailsEntity();
		DTHDetailsEntity savedDetails=null;
		insertDTHDetails.setSubscriberId(dthDetailsModel.getSubscriberId());
		insertDTHDetails.setStartDate(dthDetailsModel.getStartDate());
		insertDTHDetails.setEndDate(dthDetailsModel.getEndDate());
		insertDTHDetails.setRechargeAmount(dthDetailsModel.getRechargeAmount());
		
		List<DTHRoomDetailsModel> dth= dthDetailsModel.getDthRoomDetailsModels();
		List<DTHRoomDetailsEntity> dthRoomDetailsEntities= new ArrayList<>();
		for(DTHRoomDetailsModel dthDetails: dth) {
			DTHRoomDetailsEntity dthRoomDetailsEntity= new DTHRoomDetailsEntity();
			dthRoomDetailsEntity.setRoomNo(dthDetails.getRoomNo());
			dthRoomDetailsEntity.setBoxId(dthDetails.getBoxId());
			dthRoomDetailsEntity.setDthDTHId(dthDetails.getDthDTHId());
			dthRoomDetailsEntities.add(dthRoomDetailsEntity);
		}
		insertDTHDetails.setDthRoomDetailsEntities(dthRoomDetailsEntities);
		
		savedDetails=dthDetailsRepository.save(insertDTHDetails);
		return savedDetails;
		
	}

	public DTHDetailsEntity updateDTHDetails(DTHDetailsModel dthDetailsModel)  throws ResourceNotFoundException{
			 
			LOGGER.info("updateDTHDetails() method called.");
			DTHDetailsEntity savedDetails=null;
			Integer inputDTHDetailsId=dthDetailsModel.getDthDetailsId();
			DTHDetailsEntity updateDTHDetails = dthDetailsRepository
					.findById(inputDTHDetailsId).orElseThrow(() -> new ResourceNotFoundException(
							"DTHDetailsId not found for this id :: " + dthDetailsModel.getDthDetailsId()));
		
			updateDTHDetails.setSubscriberId(dthDetailsModel.getSubscriberId());
			updateDTHDetails.setStartDate(dthDetailsModel.getStartDate());
			updateDTHDetails.setEndDate(dthDetailsModel.getEndDate());
			updateDTHDetails.setRechargeAmount(dthDetailsModel.getRechargeAmount());
			
			List<DTHRoomDetailsModel> dth= dthDetailsModel.getDthRoomDetailsModels();
			List<DTHRoomDetailsEntity> dthRoomDetailsEntities= new ArrayList<>();
			for(DTHRoomDetailsModel dthDetails: dth) {
				DTHRoomDetailsEntity dthRoomDetailsEntity= new DTHRoomDetailsEntity();
				dthRoomDetailsEntity.setRoomNo(dthDetails.getRoomNo());
				dthRoomDetailsEntity.setBoxId(dthDetails.getBoxId());
				dthRoomDetailsEntity.setDthRoomDetailsId(dthDetails.getDthDTHId());
				
				dthRoomDetailsEntities.add(dthRoomDetailsEntity);
			}
			
			savedDetails=dthDetailsRepository.save(updateDTHDetails);
			return savedDetails;
}

	public List<DTHDetailsEntity> getAllDTHDetails() throws ResourceNotFoundException {
		

		LOGGER.info("getAllDTHDetails() method called.");
		List<DTHDetailsEntity> dthDetails = null;
		try {
			dthDetails = dthDetailsRepository.findAll();
		} catch (Exception e) {
			LOGGER.error("Errors occurs while in retrieving data due to " + e.getMessage());

		}
		return dthDetails;
	}
public List<DTHDetailsEntity> getTotalDTHAmount() throws ResourceNotFoundException {
		

		LOGGER.info("getTotalDTHAmount() method called.");
		List<DTHDetailsEntity> dthDetails = null;
		try {
			dthDetails = dthDetailsRepository.getTotalDTHAmount();
		} catch (Exception e) {
			LOGGER.error("Errors occurs while in retrieving data due to " + e.getMessage());

		}
		return dthDetails;
	}
}
