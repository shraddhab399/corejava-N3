package org.tnif.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedTestDemo {

	@ParameterizedTest
	@ValueSource(strings={"Nia","Diya"})
	void test()
	{	
		System.out.println("hello");
	}
	@ParameterizedTest
	@ValueSource(strings={"Nia","Diya"})
	void Display(String str)
	{	
		//assertNotNull(str);
		//assertNotNull();  show error.2
	}
	}
