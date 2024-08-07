package com.OOPS;

import java.util.Scanner;

/**
 * WAP display employee information using class and object(POJO-setter/getter-Encapsulation)
 * POJO obects -- class encapsulate class
 * ********************************************************************************************/

class Employee_CREDENTIAL12
{
	private String empFIRSTNAME;
	private String empLASTNAME;
	private int    empID;
	private String empDESIG;
	private String empADDRESS;
	
	public String getEmpFIRSTNAME() {
		return empFIRSTNAME;
	}
	public void setEmpFIRSTNAME(String empFIRSTNAME) {
		this.empFIRSTNAME = empFIRSTNAME;
	}
	public String getEmpLASTNAME() {
		return empLASTNAME;
	}
	public void setEmpLASTNAME(String empLASTNAME) {
		this.empLASTNAME = empLASTNAME;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpDESIG() {
		return empDESIG;
	}
	public void setEmpDESIG(String empDESIG) {
		this.empDESIG = empDESIG;
	}
	public String getEmpADDRESS() {
		return empADDRESS;
	}
	public void setEmpADDRESS(String empADDRESS) {
		this.empADDRESS = empADDRESS;
	}
	
	public void display()
	{
		System.out.println("Employee_CREDENTIAL12 [empFIRSTNAME=" + empFIRSTNAME + ", empLASTNAME=" + empLASTNAME + ", empID="
				+ empID + ", empDESIG=" + empDESIG + ", empADDRESS=" + empADDRESS + "]");
	}
	
}


public class POJA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		String empFNAME, empLNAME, empDESIG, empADDRESS;
		int empID;
		
		System.out.print("FIRST NAME = ");
		empFNAME= scanner.next();
		
		System.out.print("LAST NAME = ");
		empLNAME = scanner.next();
		
		System.out.print("ID = ");
		empID = scanner.nextInt();
		
		System.out.print("DESIGNATION = ");
		empDESIG = scanner.next();
		
		System.out.print("ADDRESS = ");
		empADDRESS = scanner.next();
		
		Employee_CREDENTIAL12 employee_CREDENTIAL12 = new Employee_CREDENTIAL12();
		
		employee_CREDENTIAL12.setEmpFIRSTNAME(empFNAME);
		employee_CREDENTIAL12.setEmpLASTNAME(empLNAME);
		employee_CREDENTIAL12.setEmpID(empID);
		employee_CREDENTIAL12.setEmpDESIG(empDESIG);
		employee_CREDENTIAL12.setEmpADDRESS(empADDRESS);
		
		employee_CREDENTIAL12.display();
		
		
		
		scanner.close();

	}

}
