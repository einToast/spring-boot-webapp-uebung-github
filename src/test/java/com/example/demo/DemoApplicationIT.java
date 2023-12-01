package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationIT {

	@Test
	void my_simple_integration_test() {
		assertEquals(1, 1);
		System.out.println("This is a integration test!");
	}

}
