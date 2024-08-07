package com.Calculator;

import java.util.Scanner;

public class CalculatorAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int firstNUM, secondNUM;
		
		System.out.print("Enter First Number = ");
		firstNUM = scanner.nextInt();
		System.out.print("Enter Second Number = ");
		secondNUM = scanner.nextInt();
		
		//Addition 
		
		Addition addition = new Addition();
		addition.setFirtsNUM(firstNUM);
		addition.setSecondNUM(secondNUM);
		System.out.println("Addition = "+addition.Add(firstNUM, secondNUM));
		
		//Substructor
		
		Substructor substructor = new Substructor();
		substructor.setFirstNUM(firstNUM);
		substructor.setSecondNUM(secondNUM);
		System.out.println("Substructor = "+substructor.Sub(firstNUM, secondNUM));
		
		//Multiplication
		
		Multiplication multiplication = new Multiplication();
		multiplication.setFirstNUM(firstNUM);
		multiplication.setSecondNUM(secondNUM);
		System.out.println("Multiplication = "+multiplication.Multi(firstNUM, secondNUM));
		
		//Division 
		
		Division division = new Division();
		division.setFirstNUM(firstNUM);
		division.setSecondNUM(secondNUM);
		System.out.println("Division = "+division.Divi(firstNUM, secondNUM));
		
		
		//Scanner Close 
		scanner.close();

	}

}
