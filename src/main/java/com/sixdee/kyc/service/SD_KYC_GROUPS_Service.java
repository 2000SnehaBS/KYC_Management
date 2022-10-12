package com.sixdee.kyc.service;

import com.sixdee.kyc.entity.SD_KYC_GROUPS;

public interface SD_KYC_GROUPS_Service {
	
	public SD_KYC_GROUPS add(SD_KYC_GROUPS groups);
	//public SD_KYC_GROUPS update(SD_KYC_GROUPS groups);
	public String delete(int id);
    public SD_KYC_GROUPS get(int id);

}
