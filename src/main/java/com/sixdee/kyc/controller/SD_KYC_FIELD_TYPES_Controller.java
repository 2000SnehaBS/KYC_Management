package com.sixdee.kyc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sixdee.kyc.entity.SD_KYC_FIELD_MASTER;
import com.sixdee.kyc.entity.SD_KYC_FIELD_TYPES;
import com.sixdee.kyc.repository.SD_KYC_FIELD_TYPES_Repo;
import com.sixdee.kyc.service.SD_KYC_FIELD_TYPES_Service;

@RestController
public class SD_KYC_FIELD_TYPES_Controller {
	
	@Autowired
	private SD_KYC_FIELD_TYPES_Service typesService;
	
	@Autowired
	private SD_KYC_FIELD_TYPES_Repo typesRepo;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,value = "/add_types_details")
    public SD_KYC_FIELD_TYPES insert(@RequestBody SD_KYC_FIELD_TYPES types)
    {
        return typesService.add(types);
    }
	
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,value = "/update_types_details")
    public SD_KYC_FIELD_TYPES update(@RequestBody SD_KYC_FIELD_TYPES types)
    {
        return typesService.update(types);
    }
	@DeleteMapping(value="/delete_types/{id}")
	public String deleteData(@PathVariable int id) {
		return typesService.delete(id);
		
	}
	@GetMapping(value="/get_types_details/{id}")
	public SD_KYC_FIELD_TYPES findById(@PathVariable int id) {
		
		if(typesRepo.findById(id).isPresent()) {
			return typesRepo.findById(id).get();
		}
		else
		return null;
		
	}
	
	@GetMapping(value="/get_all_types_details")
	public List<SD_KYC_FIELD_TYPES> findAllById(){
		return typesRepo.findAll();
		
	}
	

}
