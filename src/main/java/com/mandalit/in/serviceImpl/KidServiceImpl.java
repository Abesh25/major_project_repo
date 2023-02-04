package com.mandalit.in.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mandalit.in.entity.Kids;
import com.mandalit.in.repository.KidsRepo;
import com.mandalit.in.service.KidService;

@Service
public class KidServiceImpl implements KidService {
	@Autowired
	private KidsRepo kidsRepo;

	@Override
	public String saveKids(Kids kids) {
		Kids kid = kidsRepo.save(kids);
		return "Kids saved..";
	}

}
