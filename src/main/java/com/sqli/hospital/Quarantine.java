package com.sqli.hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.sqli.hospital.constants.Constants;
import com.sqli.hospital.domain.Patient;
import com.sqli.hospital.domain.PatientFactory;

/**
 * Main class from which we will apply the treatment to the patients
 * 
 * @author Manuel
 *
 */
public class Quarantine {

	private List<Patient> listPatients = new ArrayList<Patient>();
	private ITreatement treatmentManager = new TreatmentManager();

	public Quarantine(String subjects) {
		for (String subject : subjects.split(Constants.SEPARATOR_DATA_PATIENTS)) {
			listPatients.add(PatientFactory.getInstance().getPatient(subject));
		}
	}

	public void aspirin() {
		treatmentManager.aspirin(listPatients);
	}

	public void antibiotic() {
		treatmentManager.antibiotic(listPatients);
	}

	public void insulin() {
		treatmentManager.insulin(listPatients);
	}

	public void paracetamol() {
		treatmentManager.paracetamol(listPatients);
	}

	public void wait40Days() {
		treatmentManager.wait40Days(listPatients);
		treatmentManager.checkHealthyPatients(listPatients);
	}

	public String report() {

		Stream<Patient> patientsFever = listPatients.stream().filter(p -> p.isFever());
		Stream<Patient> patientsHealthy = listPatients.stream().filter(p -> p.isHealthy());
		Stream<Patient> patientsDiabetes = listPatients.stream().filter(p -> p.isDiabetes());
		Stream<Patient> patientsTuberculosis = listPatients.stream().filter(p -> p.isTubercolosis());
		Stream<Patient> patientsDead = listPatients.stream().filter(p -> p.isDead());

		StringBuilder report = new StringBuilder();

		report.append(Constants.FEVER).append(Constants.PATIENTS_REPORT_SEPARATOR).append(patientsFever.count())
				.append(Constants.PATIENTS_REPORT_SPACE).append(Constants.HEALTHY)
				.append(Constants.PATIENTS_REPORT_SEPARATOR).append(patientsHealthy.count())
				.append(Constants.PATIENTS_REPORT_SPACE).append(Constants.DIABETES)
				.append(Constants.PATIENTS_REPORT_SEPARATOR).append(patientsDiabetes.count())
				.append(Constants.PATIENTS_REPORT_SPACE).append(Constants.TUBERCULOSIS)
				.append(Constants.PATIENTS_REPORT_SEPARATOR).append(patientsTuberculosis.count())
				.append(Constants.PATIENTS_REPORT_SPACE).append(Constants.DEAD)
				.append(Constants.PATIENTS_REPORT_SEPARATOR).append(patientsDead.count());

		return report.toString();
	}
}
