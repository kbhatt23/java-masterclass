package com.learning.sample.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorServiceTests {

	@Autowired
	private CalculatorService calculatorService;
	
	@Test
	public void sumOfArray() {
		int expectedCount = 10;
		
		int[] numbers = new int[] {1,2,3,4};
		assertEquals(expectedCount, calculatorService.sumOfArray(numbers));
	}
	
}
