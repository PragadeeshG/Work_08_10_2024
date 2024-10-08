package com.test1;

public class CanaryDeploymentRelease {
	private Integer canaryDeploymentReleaseIndicator;
	private String kubeEngine;
	private String cloudRun;
	private String appEngine;
	private String appName;
	private String projectCode;
	private long deploymentIndicator;
	private String gubeEnterprise;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public CanaryDeploymentRelease() {

	}

	public CanaryDeploymentRelease(Integer canaryDeploymentReleaseIndicator, String kubeEngine, String cloudRun,
			String appEngine, String appName, String projectCode, long deploymentIndicator, String gubeEnterprise,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.canaryDeploymentReleaseIndicator = canaryDeploymentReleaseIndicator;
		this.kubeEngine = kubeEngine;
		this.cloudRun = cloudRun;
		this.appEngine = appEngine;
		this.appName = appName;
		this.projectCode = projectCode;
		this.deploymentIndicator = deploymentIndicator;
		this.gubeEnterprise = gubeEnterprise;
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

	public String getKubeEngine() {
		return kubeEngine;
	}

	public void setKubeEngine(String kubeEngine) {
		this.kubeEngine = kubeEngine;
	}

	public String getCloudRun() {
		return cloudRun;
	}

	public void setCloudRun(String cloudRun) {
		this.cloudRun = cloudRun;
	}

	public String getAppEngine() {
		return appEngine;
	}

	public void setAppEngine(String appEngine) {
		this.appEngine = appEngine;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public long getDeploymentIndicator() {
		return deploymentIndicator;
	}

	public void setDeploymentIndicator(long deploymentIndicator) {
		this.deploymentIndicator = deploymentIndicator;
	}

	public String getGubeEnterprise() {
		return gubeEnterprise;
	}

	public void setGubeEnterprise(String gubeEnterprise) {
		this.gubeEnterprise = gubeEnterprise;
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
