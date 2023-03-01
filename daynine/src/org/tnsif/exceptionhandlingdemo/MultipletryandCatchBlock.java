package org.tnsif.exceptionhandlingdemo;

import java.util.Scanner;

public class MultipletryandCatchBlock {

	public static void main(String[] args) {
	int arr[]=new int[] {101,89,90};
	Scanner s=new Scanner(System.in);
	System.out.println("enter the value of x and y:");
	int x=s.nextInt();
	int y=s.nextInt();
	try {
		
			try
			{
				System.out.println(arr[3]);
			}
			catch(ArrayIndexOutOfBoundsException e) 
			{
				System.out.println("Exception handled :"+e);
				
			}
			try
			{
				int res=x/y;
				System.out.println(res);
			}
			catch(ArithmeticException e) 
			{
				System.out.println("exception handled"+e);
				
			}
		}
			finally 
			{
				System.out.println("finally block");
			}
			
	}
}
