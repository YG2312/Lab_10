package jUnitTestPackage_Lab10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddString {

	@Test
	void test() {
		jUnitTestFunction myObj1 = new jUnitTestFunction();
		String result1 = myObj1.AddStrings("Yash_","Gupta");
		String result2 = myObj1.AddStrings("Hello_","Sir");

		assertEquals("Yash_Gupta",result1);
		assertEquals("Hello_Sir",result2);

	}

}
