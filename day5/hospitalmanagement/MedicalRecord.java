/*
 * 
 * 1. Design a Java program to maintain hospital medical records.
Create a base class named MedicalRecord that includes common attributes:
--- recordId, patientName, dateOfVisit, and diagnosis.
--- inputRecordDetails() – to input common record information.
--- override displayRecord() – to display the common record details.
‌
Create a subclass InPatientRecord that extends MedicalRecord and adds:
--- roomNumber, numberOfDaysAdmitted, roomCharges.
--- calculateTotalCharges() – to compute and return total inpatient cost.
--- displayRecord() – to include all details, including total charges.
‌
Create another subclass OutPatientRecord that extends MedicalRecord and adds:
--- doctorName, consultationFee.
--- override displayRecord() – to include all outpatient-specific details.
Include all the necessary classes if its needed.
 * 
 * 
 * 
 */


package com.day5.hospitalmanagement;
import java.util.Scanner;

public class MedicalRecord {
	protected int recordId;
	protected String patientName;
	protected String dateOfVisit;
	protected String diagnosis;
	
	protected void inputRecordDetails() {
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("Enter the patient record id : ");
		this.recordId = sc.nextInt();
		
		System.out.print("Enter the patient name : ");
		this.patientName = sc.nextLine();
		
		sc.nextLine();
		System.out.print("Enter the date of visit : ");
		this.dateOfVisit = sc.nextLine();
		
		System.out.print("Enter the diagnosis details : ");
		this.diagnosis = sc.nextLine();
	}
	
	public void displayRecords() {
		System.out.println("Record Id : "+this.recordId);
		System.out.println("Patient Name : "+this.patientName);
		System.out.println("Date of Visit : "+this.dateOfVisit);
		System.out.println("Diagnosis : "+this.diagnosis);
	}
}
