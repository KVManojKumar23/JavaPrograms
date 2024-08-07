package com.OOPS;

import java.util.Scanner;

/**
 * WAP display employee information using class and object(parameterized constructor)
 * */


class Employee_CREDENTIAL
{
	public String empNAME;
	public String empPASSWORD;
	public int    empID;
	public int    empSALARY;
	
	public Employee_CREDENTIAL(String empNAME, String empPASSWORD, int empID, int empSALARY)
	{
		this.empNAME = empNAME;
		this.empPASSWORD = empPASSWORD;
		this.empID = empID;
		this.empSALARY = empSALARY;	
	}
	
	public void Display_Employee_Details()
	{
		System.out.println("Employee_CREDENTIAL [empNAME = " + empNAME + ", empPASSWORD = " + empPASSWORD + ", empID = " + empID
				+ ", empSALARY = " + empSALARY + "]");
	}
	
}

public class Parameterized_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		String empname, empPassword;
		int id, salary; 
		
		System.out.print("Enter the Name : ");
		empname = scanner.next();
		System.out.print("Enter the ID : ");
		id = scanner.nextInt();
		System.out.print("Enter the PASSWORD : ");
		empPassword = scanner.next();
		System.out.print("Enter the SALARY : ");
		salary = scanner.nextInt();
		
		Employee_CREDENTIAL employee_CREDENTIAL = new Employee_CREDENTIAL(empname, empPassword, id, salary);
		employee_CREDENTIAL.Display_Employee_Details();
		
		scanner.close();

	}

}
