package com.camunda.demo.webinar.cmmn.domain;

import java.util.UUID;

public class TreatmentRequest {

	private String id;
	private boolean privatePatient;
	private String customerId;
	private String customerName;
	private String startOfInsurance;
	

	public TreatmentRequest()
	{
		id = UUID.randomUUID().toString();
	    id = id.substring(0, 8);
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean isPrivatePatient() {
		return privatePatient;
	}
	public void setPrivatePatient(boolean privatePatient) {
		this.privatePatient = privatePatient;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getStartOfInsurance() {
		return startOfInsurance;
	}

	public void setStartOfInsurance(String startOfInsurance) {
		this.startOfInsurance = startOfInsurance;
	}
	
	
}
