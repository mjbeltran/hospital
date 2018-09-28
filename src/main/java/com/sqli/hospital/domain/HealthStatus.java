package com.sqli.hospital.domain;

/**
 * 
 * @author Manuel
 *
 */
public class HealthStatus {

	private boolean healthy;
	private boolean fever;
	private boolean diabetes;
	private boolean tubercolosis;
	private boolean dead;
	
	public boolean isHealthy() {
		return healthy;
	}
	public void setHealthy(boolean healthy) {
		this.healthy = healthy;
	}
	public boolean isFever() {
		return fever;
	}
	public void setFever(boolean fever) {
		this.fever = fever;
	}
	public boolean isDiabetes() {
		return diabetes;
	}
	public void setDiabetes(boolean diabetes) {
		this.diabetes = diabetes;
	}
	public boolean isTubercolosis() {
		return tubercolosis;
	}
	public void setTubercolosis(boolean tubercolosis) {
		this.tubercolosis = tubercolosis;
	}
	public boolean isDead() {
		return dead;
	}
	public void setDead(boolean dead) {
		this.dead = dead;
	}
	
	
}
