package com.sixdee.kyc.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sixdee.kyc.entity.SD_KYC_FIELD_TYPES;
import com.sixdee.kyc.repository.SD_KYC_FIELD_TYPES_Repo;

@Service
@Transactional
public class SD_KYC_FIELD_TYPES_ServiceImpl implements SD_KYC_FIELD_TYPES_Service {
	
	@Autowired
	private SD_KYC_FIELD_TYPES_Repo typesRepo;

	@Override
	public SD_KYC_FIELD_TYPES add(SD_KYC_FIELD_TYPES types) {
		SD_KYC_FIELD_TYPES ty = new SD_KYC_FIELD_TYPES();
		ty.setId(types.getId());
		ty.setName(types.getName());
		return typesRepo.save(ty) ;
	}

	/*@Override
	public SD_KYC_FIELD_TYPES update(SD_KYC_FIELD_TYPES types) {
		SD_KYC_FIELD_TYPES ty = new SD_KYC_FIELD_TYPES();
		ty.setId(types.getId());
		ty.setName(types.getName());
		return typesRepo.save(ty) ;
	}*/

	@Override
	public String delete(int id) {
		typesRepo.deleteById(id);
		return "Data Deleted" + id;
		
	}

	@Override
	public SD_KYC_FIELD_TYPES get(int id) {
		return typesRepo.findById(id).get();
	}

}
