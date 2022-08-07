package com.ictkeralajavaprog.encapsulation;

public class Foundationprog {

	
	private int num;
	public int getNumber()
	{
		return num;
	}
	public void setNumber(int num)
	{
		this.num=num;
	}
	
	public void pos()
	{
		if(num>0)
		{
			System.out.println("The number is positive");
		}
		else if(num<0)
		{
			System.out.println("The number is negative");
		}
		
		else
		{
			System.out.println("The number is zero");
		}
	}
}
