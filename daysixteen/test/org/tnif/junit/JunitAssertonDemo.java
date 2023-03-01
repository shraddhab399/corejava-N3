package org.tnif.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitAssertonDemo {

	@Test
	//fails when expected does not equal actual
	void test() {
	assertEquals(12,12);
	}
	
	@Test
	//fails when expression is true
	void Display() {
	assertFalse(12==1);
	}

}
