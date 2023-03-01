package org.tnsif.assignmentFuntionRecurssion;

import java.util.Scanner;

public class AdditionDemo {
   /* static int addition(int x,int y) {
		int sum=x+y;
		return sum;
	}*/
	 static void addition(int x,int y) {
		int sum=x+y;
		System.out.println("The sum is:"+sum);
	}

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the value of x and y:");
	int x=s.nextInt();
	int y=s.nextInt();
	addition(x,y);
	//System.out.println(addition(x,y));
	s.close();

	}

}
