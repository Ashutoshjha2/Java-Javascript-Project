package com.hospital.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.entity.Staff;


public interface StaffDao extends JpaRepository<Staff, Integer>{

	public Staff findByEmailAndPassword(String email,String password);
	
}
