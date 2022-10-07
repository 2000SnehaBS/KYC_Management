package com.sixdee.kyc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="SD_KYC_FIELD_MASTER")
public class SD_KYC_FIELD_MASTER {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="FIELD_ID",unique = true,nullable = false)
	private Integer fieldId;
	
	@Column(name="FIELD_NAME",unique = true,nullable = false)
	private String fieldName;
	
	@Column(name="FIELD_TYPE",unique = true,nullable = false)
	private String fieldType;
	
	@Column(name="TAG_TYPE",unique = true,nullable = false)
	private Integer tagType;
	
	@Column(name="DROPDOWN",unique = true,nullable = false)
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
		return "SD_KYC_FIELD_MASTER [fieldId=" + fieldId + ", fieldName=" + fieldName + ", fieldType=" + fieldType
				+ ", tagType=" + tagType + ", dropDown=" + dropDown + "]";
	}

	public SD_KYC_FIELD_MASTER(Integer fieldId, String fieldName, String fieldType, Integer tagType, String dropDown) {
		super();
		this.fieldId = fieldId;
		this.fieldName = fieldName;
		this.fieldType = fieldType;
		this.tagType = tagType;
		this.dropDown = dropDown;
	}

	public SD_KYC_FIELD_MASTER() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

}
