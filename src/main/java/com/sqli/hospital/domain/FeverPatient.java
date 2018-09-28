package com.sqli.hospital.domain;

/**
 * 
 * @author Manuel
 *
 */
public class FeverPatient  extends Patient{

	public FeverPatient() {
		this.setFever(true);
		this.setHealthy(false);
	}
}
