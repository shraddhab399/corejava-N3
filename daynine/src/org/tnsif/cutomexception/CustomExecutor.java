package org.tnsif.cutomexception;

import java.util.Scanner;

public class CustomExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String id=s.nextLine();
	
		String password=s.nextLine();
		try {
			if(id.equals("shraddhab399@gmail.com") && password.equals("shraddha@123"))
			{
				System.out.println("credential MAtched");
			}
			else
				throw new LoginCredential("invalid credential");s
		} 
		catch(LoginCredential e) {
			System.out.println("Exception Handled"+e);
		}
		finally {
			System.out.println("finally block");
		}
	}

}
