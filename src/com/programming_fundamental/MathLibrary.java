package com.programming_fundamental;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Demonstrate an example for Constants, Truncating, comparison, power , Trigonometric ,square
roots and generate random number using Math library
*/

class CalculateArea
{
	private final static double PIE = 3.14;
	
	CalculateArea(float radius)
	{
		double area = PIE * radius * radius;
		
		System.out.println("The area of the circle with radius is "+area);
	}
}

class Truncate
{
	Truncate(float number)
	{
		double truncate = Math.ceil((number * 10)/10);
		System.out.println("The result after truncate = "+truncate);
	}
}

class CalculatePower
{
	CalculatePower(float number, int power)
	{
		double Result =Math.pow(number, power);
		System.out.println("The result "+number+" with power "+power+" is = "+Result);
	}
}

class TrignometricCalculation
{
	TrignometricCalculation(float number)
	{
		double sine = Math.sin(number);
		double cosine = Math.cos(number);
		double Tangent = Math.tan(number);
		
		System.out.println("Sine = "+sine);
		System.out.println("Cosine = "+cosine);
		System.out.println("Tangent = "+Tangent);
	}
}

class SquareRoot
{
	SquareRoot(float number)
	{
		double square = Math.sqrt(number);
		
		System.out.println("Square Root = "+square);
	}
}

class RandumNumber
{
	RandumNumber() {
		
		double number = Math.random();
		System.out.println("Random Number = "+ number);
	}
}
public class MathLibrary {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		float radius, number;
		int power; 
		
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		System.out.print("Enter the radius of the circle = ");
		String string = bufferedReader.readLine();
		radius = Float.parseFloat(string);
		CalculateArea calculateArea = new CalculateArea(radius);
		System.out.println(calculateArea.getClass());
		
		System.out.println();
		
		System.out.print("Enter the Number to truncate = ");
		string = bufferedReader.readLine();
		number = Float.parseFloat(string);
		Truncate truncate = new Truncate(number);
		System.out.println(truncate.getClass());
		
		System.out.println();
		
		System.out.print("Enter the number = ");
		string = bufferedReader.readLine();
		number = Float.parseFloat(string);
		System.out.print("Enter the Power = ");
		string = bufferedReader.readLine();
		power = Integer.parseInt(string);
		CalculatePower calculatePower = new CalculatePower(number, power);
		System.out.println(calculatePower.getClass());
		
		System.out.println();
		
		RandumNumber randumNumber = new RandumNumber();
		System.out.println(randumNumber.getClass());
		
		System.out.println();
		
		SquareRoot squareRoot = new SquareRoot(number);
		System.out.println(squareRoot.getClass());
		
		System.out.println();
		
		TrignometricCalculation trignometricCalculation = new TrignometricCalculation(number);
		System.out.println(trignometricCalculation.getClass());

	}

}
