package org.tnsif.exceptionhandlingdemo;

public class ExampleOfTryCatch {

	public static void main(String[] args) {
		//example of try and multiple  catch block
		try {
		int a[]=new int[5];
		System.out.println(a[10]);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmatic exception occurs");
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
			
		}
		catch(Exception e) {
			System.out.println("parent exception occurs");
		}
		System.out.println("rest of the caode");
		
	}

}
	
		
//		catch(ArithmeicException | ArrayIndexOutOfBoundsException ){
//			
//			System.out.println("exception handled:");
//		}

		

