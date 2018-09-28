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

		Patient patient = new HealthyPatient();

		switch (status) {
		case Constants.FEVER:
			patient = new FeverPatient();
			break;
		case Constants.DIABETES:
			patient = new DiabetesPatient();
			break;
		case Constants.TUBERCULOSIS:
			patient = new TuberculosisPatient();
			break;
		default:
			break;
		}

		return patient;
	}
}
