package com.ictkeralajavaprog.encapsulation;

import java.util.Scanner;

public class Mainprog {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Foundationprog obj=new Foundationprog();
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int nu=inp.nextInt();
		obj.setNumber(nu);
		obj.pos();
	}

}
