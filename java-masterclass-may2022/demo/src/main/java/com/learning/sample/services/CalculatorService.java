package com.learning.sample.services;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

	// 1,2,3,4
	public int sumOfArray(int[] numbers) {
		if (numbers == null || numbers.length == 0) {
			return 0;
		}
		return sumOfArray(numbers, 0);

	}

	private int sumOfArray(int[] numbers, int index) {
		if (index == numbers.length) {
			return 0;
		}

		return numbers[index] + sumOfArray(numbers, index + 1);
	}
}
