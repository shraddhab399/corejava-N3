package org.tnsif.exceptionhandlingdemo;

public class TryCAtchDemo {

	public static void main(String[] args) {
		int arr[] =new int[] {101,23,45};
		try {
			System.out.println("Exception handled:");
			System.exit(0);
		}
		catch(Exception e){
			System.out.println("exception handled"+e);
		}
		finally {
			System.out.println("finally block");
		}

	}

}
