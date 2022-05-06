package com.learning.java.patterns;

public class BuilderUSage {
public static void main(String[] args) {
	BuilderClass clazz = BuilderClass.builder()
				.name("radha madhav")
				.address("delhi")
				.build();
			;
			
			System.out.println(clazz);
}
}
