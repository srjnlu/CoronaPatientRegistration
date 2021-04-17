package com.nt.controller;

import com.nt.dto.PatientDTO;
import com.nt.service.IPatientService;
import com.nt.vo.PatientVO;

public final class MainController {
	private IPatientService service;

	public MainController(IPatientService service) {
		this.service = service;
	}
	
	public boolean registerPatient(PatientVO vo) throws Exception {
		//convert VO into DTO
		PatientDTO dto = new PatientDTO();
		dto.setName(vo.getName());
		dto.setAddress(vo.getAddress());
		dto.setMob(vo.getMob());
		dto.setDaysCount(Integer.parseInt(vo.getDaysCount()) );
		dto.setAmount(Float.parseFloat(vo.getAmount()));
		
		//use service
		return service.registerPatient(dto);
	}
	
}
