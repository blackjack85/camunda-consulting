package com.camunda.demo.webinar.cmmn.domain;

import java.util.UUID;

/**
 * Klasse für Kündigungen
 * @author Admin
 *
 */
public class Termination 
{
	private String id;
	private boolean confirmation;
	private String customerId;
	private String customerName;
	
	
	public Termination()
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

	public boolean isConfirmation() {
		return confirmation;
	}

	public void setConfirmation(boolean confirmation) {
		this.confirmation = confirmation;
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
	
}
