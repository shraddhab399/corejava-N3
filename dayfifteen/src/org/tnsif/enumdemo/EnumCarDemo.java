package org.tnsif.enumdemo;

public class EnumCarDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//accessing enum constants
				/*Car r1=Car.HONDA;
				System.out.println(r1);*/
				
				//using enhanced for loop
				for(Car c:Car.values())
				{
					System.out.println(c);
					//System.out.println(c.MARUTI);
				}
	}

}
