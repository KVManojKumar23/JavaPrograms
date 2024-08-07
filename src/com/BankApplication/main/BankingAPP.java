package com.BankApplication.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.BankApplication.BankingApplication;

public class BankingAPP {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String firstName, lastName, address;
		int age;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter First Name = ");
		firstName = reader.readLine();
		
		System.out.print("Enter Last Name = ");
		lastName = reader.readLine();
		
		System.out.print("Enter Age = ");
		age = Integer.parseInt(reader.readLine());
		
		System.out.print("Enter City = ");
		address = reader.readLine();
		
		BankingApplication bankingApplication = new BankingApplication(firstName, lastName, age, address);

	}

}
