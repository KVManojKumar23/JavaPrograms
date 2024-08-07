package com.OOPS;

import java.util.Scanner;

/***
 * WAP display employee information using class and object(default constructor)
 * */

class Employee
{
	 int empID;
	 String empName;
	 String empDESIG;
	
	public Employee()/*default Constructor*/
	{
		
	}
	
	public void read()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Employee Name = ");
		this.empName = scanner.next();
		System.out.print("Enter Employee ID = ");
		this.empID = scanner.nextInt();
		System.out.print("Enter Employee DESIGNATION = ");
		this.empDESIG = scanner.next();
		scanner.close();
	}
	
	public void display()
	{
		System.out.println("Employee [empID = " + empID + ", empName = " + empName + ", empDESIG = " + empDESIG + "]");
	}
}
public class Default_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee();
		employee.read();
		employee.display();
	}

}
