package com.Java_Programs;

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float celsius;
		Scanner scanner = new Scanner(System.in);
		System.out.print("ENTER celsius NUMBER :: ");
		celsius = scanner.nextFloat();
		float fahrenheit = (celsius*9/5)+32;
		System.out.println("FAHRENHEIT :: "+fahrenheit);
		scanner.close();

	}

}
