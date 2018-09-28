package com.sqli.hospital.helper;

import java.util.List;
import java.util.stream.Stream;

import com.sqli.hospital.domain.Patient;

/**
 * Class helper to apply medicines to the patients
 * 
 * @author Manuel
 *
 */
public final class MedicineHelper {

	public static void applyAspirine(List<Patient> listPatients) {
		Stream<Patient> allPatients = listPatients.stream();
		allPatients.forEach(patient -> {
			patient.setHasAspirine(true);
			if (patient.isFever()) {
				patient.setFever(false);
				patient.setHealthy(true);
			}

		});

	}

	public static void applyAntibiotic(List<Patient> listPatients) {
		Stream<Patient> allPatients = listPatients.stream();
		allPatients.forEach(patient -> {
			patient.setHasAntibiotic(true);
			if(patient.isHealthy() && patient.hasInsuline()) {
				patient.setFever(true);
				patient.setHealthy(false);
			}
		});

	}

	public static void applyInsulin(List<Patient> listPatients) {
		Stream<Patient> allPatients = listPatients.stream();
		allPatients.forEach(patient -> {
			patient.setHasInsuline(true);
			if(patient.isDiabetes()) {
				patient.setDead(false);
				patient.setDiabetes(true);
			}
		});
	}

	public static void applyParacetamol(List<Patient> listPatients) {
		Stream<Patient> allPatients = listPatients.stream();
		allPatients.forEach(patient -> {
			patient.setHasParacetamol(true);
			if(patient.isFever()) {
				patient.setHealthy(true);
				patient.setFever(false);
			}
		});
	}

}
