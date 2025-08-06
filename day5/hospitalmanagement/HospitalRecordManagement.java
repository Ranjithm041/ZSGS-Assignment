/*
 1. Design a Java program to maintain hospital medical records.
Create a base class named MedicalRecord that includes common attributes:
--- recordId, patientName, dateOfVisit, and diagnosis.
--- inputRecordDetails() – to input common record information.
--- override displayRecord() – to display the common record details.
 */

package com.day5.hospitalmanagement;

public class HospitalRecordManagement {

	public static void main(String[] args) {
		InPatientRecord ipr = new InPatientRecord();
				
		ipr.inputInPatientDetails();
		
		System.out.println("---------------In Patient Records------------- ");
		ipr.displayRecords();
		System.out.println();
		
		OutPatientRecord opr = new OutPatientRecord();
		
		opr.inputOutPatient();
		
		
		System.out.println("---------------Out Patient Records------------ ");
		opr.displayRecords();
	}

}
