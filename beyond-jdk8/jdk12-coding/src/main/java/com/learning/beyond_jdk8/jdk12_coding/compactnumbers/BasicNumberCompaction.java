package com.learning.beyond_jdk8.jdk12_coding.compactnumbers;

import java.text.NumberFormat;
import java.util.Locale;

public class BasicNumberCompaction {

	public static void main(String[] args) {
		NumberFormat compactNumberInstance = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
		
		System.out.println(compactNumberInstance.format(2000));
		System.out.println(compactNumberInstance.format(1000000));
		
		System.out.println(compactNumberInstance.format(60000000));
	}
}
