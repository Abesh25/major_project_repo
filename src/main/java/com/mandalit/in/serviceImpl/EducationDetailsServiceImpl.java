package com.mandalit.in.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mandalit.in.entity.EducationDetails;
import com.mandalit.in.repository.EducationDetailsRepo;
import com.mandalit.in.service.EducationDetailsService;

@Service
public class EducationDetailsServiceImpl implements EducationDetailsService {

	@Autowired
	private EducationDetailsRepo educationRepo;

	@Override
	public String saveEducationDetails(EducationDetails educationDetails) {
		educationRepo.save(educationDetails);
		return "EducationDetails saved";
	}

}
