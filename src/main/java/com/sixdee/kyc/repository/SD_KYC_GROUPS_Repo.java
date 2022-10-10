package com.sixdee.kyc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sixdee.kyc.entity.SD_KYC_GROUPS;

@Repository
public interface SD_KYC_GROUPS_Repo extends  JpaRepository<SD_KYC_GROUPS, Integer>  {

}
