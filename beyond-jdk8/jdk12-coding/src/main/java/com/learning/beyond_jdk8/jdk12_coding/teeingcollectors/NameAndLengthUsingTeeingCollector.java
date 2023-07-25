package com.learning.beyond_jdk8.jdk12_coding.teeingcollectors;

import java.util.List;
import java.util.stream.Collectors;

public class NameAndLengthUsingTeeingCollector {

	public static void main(String[] args) {
		List<String> names = List.of("sita rama","uma mahesh","gauri ganesha","radhe krishna");
		NameAndLengthData result = names.stream()
		    .collect(Collectors.teeing(Collectors.joining(",")
		    		, Collectors.mapping(String :: length, Collectors.toList())
		    		, NameAndLengthData :: new));
		
		System.out.println(result);
	}
}

class NameAndLengthData{
	private final String namesJoined;
	private final List<Integer> namesLength;
	public NameAndLengthData(String namesJoined, List<Integer> namesLength) {
		super();
		this.namesJoined = namesJoined;
		this.namesLength = namesLength;
	}
	@Override
	public String toString() {
		return "NameAndLengthData [namesJoined=" + namesJoined + ", namesLength=" + namesLength + "]";
	}
	
}
