package com.camunda.demo.webinar.cmmn.jsf;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.variable.Variables;
import org.camunda.bpm.engine.variable.Variables.SerializationDataFormats;

import com.camunda.demo.webinar.cmmn.Constants;
import com.camunda.demo.webinar.cmmn.domain.TreatmentRequest;

@Named
@SessionScoped
public class NewTreatmentRequest implements Serializable{
	
	private static final long serialVersionUID = 1L;

    private TreatmentRequest treatmentRequest = new TreatmentRequest();
    
    
    @Inject
    private ProcessEngine processEngine;


    @Inject
    @Named
	private CaseController caseController;

    @Inject
    @Named
    private CaseListController caseListController;

    public String saveAction() {
        processEngine.getRuntimeService().startProcessInstanceByKey(

            "underwriting", 
            Variables.createVariables().putValueTyped( //
                Constants.VAR_NAME_TREATMENTREQUEST, //
                Variables.objectValue(treatmentRequest).serializationDataFormat(SerializationDataFormats.JSON).create()));

        treatmentRequest = new TreatmentRequest();
        return "case-instances";
    }

    

	public TreatmentRequest getTreatmentRequest() {
		return treatmentRequest;
	}

	
}
