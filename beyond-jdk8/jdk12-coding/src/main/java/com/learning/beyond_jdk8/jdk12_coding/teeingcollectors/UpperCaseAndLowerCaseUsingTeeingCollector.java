package com.learning.beyond_jdk8.jdk12_coding.teeingcollectors;

import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseAndLowerCaseUsingTeeingCollector {

	public static void main(String[] args) {
		List<String> names = List.of("sita rama","uma mahesh","gauri ganesha","radhe krishna");

		UpperAndLowerCaseNames result = 	names.stream()
		   .collect(Collectors.teeing(Collectors.mapping(String :: toUpperCase, Collectors.toList())
				   , Collectors.mapping(String :: toLowerCase, Collectors.toList()), 
				   UpperAndLowerCaseNames :: new));
	
		System.out.println(result);
	}
}

class UpperAndLowerCaseNames{
	private final List<String> upperCaseNames;
	private final List<String> lowerCaseNames;
	public UpperAndLowerCaseNames(List<String> upperCaseNames, List<String> lowerCaseNames) {
		super();
		this.upperCaseNames = upperCaseNames;
		this.lowerCaseNames = lowerCaseNames;
	}
	@Override
	public String toString() {
		return "UpperAndLowerCaseNames [upperCaseNames=" + upperCaseNames + ", lowerCaseNames=" + lowerCaseNames + "]";
	}
	public List<String> getUpperCaseNames() {
		return upperCaseNames;
	}
	public List<String> getLowerCaseNames() {
		return lowerCaseNames;
	}
	
	
	
}
