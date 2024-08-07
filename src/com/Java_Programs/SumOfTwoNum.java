package com.Java_Programs;

import java.util.Scanner;

public class SumOfTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNUM, secondNUM, Total;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Fisrt Number :: ");
		firstNUM = scanner.nextInt();
		System.out.print("Enter Second Number :: ");
		secondNUM = scanner.nextInt();
		Total = firstNUM + secondNUM;
		System.out.println("Total SUM :: "+Total);
		
		scanner.close();

	}

}
