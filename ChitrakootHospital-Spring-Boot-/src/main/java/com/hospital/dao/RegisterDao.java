package com.hospital.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.entity.RegisterPatient;

public interface RegisterDao extends JpaRepository<RegisterPatient, Integer>{

	/* public List<RegisterPatient> patients = new ArrayList<RegisterPatient>(); */
}
