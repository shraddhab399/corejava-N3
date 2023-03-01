package org.tnsif.assignmentFuntionRecurssion;
import java.util.Scanner;
public class FactorialUsingFunction {
	static int factorial(int num){
		int fact=1;
		for(int i=1;i<num;i++) 
		{
			fact=fact*i;
			
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=s.nextInt();
		System.out.println("factorial of the number is "+factorial(num));
		s.close();
	

	}

}
