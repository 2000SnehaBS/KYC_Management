package com.sixdee.kyc.bean;

public class SD_KYC_GROUPS_Bean {
	
	private Integer id;
	private String groupName;
	private String label;
	private Integer groupOrder;
	private Integer parent;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Integer getGroupOrder() {
		return groupOrder;
	}
	public void setGroupOrder(Integer groupOrder) {
		this.groupOrder = groupOrder;
	}
	public Integer getPqarent() {
		return parent;
	}
	public void setPqarent(Integer pqarent) {
		this.parent = pqarent;
	}
	@Override
	public String toString() {
		return "SD_KYC_FIELD_GROUPS_Bean [id=" + id + ", groupName=" + groupName + ", label=" + label + ", groupOrder="
				+ groupOrder + ", pqarent=" + parent + "]";
	}
	public SD_KYC_GROUPS_Bean(Integer id, String groupName, String label, Integer groupOrder, Integer pqarent) {
		super();
		this.id = id;
		this.groupName = groupName;
		this.label = label;
		this.groupOrder = groupOrder;
		this.parent = pqarent;
	}
	public SD_KYC_GROUPS_Bean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
