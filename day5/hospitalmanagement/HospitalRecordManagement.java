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
