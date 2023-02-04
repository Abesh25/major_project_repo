package com.mandalit.in.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mandalit.in.entity.Kids;

public interface KidsRepo extends JpaRepository<Kids, Serializable> {

}
