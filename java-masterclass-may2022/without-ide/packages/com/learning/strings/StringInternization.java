
package com.learning.strings;

public class StringInternization{
	
	public static void main(String... args){
		//string literal is always internized
		
		String s1 = "sita ram";
		String s2 = "sita ram";
		
		System.out.println("s1 == s2 : "+s1 == s2);
		
	}
}