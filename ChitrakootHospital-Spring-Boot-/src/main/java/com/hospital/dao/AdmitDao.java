package com.hospital.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.entity.AdmitPatient;

public interface AdmitDao extends JpaRepository<AdmitPatient, Integer>{

}
