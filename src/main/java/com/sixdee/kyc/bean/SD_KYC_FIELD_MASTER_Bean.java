package com.sixdee.kyc.bean;

public class SD_KYC_FIELD_MASTER_Bean {
	
	private Integer fieldId;
	private String fieldName;
	private String fieldType;
	private Integer tagType;
	private String dropDown;
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
	public String getFieldType() {
		return fieldType;
	}
	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}
	public Integer getTagType() {
		return tagType;
	}
	public void setTagType(Integer tagType) {
		this.tagType = tagType;
	}
	public String getDropDown() {
		return dropDown;
	}
	public void setDropDown(String dropDown) {
		this.dropDown = dropDown;
	}
	@Override
	public String toString() {
		return "SD_KYC_FIELD_MASTER_Bean [fieldId=" + fieldId + ", fieldName=" + fieldName + ", fieldType=" + fieldType
				+ ", tagType=" + tagType + ", dropDown=" + dropDown + "]";
	}
	public SD_KYC_FIELD_MASTER_Bean(Integer fieldId, String fieldName, String fieldType, Integer tagType,
			String dropDown) {
		super();
		this.fieldId = fieldId;
		this.fieldName = fieldName;
		this.fieldType = fieldType;
		this.tagType = tagType;
		this.dropDown = dropDown;
	}
	
	
}
