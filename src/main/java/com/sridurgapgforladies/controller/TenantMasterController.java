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
import org.springframework.web.bind.annotation.RestController;
import com.sridurgapgforladies.entity.TenantBasicDetailsEntity;
import com.sridurgapgforladies.model.TenantBasicDetailsModel;
import com.sridurgapgforladies.service.TenantMasterService;

@RestController
@RequestMapping("/sriDurgaPGforLadies/tenant/tenantMaster")
public class TenantMasterController {
		
		@Autowired

		public TenantMasterService tenantMasterService;

		@PostMapping(value = "/saveTenantMasterDetails", produces = "application/json")
		public ResponseEntity<Map<String, Object>> insertBankMaster(@RequestBody TenantBasicDetailsModel tenantBasicDetailsModel)
				throws Exception, NullPointerException {
			Map<String, Object> response = new HashMap<>();

			TenantBasicDetailsEntity insertTenantMasterDetails = tenantMasterService.saveTenantBasicDetails(tenantBasicDetailsModel);
			response.put("insertTenantMasterDetails", insertTenantMasterDetails);

			return ResponseEntity.accepted().body(response);

		}

		@PutMapping(value = "/updateTenantMasterDetails", produces = "application/json")
		public ResponseEntity<Map<String, Object>> updateTenantMaster(@RequestBody TenantBasicDetailsModel tenantBasicDetailsModel)
				throws NullPointerException {
			Map<String, Object> response = new HashMap<>();

			TenantBasicDetailsEntity updatedtenantMasterDetails = tenantMasterService.updateTenantMaster(tenantBasicDetailsModel);
			response.put("updatedtenantMasterDetails", updatedtenantMasterDetails);

			return ResponseEntity.accepted().body(response);

		}
		
		@GetMapping(value = "/getAllTenantDetails", produces = "application/json")
		public ResponseEntity<Map<String, Object>> getAllTenantDetails() throws Exception {
			Map<String, Object> response = new HashMap<>();

			List<TenantBasicDetailsEntity> tenantDetails = tenantMasterService.getAllTenantDetails();
			response.put("tenantDetails", tenantDetails);
			return ResponseEntity.accepted().body(response);

		}
		/*
		 * @GetMapping(value = "/getByBankAccountTypeCode/{code}", produces =
		 * "application/json") public ResponseEntity<Map<String, Object>>
		 * getByBankAccountTypeCode(@PathVariable String code) throws Exception {
		 * Map<String, Object> response = new HashMap<>();
		 * 
		 * List<BankAccountTypeMasterEntity> detailsByCode =
		 * bankAccountTypeMasterService .getAllByCode(code);
		 * 
		 * response.put("detailsByCode", detailsByCode); return
		 * ResponseEntity.accepted().body(response);
		 * 
		 * }
		 * 
		 * @GetMapping(value = "/getByBankAccountTypeDescription/{description}",
		 * produces = "application/json") public ResponseEntity<Map<String, Object>>
		 * getByBankAccountTypeDescription(@PathVariable String description) throws
		 * Exception { Map<String, Object> response = new HashMap<>();
		 * 
		 * List<BankAccountTypeMasterEntity> detailsByDescription =
		 * bankAccountTypeMasterService .getAllByDescription(description);
		 * 
		 * response.put("detailsByDescription", detailsByDescription); return
		 * ResponseEntity.accepted().body(response);
		 * 
		 * }
		 * 
		 * 
		 * 
		 * @DeleteMapping(value =
		 * "/deleteBankAccountTypeMasterDetails/{bankAccountTypeMasterId}") public void
		 * deleteBankAccountTypeDetails(@PathVariable long bankAccountTypeMasterId) {
		 * 
		 * bankAccountTypeMasterService.delete(bankAccountTypeMasterId);
		 * 
		 * }
		 * 
		 * @GetMapping(value = "/getByBankAccountTypeStatus/{status}", produces =
		 * "application/json") public ResponseEntity<Map<String, Object>>
		 * getByBankAccountTypeStatus(@PathVariable char status) throws Exception {
		 * Map<String, Object> response = new HashMap<>();
		 * 
		 * List<BankAccountTypeMasterEntity> detailsByStatus =
		 * bankAccountTypeMasterService .getAllByStatus(status);
		 * 
		 * response.put("detailsByStatus", detailsByStatus); return
		 * ResponseEntity.accepted().body(response);
		 * 
		 * }
		 * 
		 * @GetMapping(value =
		 * "/getByBankAccountTypeCodeAndDescription{code}/{description}", produces =
		 * "application/json") public ResponseEntity<Map<String, Object>>
		 * getByBankAccountTypeCodeAndDescription(@PathVariable String
		 * code, @PathVariable String description) throws ResourceNotFoundException {
		 * Map<String, Object> response = new HashMap<>();
		 * List<BankAccountTypeMasterEntity> detailsBycodeAndDescription =
		 * bankAccountTypeMasterService.getAllByCodeAndDescription(code,description); if
		 * (detailsBycodeAndDescription.isEmpty()) { throw new
		 * ResourceNotFoundException("Details not Found for This Id"); } else {
		 * response.put("detailsByDenominationTypeAndDescription",
		 * detailsBycodeAndDescription); return
		 * ResponseEntity.accepted().body(response);
		 * 
		 * } }
		 * 
		 */

}
