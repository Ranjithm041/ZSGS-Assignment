/*
 * 
 * Create another subclass OutPatientRecord that extends MedicalRecord and adds:
--- doctorName, consultationFee.
--- override displayRecord() – to include all outpatient-specific details.
Include all the necessary classes if its needed.
 * 
 */

package com.day5.hospitalmanagement;
import java.util.Scanner;

public class OutPatientRecord extends MedicalRecord {
	protected String doctorName;
	protected double consultationFee;
	
	protected void inputOutPatient() {
		super.inputRecordDetails();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Doctor Name : ");
		this.doctorName = sc.nextLine();
		
		System.out.print("Enter the consultation fee : ");
		this.consultationFee = sc.nextDouble();
	}
	
	@Override
	public void displayRecords() {
		super.displayRecords();
		System.out.println("Doctor Name : "+this.doctorName);
		System.out.println("Consultation fee : "+this.consultationFee);
	}
}
