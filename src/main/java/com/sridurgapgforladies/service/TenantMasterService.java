package com.sridurgapgforladies.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sridurgapgforladies.model.TenantAddressDetailsModel;
import com.sridurgapgforladies.model.TenantBasicDetailsModel;
import com.sridurgapgforladies.model.TenantFoodPreferenceModel;
import com.sridurgapgforladies.model.TenantRoomShareDetailsModel;
import com.sridurgapgforladies.entity.TenantAddressDetailsEntity;
import com.sridurgapgforladies.entity.TenantBasicDetailsEntity;
import com.sridurgapgforladies.entity.TenantFoodPreferenceEntity;
import com.sridurgapgforladies.entity.TenantRoomShareDetailsEntity;
import com.sridurgapgforladies.exception.ResourceNotFoundException;
import com.sridurgapgforladies.repository.TenantAddressDetailsRepository;
import com.sridurgapgforladies.repository.TenantBasicDetailsRepository;
import com.sridurgapgforladies.repository.TenantFoodPreferenceRepository;
import com.sridurgapgforladies.repository.TenantRoomShareDetailsRepository;

@Service
public class TenantMasterService {

	static final Logger LOGGER = LogManager.getLogger(TenantMasterService.class);
	@Autowired
	TenantBasicDetailsRepository tenantBasicDetailsRepository;
	@Autowired
	TenantAddressDetailsRepository tenantAddressDetailsRepository;

	@Autowired
	TenantRoomShareDetailsRepository tenantRoomShareDetailsRepository;
	@Autowired
	TenantFoodPreferenceRepository tenantFoodPreferenceRepository;

	public TenantBasicDetailsEntity saveTenantBasicDetails(TenantBasicDetailsModel tenantBasicDetailsModel ) throws ResourceNotFoundException {

				LOGGER.info("saveTenantBasicDetails() method called.");
				
					TenantBasicDetailsEntity insertTenantMasterDetails = new TenantBasicDetailsEntity();
					TenantBasicDetailsEntity savedDetails=null;
					insertTenantMasterDetails.setFullName(tenantBasicDetailsModel.getFullName());
					insertTenantMasterDetails.setDob(tenantBasicDetailsModel.getDob());
					insertTenantMasterDetails.setAge(tenantBasicDetailsModel.getAge());
					insertTenantMasterDetails.setAdharNumber(tenantBasicDetailsModel.getAdharNumber());
					insertTenantMasterDetails.setMobileNumber(tenantBasicDetailsModel.getMobileNumber());
					insertTenantMasterDetails.setEmailId(tenantBasicDetailsModel.getEmailId());
					insertTenantMasterDetails.setEmergencyContactNumber(tenantBasicDetailsModel.getEmergencyContactNumber());
					insertTenantMasterDetails.setFatherName(tenantBasicDetailsModel.getFatherName());
					
					List<TenantAddressDetailsModel> tenantAddress= tenantBasicDetailsModel.getTenantAddressDetailsModels();
					List<TenantAddressDetailsEntity> tenantAddressDetailsEntities= new ArrayList<>();
					for(TenantAddressDetailsModel tenantAddressDetails: tenantAddress) {
						TenantAddressDetailsEntity tenantAddressDetailsEntity= new TenantAddressDetailsEntity();
						tenantAddressDetailsEntity.setAddressLine1(tenantAddressDetails.getAddressLine1());
						tenantAddressDetailsEntity.setAddressLine2(tenantAddressDetails.getAddressLine2());
						tenantAddressDetailsEntity.setAddressLine3(tenantAddressDetails.getAddressLine3());
						tenantAddressDetailsEntity.setState(tenantAddressDetails.getState());
						tenantAddressDetailsEntity.setDistrict(tenantAddressDetails.getDistrict());
						tenantAddressDetailsEntity.setPinCode(tenantAddressDetails.getPinCode());
						tenantAddressDetailsEntity.setTenantTenantAddressId(tenantAddressDetails.getTenantTenantAddressId());
						tenantAddressDetailsEntities.add(tenantAddressDetailsEntity);
					}
					insertTenantMasterDetails.setTenantAddressDetailsEntities(tenantAddressDetailsEntities);
					
					List<TenantRoomShareDetailsModel> tenantRoom= tenantBasicDetailsModel.getTenantRoomShareDetailsModels();
					List<TenantRoomShareDetailsEntity> tenantRoomShareDetailsEntities= new ArrayList<>();
					for(TenantRoomShareDetailsModel tenantRoomDetails: tenantRoom) {
						TenantRoomShareDetailsEntity tenantRoomShareDetailsEntity= new TenantRoomShareDetailsEntity();
						tenantRoomShareDetailsEntity.setAdmissionDate(tenantRoomDetails.getAdmissionDate());
						tenantRoomShareDetailsEntity.setAdvanceAmount(tenantRoomDetails.getAdvanceAmount());
						tenantRoomShareDetailsEntity.setRentAmount(tenantRoomDetails.getRentAmount());
						tenantRoomShareDetailsEntity.setMaintenanceCharges(tenantRoomDetails.getMaintenanceCharges());
						tenantRoomShareDetailsEntity.setRoomNumber(tenantRoomDetails.getRoomNumber());
						tenantRoomShareDetailsEntity.setShareType(tenantRoomDetails.getShareType());
						tenantRoomShareDetailsEntity.setTenantRoomId(tenantRoomDetails.getTenantRoomId());
						tenantRoomShareDetailsEntities.add(tenantRoomShareDetailsEntity);
					}
					insertTenantMasterDetails.setTenantRoomShareDetailsEntities(tenantRoomShareDetailsEntities);
					
					List<TenantFoodPreferenceModel> tenantFood= tenantBasicDetailsModel.getTenantFoodPreferenceModels();
					List<TenantFoodPreferenceEntity> tenantFoodPreferenceEntities= new ArrayList<>();
					for(TenantFoodPreferenceModel tenantFoodDetails: tenantFood) {
						TenantFoodPreferenceEntity tenantFoodPreferenceEntity= new TenantFoodPreferenceEntity();
						tenantFoodPreferenceEntity.setVeg(tenantFoodDetails.getVeg());
						tenantFoodPreferenceEntity.setMushroom(tenantFoodDetails.getMushroom());
						tenantFoodPreferenceEntity.setEgg(tenantFoodDetails.getEgg());
						tenantFoodPreferenceEntity.setChicken(tenantFoodDetails.getChicken());
						tenantFoodPreferenceEntity.setTenantFoodId(tenantFoodDetails.getTenantFoodId());
						tenantFoodPreferenceEntities.add(tenantFoodPreferenceEntity);
					}
				
					insertTenantMasterDetails.setTenantFoodPreferenceEntities(tenantFoodPreferenceEntities);
				
					
					savedDetails= tenantBasicDetailsRepository.save(insertTenantMasterDetails);
				
				
					return savedDetails;			
	}

