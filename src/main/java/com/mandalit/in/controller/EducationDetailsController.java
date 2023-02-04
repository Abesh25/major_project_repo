package com.mandalit.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mandalit.in.entity.EducationDetails;
import com.mandalit.in.service.EducationDetailsService;

@RestController
public class EducationDetailsController {
	@Autowired
	private EducationDetailsService service;

	@PostMapping("/EducationDetails")
	public ResponseEntity<String> educationDetailsSave(@RequestBody EducationDetails details) {
		String saveEducationDetails = service.saveEducationDetails(details);
		return new ResponseEntity<String>(saveEducationDetails, HttpStatus.CREATED);
	}

}
