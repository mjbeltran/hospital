package com.sqli.hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.sqli.hospital.domain.Patient;
import com.sqli.hospital.helper.MedicineHelper;

/**
 * Class auxiliar to manage the application of the differents treatments
 * 
 * @author Manuel
 *
 */
public class TreatmentManager implements ITreatement {

	private List<Patient> listPatientsToBeHealthy = new ArrayList<Patient>();

	public void wait40Days(List<Patient> listPatients) {

		Stream<Patient> patiensDiabetes = listPatients.stream().filter(p -> p.isDiabetes() && !p.hasInsuline());
		patiensDiabetes.forEach(patient -> {
			patient.setDead(true);
			patient.setDiabetes(false);
		});
	}

	public void aspirin(List<Patient> listPatients) {

		MedicineHelper.applyAspirine(listPatients);

		Stream<Patient> patiensFever = listPatients.stream().filter(p -> p.isFever());
		patiensFever.forEach(patient -> {
			patient.setFever(false);
			patient.setHealthy(true);
		});

	}

	public void antibiotic(List<Patient> listPatients) {

		MedicineHelper.applyAntibiotic(listPatients);

		Stream<Patient> patiensTuberculosis = listPatients.stream().filter(p -> p.isTubercolosis());
		patiensTuberculosis.forEach(patient -> {
			patient.setTubercolosis(false);
			listPatientsToBeHealthy.add(patient);
		});

		Stream<Patient> patiensHealthy = listPatients.stream().filter(p -> p.isHealthy() && p.hasInsuline());
		patiensHealthy.forEach(patient -> {
			patient.setFever(true);
			patient.setHealthy(false);
		});

	}

	public void insulin(List<Patient> listPatients) {

		MedicineHelper.applyInsulin(listPatients);

		Stream<Patient> patientsDiabetes = listPatients.stream().filter(p -> p.isDiabetes());
		patientsDiabetes.forEach(patient -> {
			patient.setDead(false);
			patient.setDiabetes(true);
		});

	}

	public void paracetamol(List<Patient> listPatients) {

		MedicineHelper.applyParacetamol(listPatients);

		Stream<Patient> patientsFever = listPatients.stream().filter(p -> p.isFever());
		patientsFever.forEach(patient -> {
			patient.setHealthy(true);
			patient.setFever(false);
		});

	}

	public void checkHealthyPatients(List<Patient> listPatients) {

		Stream<Patient> patientsHealthy = listPatients.stream()
				.filter(p -> p.isHealthy() && p.hasAntibiotic() && p.hasInsuline());
		patientsHealthy.forEach(patient -> {
			patient.setHealthy(false);
			patient.setFever(true);
		});

		Stream<Patient> patientsToHealthy = listPatientsToBeHealthy.stream();
		patientsToHealthy.forEach(patient -> {
			patient.setHealthy(true);
		});

		verifyPatientsToDied(listPatients);

	}

	private void verifyPatientsToDied(List<Patient> listPatients) {

		Stream<Patient> patientsToDied = listPatients.stream().filter(p -> p.hasParacetamol() && p.hasAspirine());
		patientsToDied.forEach(patient -> {
			patient.setDead(true);
			patient.setFever(false);
			patient.setDiabetes(false);
			patient.setTubercolosis(false);
			patient.setHealthy(false);
		});
	}

}
