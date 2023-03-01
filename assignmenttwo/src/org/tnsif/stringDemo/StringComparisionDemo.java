package org.tnsif.stringDemo;

public class StringComparisionDemo {

	public static void main(String[] args) {
		//using literals
		String str="Rnsif";
		//string using new key/operator
		String s2=new String("tnsif");
		String s3=new String("tnsif");
		//comparison
		System.out.println("s1==s2");
		System.out.println("s1==s3");
		//using compareTo
		System.out.println(str.equals(s3));
		System.out.println(str.compareTo("tnsif"));
		System.out.println(str.compareToIgnoreCase("Rnsif"));
		
	}

}
