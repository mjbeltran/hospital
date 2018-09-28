package com.sqli.hospital.domain;

/**
 * Class that encapsulates all patient information
 * 
 * @author Manuel
 *
 */
public class Patient {

	private HealthStatus healthStatus;
	private MedecinePatStatus medecinePatStatus;

	public Patient() {
		this.healthStatus = new HealthStatus();
		this.medecinePatStatus = new MedecinePatStatus();
		this.healthStatus.setHealthy(true);
	}

	public boolean hasInsuline() {
		return this.medecinePatStatus.hasInsuline();
	}

	public void setHasInsuline(boolean hasInsuline) {
		this.medecinePatStatus.setHasInsuline(hasInsuline);
	}

	public boolean hasAspirine() {
		return this.medecinePatStatus.hasAspirine();
	}

	public void setHasAspirine(boolean hasAspirine) {
		this.medecinePatStatus.setHasAspirine(hasAspirine);
	}

	public boolean hasParacetamol() {
		return this.medecinePatStatus.hasParacetamol();
	}

	public void setHasParacetamol(boolean hasParacetamol) {
		this.medecinePatStatus.setHasParacetamol(hasParacetamol);
	}

	public boolean hasAntibiotic() {
		return this.medecinePatStatus.hasAntibiotic();
	}

	public void setHasAntibiotic(boolean hasAntibiotic) {
		this.medecinePatStatus.setHasAntibiotic(hasAntibiotic);
	}

	public boolean isHealthy() {
		return this.healthStatus.isHealthy();
	}

	public void setHealthy(boolean healthy) {
		this.healthStatus.setHealthy(healthy);
	}

	public boolean isFever() {
		return this.healthStatus.isFever();
	}

	public void setFever(boolean fever) {
		this.healthStatus.setFever(fever);
	}

	public boolean isDiabetes() {
		return this.healthStatus.isDiabetes();
	}

	public void setDiabetes(boolean diabetes) {
		this.healthStatus.setDiabetes(diabetes);
	}

	public boolean isTubercolosis() {
		return this.healthStatus.isTubercolosis();
	}

	public void setTubercolosis(boolean tubercolosis) {
		this.healthStatus.setTubercolosis(tubercolosis);
	}

	public boolean isDead() {
		return this.healthStatus.isDead();
	}

	public void setDead(boolean dead) {
		this.healthStatus.setDead(dead);
	}

}
