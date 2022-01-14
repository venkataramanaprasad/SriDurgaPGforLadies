package com.sridurgapgforladies.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sridurgapgforladies.entity.DTHDetailsEntity;
import com.sridurgapgforladies.entity.TenantBasicDetailsEntity;
import com.sridurgapgforladies.model.DTHDetailsModel;
import com.sridurgapgforladies.model.RoomDTHDetailsModel;
import com.sridurgapgforladies.model.TenantBasicDetailsModel;
import com.sridurgapgforladies.service.DTHService;

@RestController
@RequestMapping("/sriDurgaPGforLadies/Room/DTHMaster")
public class DTHController {

	@Autowired

	public DTHService dthService;

	@PostMapping(value = "/saveDTHDetails", produces = "application/json")
	public ResponseEntity<Map<String, Object>> insertDTHDetails(@RequestBody DTHDetailsModel dthDetailsModel)
			throws Exception, NullPointerException {
		Map<String, Object> response = new HashMap<>();

		DTHDetailsEntity insertDTHDetails = dthService.insertDTHDetails(dthDetailsModel);
		response.put("insertDTHDetails", insertDTHDetails);

		return ResponseEntity.accepted().body(response);

	}
	@PutMapping(value = "/updateDTHDetails", produces = "application/json")
	public ResponseEntity<Map<String, Object>> updateDTHDetails(@RequestBody DTHDetailsModel dthDetailsModel)
			throws NullPointerException {
		Map<String, Object> response = new HashMap<>();

		DTHDetailsEntity updateDTHDetails = dthService.updateDTHDetails(dthDetailsModel);
		response.put("updateDTHDetails", updateDTHDetails);

		return ResponseEntity.accepted().body(response);

	}
	
	@GetMapping(value = "/getAllDTHDetails", produces = "application/json")
	public ResponseEntity<Map<String, Object>> getAllDTHDetails() throws Exception {
		Map<String, Object> response = new HashMap<>();

		List<DTHDetailsEntity> dthDetails = dthService.getAllDTHDetails();
		response.put("dthDetails", dthDetails);
		return ResponseEntity.accepted().body(response);

	}
	@GetMapping(value = "/getTotalDTHAmount", produces = "application/json")
	public ResponseEntity<Map<String, Object>> getTotalDTHAmount() throws Exception {
		Map<String, Object> response = new HashMap<>();

		List<DTHDetailsEntity> dthDetails = dthService.getTotalDTHAmount();
		response.put("dthDetails", dthDetails);
		return ResponseEntity.accepted().body(response);

	}
	//OmNamo
}
