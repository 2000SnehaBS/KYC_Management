package com.sixdee.kyc.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="FIELD_TYPE",referencedColumnName = "ID",nullable = false)
	private SD_KYC_FIELD_TYPES fieldType;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="TAG_TYPE",referencedColumnName = "ID",nullable = false)
	private SD_KYC_GROUPS tagType;
	
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

	public SD_KYC_FIELD_MASTER(Integer fieldId, String fieldName, SD_KYC_FIELD_TYPES fieldType, SD_KYC_GROUPS tagType,
			String dropDown) {
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

	@Override
	public String toString() {
		return "SD_KYC_FIELD_MASTER [fieldId=" + fieldId + ", fieldName=" + fieldName + ", fieldType=" + fieldType
				+ ", tagType=" + tagType + ", dropDown=" + dropDown + "]";
	}

	
}
