package com.test1;

public class CanaryDeploymentControls {
	private Integer canaryDeploymentReleaseIndicator;
	private String deploymentMode;
	private String adoEnabled;
	private String adoAttestations;
	private String adoMigratedOn;
	private Integer automated;
	private boolean customAutomated;
	private boolean customCanary;
	private Integer canary25;
	private String canary50;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public CanaryDeploymentControls() {

	}

	public CanaryDeploymentControls(Integer canaryDeploymentReleaseIndicator, String deploymentMode, String adoEnabled,
			String adoAttestations, String adoMigratedOn, Integer automated, boolean customAutomated,
			boolean customCanary, Integer canary25, String canary50, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.canaryDeploymentReleaseIndicator = canaryDeploymentReleaseIndicator;
		this.deploymentMode = deploymentMode;
		this.adoEnabled = adoEnabled;
		this.adoAttestations = adoAttestations;
		this.adoMigratedOn = adoMigratedOn;
		this.automated = automated;
		this.customAutomated = customAutomated;
		this.customCanary = customCanary;
		this.canary25 = canary25;
		this.canary50 = canary50;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getCanaryDeploymentReleaseIndicator() {
		return canaryDeploymentReleaseIndicator;
	}

	public void setCanaryDeploymentReleaseIndicator(Integer canaryDeploymentReleaseIndicator) {
		this.canaryDeploymentReleaseIndicator = canaryDeploymentReleaseIndicator;
	}

	public String getDeploymentMode() {
		return deploymentMode;
	}

	public void setDeploymentMode(String deploymentMode) {
		this.deploymentMode = deploymentMode;
	}

	public String getAdoEnabled() {
		return adoEnabled;
	}

	public void setAdoEnabled(String adoEnabled) {
		this.adoEnabled = adoEnabled;
	}

	public String getAdoAttestations() {
		return adoAttestations;
	}

	public void setAdoAttestations(String adoAttestations) {
		this.adoAttestations = adoAttestations;
	}

	public String getAdoMigratedOn() {
		return adoMigratedOn;
	}

	public void setAdoMigratedOn(String adoMigratedOn) {
		this.adoMigratedOn = adoMigratedOn;
	}

	public Integer getAutomated() {
		return automated;
	}

	public void setAutomated(Integer automated) {
		this.automated = automated;
	}

	public boolean isCustomAutomated() {
		return customAutomated;
	}

	public void setCustomAutomated(boolean customAutomated) {
		this.customAutomated = customAutomated;
	}

	public boolean isCustomCanary() {
		return customCanary;
	}

	public void setCustomCanary(boolean customCanary) {
		this.customCanary = customCanary;
	}

	public Integer getCanary25() {
		return canary25;
	}

	public void setCanary25(Integer canary25) {
		this.canary25 = canary25;
	}

	public String getCanary50() {
		return canary50;
	}

	public void setCanary50(String canary50) {
		this.canary50 = canary50;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
