package com.mandalit.in.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Education_Details")
public class EducationDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Integer eId;
	private String  highestDegree;
	private String  universityName;
	private String  gradutionYear;
	private Integer pid;
}
