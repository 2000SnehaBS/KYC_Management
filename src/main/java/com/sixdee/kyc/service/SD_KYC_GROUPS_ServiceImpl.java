package com.sixdee.kyc.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sixdee.kyc.entity.SD_KYC_GROUPS;
import com.sixdee.kyc.repository.SD_KYC_GROUPS_Repo;

@Service
@Transactional
public class SD_KYC_GROUPS_ServiceImpl implements SD_KYC_GROUPS_Service {
	
	@Autowired
	private SD_KYC_GROUPS_Repo groupsRepo;

	@Override
	public SD_KYC_GROUPS add(SD_KYC_GROUPS groups) {
		SD_KYC_GROUPS gs = new SD_KYC_GROUPS();
		gs.setGroupName(groups.getGroupName());
		gs.setLabel(groups.getLabel());
		gs.setGroupOrder(groups.getGroupOrder());
		gs.setParent(groups.getParent());
		return groupsRepo.save(gs);
	}

	/*@Override
	public String delete(int id) {
		groupsRepo.deleteById(id);
		return "Data Deleted" + id;
		
	}*/

}
