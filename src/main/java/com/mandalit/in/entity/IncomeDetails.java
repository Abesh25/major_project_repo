package com.mandalit.in.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Income_Details")
public class IncomeDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer incomeId;
	private Double incomeSal;
	private String property;
	private Integer rent;
	private Integer pid;
}
