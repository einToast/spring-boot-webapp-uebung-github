package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void my_simple_unit_test() {
		assertEquals(1, 1);
		System.out.println("This is a unit test!");
	}

}
