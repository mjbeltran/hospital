package com.sqli.hospital.domain;

/**
 * 
 * @author Manuel
 *
 */
public class TuberculosisPatient extends Patient {

	public TuberculosisPatient() {
		this.setTubercolosis(true);
		this.setHealthy(false);
	}
}
