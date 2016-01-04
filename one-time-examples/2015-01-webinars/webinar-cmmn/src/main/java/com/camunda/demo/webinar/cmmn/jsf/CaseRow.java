package com.camunda.demo.webinar.cmmn.jsf;

import org.camunda.bpm.engine.repository.CaseDefinition;
import org.camunda.bpm.engine.runtime.CaseInstance;

import com.camunda.demo.webinar.cmmn.domain.Application;
import com.camunda.demo.webinar.cmmn.domain.TreatmentRequest;

public class CaseRow {

  private CaseInstance caseInstance;
  private CaseDefinition caseDefinition;
  private Application creditApplication;
  private TreatmentRequest tRequest;

  public CaseRow(CaseInstance caseInstance, CaseDefinition caseDefinition, Application creditApplication, TreatmentRequest tRequest) {
    this.caseInstance = caseInstance;
    this.caseDefinition = caseDefinition;
    this.creditApplication = creditApplication;
    this.tRequest = tRequest;
  }

  public CaseInstance getCaseInstance() {
    return caseInstance;
  }

  public Application getCreditApplication() {
    return creditApplication;
  }

  public CaseDefinition getCaseDefinition() {
    return caseDefinition;
  }

public TreatmentRequest gettRequest() {
	return tRequest;
}

public void settRequest(TreatmentRequest tRequest) {
	this.tRequest = tRequest;
}

}
