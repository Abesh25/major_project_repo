package com.mandalit.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mandalit.in.entity.IncomeDetails;
import com.mandalit.in.service.IncomeDetailsService;

@RestController
public class IncomeDetailsController {
	@Autowired
	private IncomeDetailsService service;

	@PostMapping("/incomeDetails")
	public ResponseEntity<String> incomeDetailsServiceSave(@RequestBody IncomeDetails details) {
		String saveIncome = service.saveIncome(details);
		return new ResponseEntity<String>(saveIncome, HttpStatus.CREATED);
	}
}
