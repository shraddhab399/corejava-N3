package org.tnsif.stringDemo;
//program to demonstrate on diffrent string operation
public class StringOperationDemo {

	public static void main(String[] args) {
		String s1=new String(("bhujbal"));
		String s2=s1.toUpperCase();
		String s3=s1.toLowerCase();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.length());
		System.out.println(s1.substring(4, 7));
		System.out.println(s1.isEmpty());
	}

}
