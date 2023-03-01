package org.tnif.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//program to demonstrate on the first junit5 testing.
class FirstJavaProgramTesting {

	@Test
	@DisplayName("SimplejunitYestingMethod")
	void test() {
		System.out.println("First Junit test case");
	}
	@Test
	 void display() {
		System.out.println("welcome to Junit5 test ");
	}

}
