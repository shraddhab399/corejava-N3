package org.tnsif.stringDemo;
//string buffer to make changes in to string
public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Shraddha");
		System.out.println(sb);
		System.out.println(sb.capacity());//by default capacity is 16 thats why 16+8=24
		System.out.println(sb.length());
		
		String str;
		int a=34;
		sb=new StringBuffer(49);
		str=sb.append(a).toString();
		System.out.println(str);
		System.out.println(sb);
		System.out.println(sb.reverse());
		}

}
