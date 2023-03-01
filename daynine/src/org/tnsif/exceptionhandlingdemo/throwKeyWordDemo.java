package org.tnsif.exceptionhandlingdemo;

import java.io.IOException;

public class throwKeyWordDemo {
	//method defination
	public static void donate(int age,int weight)throws IOException{
		if(age>18 && weight>50)
			System.out.println("eligible to donatethe blood");
		else
			throw new IOException("not eligible");
	}
	public static void main(String[] args)  throws Exception{
		try {
			//method call
			donate(17,55);
			
		}
		catch(IOException e) {
			System.out.println(e);
			
		}
		
		

	}

}
