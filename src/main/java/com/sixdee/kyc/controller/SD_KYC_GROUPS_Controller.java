package com.sixdee.kyc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sixdee.kyc.entity.SD_KYC_GROUPS;
import com.sixdee.kyc.service.SD_KYC_GROUPS_Service;

@RestController
public class SD_KYC_GROUPS_Controller {
	
	@Autowired
	SD_KYC_GROUPS_Service groupsService;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,value = "/add_groups_details")
    public SD_KYC_GROUPS insert(@RequestBody SD_KYC_GROUPS groups)
    {
        return groupsService.add(groups);
    }
	/*@DeleteMapping(value="/delete_groups/{id}")
	public String deleteData(@PathVariable int id) {
		return groupsService.delete(id);
		
	}*/

}
