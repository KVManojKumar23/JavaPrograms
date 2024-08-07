package com.Java_Programs;

import java.util.Scanner;

public class PrimeNUM_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		boolean isPrime;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter NUMBER :: ");
		num = scanner.nextInt();
		
		for(int i = 2; i <= num; i++)
		{
			isPrime = true;
			for(int j = 2; j < i/2; j++)
			{
				if(i % j == 0)
				{
					isPrime = false;
					
					break;
				}
			}
			
			if(isPrime)
			{
				System.out.print(i + " ");
			}
		}
		
		scanner.close();

	}

}
