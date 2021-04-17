package com.nt.service;

import com.nt.dto.PatientDTO;

public interface IPatientService {
	public boolean registerPatient(PatientDTO dto) throws Exception;
}
