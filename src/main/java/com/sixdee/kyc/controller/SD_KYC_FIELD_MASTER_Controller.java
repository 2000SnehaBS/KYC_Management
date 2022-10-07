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
import com.sixdee.kyc.repository.SD_KYC_FIELD_MASTER_Repo;
import com.sixdee.kyc.service.SD_KYC_FIELD_MASTER_Service;

@RestController
public class SD_KYC_FIELD_MASTER_Controller {
	
	@Autowired
	SD_KYC_FIELD_MASTER_Service service;
	
	@Autowired
	SD_KYC_FIELD_MASTER_Repo repo;
	
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,value = "/adddetails")
    public SD_KYC_FIELD_MASTER insert(@RequestBody SD_KYC_FIELD_MASTER master)
    {
        return service.add(master);
    }
	
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,value = "/updatedetails")
    public SD_KYC_FIELD_MASTER update(@RequestBody SD_KYC_FIELD_MASTER master)
    {
        return service.update(master);
    }
	
	@DeleteMapping(value="/delete/{fieldId}")
	public String deleteData(@PathVariable int fieldId) {
		return service.delete(fieldId);
		
	}
	
	@GetMapping(value="/getdetails/{fieldId}")
	public SD_KYC_FIELD_MASTER findById(@PathVariable int fieldId) {
		
		if(repo.findById(fieldId).isPresent()) {
			return repo.findById(fieldId).get();
		}
		else
		return null;
		
	}
	
	@GetMapping(value="/getdetails")
	public List<SD_KYC_FIELD_MASTER> findAllById(){
		return repo.findAll();
		
	}

}
