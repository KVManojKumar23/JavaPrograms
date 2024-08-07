package com.Calculator;

public class Division {
	
	private int firstNUM;
	private int secondNUM;
	
	public Division()
	{
		
	}
	public int getFirstNUM() {
		return firstNUM;
	}
	public void setFirstNUM(int firstNUM) {
		this.firstNUM = firstNUM;
	}
	public int getSecondNUM() {
		return secondNUM;
	}
	public void setSecondNUM(int secondNUM) {
		this.secondNUM = secondNUM;
	}
	
	public int Divi(int firstNUM, int secondNUM)
	{
		return secondNUM / firstNUM;
	}
	
	

}
