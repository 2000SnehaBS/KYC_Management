package com.sixdee.kyc.bean;

public class SD_KYC_FIELD_TYPES_Bean {
	
	private Integer id;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "SD_KYC_FIELD_TYPES_Bean [id=" + id + ", name=" + name + "]";
	}
	public SD_KYC_FIELD_TYPES_Bean(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public SD_KYC_FIELD_TYPES_Bean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
