package jUnitTestPackage_Lab10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumber {

	@Test
	void test() {
		jUnitTestFunction myObj1 = new jUnitTestFunction();
		int result1 = myObj1.AddNumbers(30,10);
		int result2 = myObj1.AddNumbers(0,10);
		assertEquals(40,result1);
		assertEquals(10,result2);
	}
}
