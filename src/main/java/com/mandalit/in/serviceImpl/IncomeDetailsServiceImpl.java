package com.mandalit.in.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.mandalit.in.entity.IncomeDetails;
import com.mandalit.in.repository.IncomeDetailsRepo;
import com.mandalit.in.service.IncomeDetailsService;

public class IncomeDetailsServiceImpl implements IncomeDetailsService {

	@Autowired
	private IncomeDetailsRepo incomeRepo;

	@Override
	public String saveIncome(IncomeDetails incomeDetails) {
		incomeRepo.save(incomeDetails);
		return "income saved";
	}

}
