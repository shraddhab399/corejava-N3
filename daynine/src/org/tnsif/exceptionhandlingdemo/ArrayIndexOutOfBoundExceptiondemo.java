package org.tnsif.exceptionhandlingdemo;

public class ArrayIndexOutOfBoundExceptiondemo {

	public static void main(String[] args) {
		System.out.println("first line");
		System.out.println("second line");
		try {
			int[] myIntArray = new int[] {1,2,3};
			System.out.println(myIntArray);
			
	}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("thr array dosent have forth element");
		}
		System.out.println("thord line");
			
		}
	public static void print(int[] arr) {
		System.out.println(arr[3]);
	}

}
