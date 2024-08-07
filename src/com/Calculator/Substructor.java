package com.Calculator;

public class Substructor {
	
	private int firstNUM;
	private int secondNUM;
	
	public Substructor()
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
	
	public int Sub(int firstNUM, int secondNUM)
	{
		return firstNUM - secondNUM;
	}
	
	

}
