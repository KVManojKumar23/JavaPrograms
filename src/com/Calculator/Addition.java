package com.Calculator;

public class Addition {
	
	private int firstNUM;
	private int secondNUM;
	
	public Addition()
	{
		
	}
	
	public void setFirtsNUM(int firstNUM)
	{
		this.firstNUM = firstNUM;
	}
	
	public void setSecondNUM(int secondNUM)
	{
		this.secondNUM = secondNUM;
	}
	
	public int getFirstNUM()
	{
		return firstNUM;
	}
	
	public int getSecondNUM()
	{
		return secondNUM;
	}
	
	public int Add(int firstNUM, int secondNUM)
	{
		return firstNUM + secondNUM;
	}

}
