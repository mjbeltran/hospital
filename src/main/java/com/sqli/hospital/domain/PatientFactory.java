package com.sqli.hospital.domain;

import com.sqli.hospital.constants.Constants;

/**
 * Factory class to create patient objects
 * 
 * @author Manuel
 *
 */
public class PatientFactory {

	private static PatientFactory patientFactory;

	public static PatientFactory getInstance() {
		if (patientFactory == null) {
			patientFactory = new PatientFactory();
		}
		return patientFactory;
	}

	public Patient getPatient(String status) {

		Patient patient = new Patient();

		switch (status) {
		case Constants.FEVER:
			patient.setFever(true);
			patient.setHealthy(false);
			break;
		case Constants.DIABETES:
			patient.setDiabetes(true);
			patient.setHealthy(false);
			break;
		case Constants.TUBERCULOSIS:
			patient.setTubercolosis(true);
			patient.setHealthy(false);
			break;
		default:
			break;
		}

		return patient;
	}
}
