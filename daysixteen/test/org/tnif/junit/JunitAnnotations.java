package org.tnif.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JunitAnnotations {

	@Test
	@DisplayName("SimplejunitestingMethod")
	void test() {
		System.out.println("First Junit test case");
	}
	@Test
	@BeforeAll
	static void display() {
		System.out.println("welcome to Junit5 test ");
	}
	@Test
	@AfterEach
	void Accept() { 
		System.out.println("After each method demo");
	}
	//for after all and before all we have to make it static.
	@Test
	@AfterAll
	static void get() {
		System.out.println("After all method demo");
		
	}
	@Test
	@BeforeEach
	void show() {
		System.out.println("before Each method demo");
		
	}


}
