package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void my_simple_unit_test() {
		int b = 1;
		int a = 1;
		assertEquals(a, b);
		System.out.println("This is a unit test!");
	}

}
