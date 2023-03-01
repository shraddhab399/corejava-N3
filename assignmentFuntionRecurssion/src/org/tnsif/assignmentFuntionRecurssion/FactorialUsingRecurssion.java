package org.tnsif.assignmentFuntionRecurssion;
import java.util.Scanner;
public class FactorialUsingRecurssion {
	//funtion def
	static int factorial(int num) {
		if(num!=0)
			return num*factorial(num-1);
		return 1;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=s.nextInt();
		//function call
		System.out.println("factorial of the number:"+factorial(num));
		s.close();
		
	}

}
