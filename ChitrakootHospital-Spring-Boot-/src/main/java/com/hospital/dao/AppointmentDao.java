package com.hospital.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.entity.Appointment;;

public interface AppointmentDao extends JpaRepository<Appointment, Integer> {
	
	

}
