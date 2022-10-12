package com.sixdee.kyc.service;

import com.sixdee.kyc.entity.SD_KYC_FIELD_TYPES;

public interface SD_KYC_FIELD_TYPES_Service {
	
	public SD_KYC_FIELD_TYPES add(SD_KYC_FIELD_TYPES types);
	//public SD_KYC_FIELD_TYPES update(SD_KYC_FIELD_TYPES types);
    public String delete(int id);
    public SD_KYC_FIELD_TYPES get(int id);


}
