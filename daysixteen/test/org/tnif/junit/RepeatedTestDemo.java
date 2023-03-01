package org.tnif.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class RepeatedTestDemo {

	@Test
	@RepeatedTest(5)
	void test() {
	int num=1;
	/*while(num<5) {
		System.out.println("hello guys...");
	}*/
	System.out.println("Rapeated test annotatipn!...");
	}

}
