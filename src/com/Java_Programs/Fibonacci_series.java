package com.Java_Programs;

import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, firstNUM, secondNUM, thirdNUM;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter NUMBER :: ");
		num = scanner.nextInt();
		firstNUM = 0;
		secondNUM = 1;
		thirdNUM = 1;
		
		while(thirdNUM <= num)
		{
			System.out.print(thirdNUM+" ");
			thirdNUM = firstNUM + secondNUM;
			firstNUM = secondNUM;
			secondNUM = thirdNUM;
		}
//		System.out.print(firstNUM );
//		System.out.print(secondNUM );
//		
//		for(int i = 2; i < num; i++)
//		{
//			thirdNUM = firstNUM + secondNUM;
//			System.out.print(thirdNUM);
//			firstNUM = secondNUM;
//			secondNUM = thirdNUM;
//		}
		
		scanner.close();
		
		

	}

}
