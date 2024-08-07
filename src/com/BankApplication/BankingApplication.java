package com.BankApplication;

public class BankingApplication {
	
	public String firstNAME;
	public String lastName;
	public int age;
	public String address;
	
	public BankingApplication()
	{
		this.firstNAME = null;
		this.lastName = null;
		this.age = 0;
		this.address = null;
		display();
		
	}
	
	public BankingApplication(String firstName, String lastName, int age, String address)
	{
		this.firstNAME = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		display();
	}
	
	public void display()
	{
		System.out.println("\nName\t="+firstNAME+" "+lastName+"\nAge\t="+age+"\nAddress\t="+address);
	}

}
