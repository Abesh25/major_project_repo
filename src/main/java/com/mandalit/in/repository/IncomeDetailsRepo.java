package com.mandalit.in.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mandalit.in.entity.IncomeDetails;

public interface IncomeDetailsRepo extends JpaRepository<IncomeDetails, Serializable>{

}
