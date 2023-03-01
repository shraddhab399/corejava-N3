package org.tnsif.assignmentFuntionRecurssion;
//program to find the nth term in the fibonacci series using recursion
import java.util.Scanner;
public class FibonacciSeriesDemo {
	static int n1=0,n2=1,n3=0;
	private static int count;
	static void fibonacci(int count)
	{
		if(count>0){
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.print(" "+n3);
		fibonacci(count-1);
		}
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number: ");
		int num=s.nextInt();
		System.out.print(n1+" "+n2);
		fibonacci(num-2);
		

	}

}
