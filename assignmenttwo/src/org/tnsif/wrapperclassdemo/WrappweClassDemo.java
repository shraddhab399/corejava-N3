package org.tnsif.wrapperclassdemo;

public class WrappweClassDemo {

	public static void main(String[] args) {
		//autoboxing
		int x=16;
		Integer y=x;
		System.out.println(y);
		
		
		//unboxing
		Integer i=new Integer(10);
		System.out.println(i);
		int b=i.intValue();
		System.out.println(b);
		
	}

}
