package com.sqli.hospital;

import java.util.List;

import com.sqli.hospital.domain.Patient;

/**
 * Actions applied to the patients
 * 
 * @author Manuel
 *
 */
public interface ITreatement {
	
	void wait40Days(List<Patient> listPatients);
	void antibiotic(List<Patient> listPatients);
	void aspirin(List<Patient> listPatients);
	void insulin(List<Patient> listPatients);
	void checkHealthyPatients(List<Patient> listPatients);
	void paracetamol(List<Patient> listPatients);
}
