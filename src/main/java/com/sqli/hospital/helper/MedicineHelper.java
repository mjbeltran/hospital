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
		});

	}

	public static void applyAntibiotic(List<Patient> listPatients) {
		Stream<Patient> allPatients = listPatients.stream();
		allPatients.forEach(patient -> {
			patient.setHasAntibiotic(true);
		});

	}

	public static void applyInsulin(List<Patient> listPatients) {
		Stream<Patient> allPatients = listPatients.stream();
		allPatients.forEach(patient -> {
			patient.setHasInsuline(true);
		});

	}

	public static void applyParacetamol(List<Patient> listPatients) {
		Stream<Patient> allPatients = listPatients.stream();
		allPatients.forEach(patient -> {
			patient.setHasParacetamol(true);
		});

	}

}
