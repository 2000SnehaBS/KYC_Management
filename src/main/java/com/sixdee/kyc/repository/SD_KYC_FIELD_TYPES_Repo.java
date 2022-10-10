package com.sixdee.kyc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sixdee.kyc.entity.SD_KYC_FIELD_TYPES;


@Repository
public interface SD_KYC_FIELD_TYPES_Repo extends JpaRepository <SD_KYC_FIELD_TYPES,Integer > {

}
