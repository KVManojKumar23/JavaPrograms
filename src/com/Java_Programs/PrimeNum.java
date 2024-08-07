package com.Java_Programs;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, flag = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the NUMBER :: ");
		num = scanner.nextInt();
		if(num == 1)
		{
			System.out.println(num+" is NOT PRIME NUMBER");
			System.exit(0);
		}
		else
		{
			for(int i = 2; i <= num/2; i++ )
			{
				if(num%i == 0)
				{
					flag = 1;
					break;
				}
			}
		}
		
		
		if(flag == 0)
		{
			System.out.println(num+" is PRIME NUMBER");
		}
		else
		{
			System.out.println(num+" is NOT PRIME NUMBER");
		}
		
		scanner.close();

	}

}
