package org.tnsif.exceptionhandlingdemo;

import java.util.Scanner;

public class ArithmaticExampleDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of x and  y: ");
		int x=s.nextInt();
		int y=s.nextInt();
		//try block contain the exception code
		try {
			int res=x/y;
			System.out.println(res);
		}
		catch(Exception e){
			
			
			System.out.println("Exception handled using catch:"+e);
			
		}
		finally {
			
			System.out.println("finally block");
		}
		
		
	}

}
