package org.tnsif.stringDemo;
//program to demonstrate on object class
class Sample
{

}
//class Demo
//{
//	public Demo() {
//		System.out.println("In constructor");
//	}
//	protected void finalize() {
//		System.out.println("In finalize");
//	}
//}
public class objectClassDemo {

	public static void main(String[] args) {
		Sample s=new Sample();
		System.out.println(s.getClass());
		System.out.println(s.hashCode());
		

	}

}
