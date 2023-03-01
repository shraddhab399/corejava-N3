package listdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class vectorDemo {

	public static void main(String[] args) {
		List<Object> obj1=new Vector<>();
		/*obj1.add(101);
		obj1.add(30.8f);
		obj1.add('a');
		obj1.add(106);*/
		obj1.add(30.8);
		obj1.addAll(obj1);
		System.out.println("second list is :"+obj1);
		System.out.println("size of list 1 :"+obj1.size());
		System.out.println("is List2 is empty? :"+obj1.isEmpty());
		obj1.remove(101);
		System.out.println("first list is :"+obj1);
		System.out.println(obj1.contains(101));
		System.out.println("Element at index 1 :"+obj1.get(1));
		System.out.println("index of 'a' :"+obj1.indexOf('a'));
		System.out.println(obj1);
		System.out.println("index of 30.8f :"+obj1.indexOf(30.8));
		obj1.clear();
		System.out.println(obj1);
	
		List<Integer> obj2=new ArrayList<>();
		obj2.add(67);
		obj2.add(17);
		obj2.add(24);
		System.out.println("list 3 is :"+obj2);
		//to sort it an ascending order
		Collections.sort(obj2);
		System.out.println("Ascending order:"+obj2);
		Collections.reverse(obj2);
		System.out.println("descending order:"+obj2);


	}

}
