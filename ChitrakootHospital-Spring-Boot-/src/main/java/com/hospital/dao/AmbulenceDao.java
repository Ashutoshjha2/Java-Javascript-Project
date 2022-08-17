package com.hospital.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.entity.AmbulenceBooking;

public interface AmbulenceDao extends JpaRepository<AmbulenceBooking, Integer> {
	
	

}
