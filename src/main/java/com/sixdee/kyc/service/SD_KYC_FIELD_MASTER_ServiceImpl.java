package com.sixdee.kyc.service;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sixdee.kyc.entity.SD_KYC_FIELD_MASTER;
import com.sixdee.kyc.repository.SD_KYC_FIELD_MASTER_Repo;

@Service
@Transactional
public class SD_KYC_FIELD_MASTER_ServiceImpl implements SD_KYC_FIELD_MASTER_Service {
	
	@Autowired
	private SD_KYC_FIELD_MASTER_Repo masterRepo;

	@Override
	public SD_KYC_FIELD_MASTER add(SD_KYC_FIELD_MASTER master) {
		SD_KYC_FIELD_MASTER mr = new SD_KYC_FIELD_MASTER();
		mr.setFieldName(master.getFieldName());
		mr.setFieldType(master.getFieldType());
		mr.setTagType(master.getTagType());
		mr.setDropDown(master.getDropDown());
		return masterRepo.save(mr);
	}

	/*@Override
	public SD_KYC_FIELD_MASTER update(SD_KYC_FIELD_MASTER master) {
		SD_KYC_FIELD_MASTER mr = new SD_KYC_FIELD_MASTER();
		mr.setFieldId(master.getFieldId());
		mr.setFieldName(master.getFieldName());
		mr.setFieldType(master.getFieldType());
		mr.setTagType(master.getTagType());
		mr.setDropDown(master.getDropDown());
		return masterRepo.save(mr);
		
	}*/

	@Override
	public String delete(int fieldId) {
		masterRepo.deleteById(fieldId);
		return "Data Deleted" + fieldId;
	}

	@Override
	public SD_KYC_FIELD_MASTER get(int fieldId) {
		return masterRepo.findById(fieldId).get();
	}

	

}
