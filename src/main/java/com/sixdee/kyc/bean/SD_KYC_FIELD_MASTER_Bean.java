package com.sixdee.kyc.bean;

import com.sixdee.kyc.entity.SD_KYC_FIELD_TYPES;
import com.sixdee.kyc.entity.SD_KYC_GROUPS;

public class SD_KYC_FIELD_MASTER_Bean {
	
	private Integer fieldId;
	private String fieldName;
	private SD_KYC_FIELD_TYPES fieldType;
	private SD_KYC_GROUPS tagType;
	private String dropDown;
	public SD_KYC_FIELD_MASTER_Bean(Integer fieldId, String fieldName, SD_KYC_FIELD_TYPES fieldType,
			SD_KYC_GROUPS tagType, String dropDown) {
		super();
		this.fieldId = fieldId;
		this.fieldName = fieldName;
		this.fieldType = fieldType;
		this.tagType = tagType;
		this.dropDown = dropDown;
	}
	public Integer getFieldId() {
		return fieldId;
	}
	public void setFieldId(Integer fieldId) {
		this.fieldId = fieldId;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public SD_KYC_FIELD_TYPES getFieldType() {
		return fieldType;
	}
	public void setFieldType(SD_KYC_FIELD_TYPES fieldType) {
		this.fieldType = fieldType;
	}
	public SD_KYC_GROUPS getTagType() {
		return tagType;
	}
	public void setTagType(SD_KYC_GROUPS tagType) {
		this.tagType = tagType;
	}
	public String getDropDown() {
		return dropDown;
	}
	public void setDropDown(String dropDown) {
		this.dropDown = dropDown;
	}
	public SD_KYC_FIELD_MASTER_Bean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}