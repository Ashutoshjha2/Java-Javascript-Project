package com.hospital.controller;

import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.hospital.dao.AdmitDao;
import com.hospital.dao.RegisterDao;
import com.hospital.entity.AdmitPatient;
import com.hospital.entity.RegisterPatient;

@Controller
public class PatientAdmitController {
	
	@Autowired
	private RegisterDao registerdao;
	
	@Autowired
	private AdmitDao admitdao;
	
	@RequestMapping("/admit/{id}")
	public String admitpatient(@PathVariable("id") int id) {
		
		RegisterPatient registerPatient = this.registerdao.getOne(id);
		System.out.println(registerPatient);
		int pid = registerPatient.getPid();
		String pname = registerPatient.getPname();
		String gender = registerPatient.getGender();
		String paddress = registerPatient.getPaddress();
		String pcity = registerPatient.getPcity();
		String pdob = registerPatient.getPdob();
		String pemail = registerPatient.getPemail();
		String pphone = registerPatient.getPphone();
		String plname = registerPatient.getPlname();
		String admitstatus ="admit";
		String wardtype = "opdNormal";
		//admit class variable
				Random r = new Random();
				int wardno = r.nextInt(10);
				Random r1 = new Random();
				int bedno = r1.nextInt(20);
				AdmitPatient admitPatient = new AdmitPatient(pid, pname, plname, pemail, pphone, pdob, gender, paddress, pcity, wardtype, wardno, bedno, admitstatus);
		this.admitdao.save(admitPatient);
		registerPatient.setAdmitstatus(admitstatus);
		this.registerdao.save(registerPatient);
				return "redirect:/admindashboard";
	}

	@RequestMapping("/admitpatient")
	public String admitpage() {
	
		return "AdmitPatient";
	}
	
}
