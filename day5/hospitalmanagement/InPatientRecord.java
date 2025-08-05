/*
 * Create a subclass InPatientRecord that extends MedicalRecord and adds:
--- roomNumber, numberOfDaysAdmitted, roomCharges.
--- calculateTotalCharges() – to compute and return total inpatient cost.
--- displayRecord() – to include all details, including total charges.
 * 
 */

package com.day5.hospitalmanagement;
import java.util.Scanner;

public class InPatientRecord extends MedicalRecord{
	protected int roomNumber;
	protected int numberOfDaysAdmitted;
	protected double roomCharges;
	
	protected void inputInPatientDetails() {
		super.inputRecordDetails();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the roomNumber : ");
		this.roomNumber = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter the number of days admitted : ");
		this.numberOfDaysAdmitted = sc.nextInt();
		
		System.out.print("Enter the room charges : ");
		this.roomCharges = sc.nextDouble();

	}
	
	protected double calculateTotalCharges() {
		return numberOfDaysAdmitted * roomCharges;
	}
	
	@Override
	public void displayRecords() {
		super.displayRecords();
		System.out.println("Room Number : "+this.roomNumber);
		System.out.println("Number of Days Admitted : "+this.numberOfDaysAdmitted);
		System.out.println("Room Charges : "+this.roomCharges);
		System.out.println("Total charges : "+this.calculateTotalCharges());
	}
	
	
}
