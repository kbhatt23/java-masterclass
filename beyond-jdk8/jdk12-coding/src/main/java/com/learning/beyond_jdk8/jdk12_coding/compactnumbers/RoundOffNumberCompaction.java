package com.learning.beyond_jdk8.jdk12_coding.compactnumbers;

import java.text.NumberFormat;
import java.util.Locale;

public class RoundOffNumberCompaction {

	public static void main(String[] args) {
		NumberFormat compactNumberInstance = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
		
	}
}
