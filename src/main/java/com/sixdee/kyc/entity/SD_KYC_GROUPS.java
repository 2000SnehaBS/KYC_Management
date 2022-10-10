package com.sixdee.kyc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SD_KYC_GROUPS")
public class SD_KYC_GROUPS {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID",unique = true,nullable = false)
	private Integer id;
	
	@Column(name="GROUP_NAME",unique = true,nullable = false)
	private String groupName;
	
	@Column(name="LABEL",unique = true,nullable = false)
	private String label;
	
	@Column(name="GROUP_ORDER",unique = true,nullable = false)
	private Integer groupOrder;
	
	@Column(name="PARENT",unique = true,nullable = false)
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

	public Integer getParent() {
		return parent;
	}

	public void setParent(Integer parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
		return "SD_KYC_FIELD_GROUPS [id=" + id + ", groupName=" + groupName + ", label=" + label + ", groupOrder="
				+ groupOrder + ", parent=" + parent + "]";
	}

	public SD_KYC_GROUPS(Integer id, String groupName, String label, Integer groupOrder, Integer parent) {
		super();
		this.id = id;
		this.groupName = groupName;
		this.label = label;
		this.groupOrder = groupOrder;
		this.parent = parent;
	}

	public SD_KYC_GROUPS() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

}