	public TenantBasicDetailsEntity updateTenantMaster(TenantBasicDetailsModel tenantBasicDetailsModel) {
		LOGGER.info("saveTenantBasicDetails() method called.");
		TenantBasicDetailsEntity savedDetails=null;
		Integer inputTenantId = tenantBasicDetailsModel.getTenantId();

		if (inputTenantId != 0) {

			TenantBasicDetailsEntity existingTenantDetails = tenantBasicDetailsRepository.findById(inputTenantId)
					.orElseThrow(
							() -> new ResourceNotFoundException("Tenant Details not found for this id :: "
									+ tenantBasicDetailsModel.getTenantId()));
		
		TenantBasicDetailsEntity insertTenantMasterDetails = new TenantBasicDetailsEntity();
		
		insertTenantMasterDetails.setTenantId(existingTenantDetails.getTenantId());
		insertTenantMasterDetails.setFullName(tenantBasicDetailsModel.getFullName());
		insertTenantMasterDetails.setDob(tenantBasicDetailsModel.getDob());
		insertTenantMasterDetails.setAge(tenantBasicDetailsModel.getAge());
		insertTenantMasterDetails.setAdharNumber(tenantBasicDetailsModel.getAdharNumber());
		insertTenantMasterDetails.setMobileNumber(tenantBasicDetailsModel.getMobileNumber());
		insertTenantMasterDetails.setEmailId(tenantBasicDetailsModel.getEmailId());
		insertTenantMasterDetails.setEmergencyContactNumber(tenantBasicDetailsModel.getEmergencyContactNumber());
		insertTenantMasterDetails.setFatherName(tenantBasicDetailsModel.getFatherName());
		
		List<TenantAddressDetailsModel> tenantAddress= tenantBasicDetailsModel.getTenantAddressDetailsModels();
		List<TenantAddressDetailsEntity> tenantAddressDetailsEntities= new ArrayList<>();
		for(TenantAddressDetailsModel tenantAddressDetails: tenantAddress) {
			TenantAddressDetailsEntity tenantAddressDetailsEntity= new TenantAddressDetailsEntity();
			tenantAddressDetailsEntity.setAddressLine1(tenantAddressDetails.getAddressLine1());
			tenantAddressDetailsEntity.setAddressLine2(tenantAddressDetails.getAddressLine2());
			tenantAddressDetailsEntity.setAddressLine3(tenantAddressDetails.getAddressLine3());
			tenantAddressDetailsEntity.setState(tenantAddressDetails.getState());
			tenantAddressDetailsEntity.setDistrict(tenantAddressDetails.getDistrict());
			tenantAddressDetailsEntity.setPinCode(tenantAddressDetails.getPinCode());
			tenantAddressDetailsEntity.setTenantTenantAddressId(tenantAddressDetails.getTenantTenantAddressId());
			tenantAddressDetailsEntities.add(tenantAddressDetailsEntity);
		}
		insertTenantMasterDetails.setTenantAddressDetailsEntities(tenantAddressDetailsEntities);
		
		List<TenantRoomShareDetailsModel> tenantRoom= tenantBasicDetailsModel.getTenantRoomShareDetailsModels();
		List<TenantRoomShareDetailsEntity> tenantRoomShareDetailsEntities= new ArrayList<>();
		for(TenantRoomShareDetailsModel tenantRoomDetails: tenantRoom) {
			TenantRoomShareDetailsEntity tenantRoomShareDetailsEntity= new TenantRoomShareDetailsEntity();
			tenantRoomShareDetailsEntity.setAdmissionDate(tenantRoomDetails.getAdmissionDate());
			tenantRoomShareDetailsEntity.setAdvanceAmount(tenantRoomDetails.getAdvanceAmount());
			tenantRoomShareDetailsEntity.setRentAmount(tenantRoomDetails.getRentAmount());
			tenantRoomShareDetailsEntity.setMaintenanceCharges(tenantRoomDetails.getMaintenanceCharges());
			tenantRoomShareDetailsEntity.setRoomNumber(tenantRoomDetails.getRoomNumber());
			tenantRoomShareDetailsEntity.setShareType(tenantRoomDetails.getShareType());
			tenantRoomShareDetailsEntity.setTenantRoomId(tenantRoomDetails.getTenantRoomId());
			tenantRoomShareDetailsEntities.add(tenantRoomShareDetailsEntity);
		}
		insertTenantMasterDetails.setTenantRoomShareDetailsEntities(tenantRoomShareDetailsEntities);
		
		List<TenantFoodPreferenceModel> tenantFood= tenantBasicDetailsModel.getTenantFoodPreferenceModels();
		List<TenantFoodPreferenceEntity> tenantFoodPreferenceEntities= new ArrayList<>();
		for(TenantFoodPreferenceModel tenantFoodDetails: tenantFood) {
			TenantFoodPreferenceEntity tenantFoodPreferenceEntity= new TenantFoodPreferenceEntity();
			tenantFoodPreferenceEntity.setVeg(tenantFoodDetails.getVeg());
			tenantFoodPreferenceEntity.setMushroom(tenantFoodDetails.getMushroom());
			tenantFoodPreferenceEntity.setEgg(tenantFoodDetails.getEgg());
			tenantFoodPreferenceEntity.setChicken(tenantFoodDetails.getChicken());
			tenantFoodPreferenceEntity.setTenantFoodId(tenantFoodDetails.getTenantFoodId());
			tenantFoodPreferenceEntities.add(tenantFoodPreferenceEntity);
		}
	
		insertTenantMasterDetails.setTenantFoodPreferenceEntities(tenantFoodPreferenceEntities);
	
		
		savedDetails= tenantBasicDetailsRepository.save(insertTenantMasterDetails);
		
		}
		return savedDetails;
	}

	public List<TenantBasicDetailsEntity> getAllTenantDetails() throws ResourceNotFoundException {
			

			LOGGER.info("getAllTenantDetails() method called.");
			List<TenantBasicDetailsEntity> tenantDetails = null;
			try {
				tenantDetails = tenantBasicDetailsRepository.findAll();
			} catch (Exception e) {
				LOGGER.error("Errors occurs while in retrieving data due to " + e.getMessage());

			}
			return tenantDetails;

	}
}
