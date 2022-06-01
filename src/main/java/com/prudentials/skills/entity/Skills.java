package com.prudentials.skills.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_skill_type")
public class Skills {

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long skillTypeId;
	private String skillTypeName;
	private String status;
	
	public Long getSkillTypeId() {
		return skillTypeId;
	}
	public void setSkillTypeId(Long skillTypeId) {
		this.skillTypeId = skillTypeId;
	}
	public String getSkillTypeName() {
		return skillTypeName;
	}
	public void setSkillTypeName(String skillTypeName) {
		this.skillTypeName = skillTypeName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Skills [skillTypeId=" + skillTypeId + ", skillTypeName=" + skillTypeName + ", status=" + status + "]";
	}
	public Skills(Long skillTypeId, String skillTypeName, String status) {
		super();
		this.skillTypeId = skillTypeId;
		this.skillTypeName = skillTypeName;
		this.status = status;
	}
	
		
	
}
