package com.ictkeralajavaprog.encapsulation;

import java.util.Scanner;

public class patternprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int i,j,n;
		n=inp.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
