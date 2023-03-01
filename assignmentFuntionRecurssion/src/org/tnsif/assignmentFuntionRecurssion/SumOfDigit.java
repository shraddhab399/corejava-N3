package org.tnsif.assignmentFuntionRecurssion;
//program to find sum of digits in a number using recursion.abstract

import java.util.Scanner;
public class SumOfDigit {
	  static int sum_of_digit(int n)
	{
		if(n==0)
			return 0;
		return(n%10 + sum_of_digit(n/10));
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=s.nextInt();
		 int res=sum_of_digit(num);
		System.out.println("sum of digit in "+num +" is " +res);

		
	}
}
