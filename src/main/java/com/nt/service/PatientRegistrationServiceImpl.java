package com.nt.service;

import com.nt.bo.PatientBO;
import com.nt.dao.IPatientDAO;
import com.nt.dto.PatientDTO;

public final class PatientRegistrationServiceImpl implements IPatientService {
	private IPatientDAO dao;
	private float discountPercentage;
	
	
	public PatientRegistrationServiceImpl(IPatientDAO dao) {
		this.dao = dao;
		this.discountPercentage = 10;  
	}

	@Override
	public boolean registerPatient(PatientDTO dto) throws Exception {
		float bill = dto.getAmount() * dto.getDaysCount();
		float discountAmt = bill * this.discountPercentage / 100;
		float netBill = bill - discountAmt;

		PatientBO bo = new PatientBO();
		bo.setName(dto.getName());
		bo.setAddress(dto.getAddress());
		bo.setMob(dto.getMob());
		bo.setDaysCount(dto.getDaysCount());
		bo.setAmount(dto.getAmount());
		bo.setDiscount(this.discountPercentage);
		bo.setBill(bill);
		bo.setNetBill(netBill);
		//use DAO
		int count = dao.insert(bo);
		System.out.println("test ======> count: " + count);
		
		if(count != 0)
			return true;
		
		return false;
	}

}
