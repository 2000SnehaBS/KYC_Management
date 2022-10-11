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

import com.sixdee.kyc.entity.SD_KYC_GROUPS;
import com.sixdee.kyc.repository.SD_KYC_GROUPS_Repo;
import com.sixdee.kyc.service.SD_KYC_GROUPS_Service;

@RestController
public class SD_KYC_GROUPS_Controller {
	
	@Autowired
	SD_KYC_GROUPS_Service groupsService;
	
	@Autowired
	SD_KYC_GROUPS_Repo groupsRepo;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,value = "/add_groups_details")
    public SD_KYC_GROUPS insert(@RequestBody SD_KYC_GROUPS groups)
    {
        return groupsService.add(groups);
    }

	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,value = "/update_groups_details")
    public SD_KYC_GROUPS update(@RequestBody SD_KYC_GROUPS groups)
    {
        return groupsService.update(groups);
    }
	
	@DeleteMapping(value="/delete_groups/{id}")
	public String deleteData(@PathVariable int id) {
		return groupsService.delete(id);
		
	}
	
	@GetMapping(value="/get_groups_details/{fieldId}")
	public SD_KYC_GROUPS findById(@PathVariable int id) {
		
		if(groupsRepo.findById(id).isPresent()) {
			return groupsRepo.findById(id).get();
		}
		else
		return null;
		
	}
	
	@GetMapping(value="/get_all_groups_details")
	public List<SD_KYC_GROUPS> findAllById(){
		return groupsRepo.findAll();
		
	}

}
