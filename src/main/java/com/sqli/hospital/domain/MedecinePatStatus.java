package com.sqli.hospital.domain;

/**
 * 
 * @author Manuel
 *
 */
public class MedecinePatStatus {

	private boolean hasInsuline;
	private boolean hasAspirine;
	private boolean hasParacetamol;
	private boolean hasAntibiotic;
	
	public boolean hasInsuline() {
		return hasInsuline;
	}
	public void setHasInsuline(boolean hasInsuline) {
		this.hasInsuline = hasInsuline;
	}
	public boolean hasAspirine() {
		return hasAspirine;
	}
	public void setHasAspirine(boolean hasAspirine) {
		this.hasAspirine = hasAspirine;
	}
	public boolean hasParacetamol() {
		return hasParacetamol;
	}
	public void setHasParacetamol(boolean hasParacetamol) {
		this.hasParacetamol = hasParacetamol;
	}
	public boolean hasAntibiotic() {
		return hasAntibiotic;
	}
	public void setHasAntibiotic(boolean hasAntibiotic) {
		this.hasAntibiotic = hasAntibiotic;
	}
	
	
	
}
