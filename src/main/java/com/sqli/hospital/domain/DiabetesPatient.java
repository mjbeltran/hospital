package com.sqli.hospital.domain;

/**
 * 
 * @author Manuel
 *
 */
public class DiabetesPatient extends Patient {

	public DiabetesPatient() {
		this.setDiabetes(true);
		this.setHealthy(false);
	}
}
