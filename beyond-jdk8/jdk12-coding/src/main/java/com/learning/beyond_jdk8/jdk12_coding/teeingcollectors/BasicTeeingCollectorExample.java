package com.learning.beyond_jdk8.jdk12_coding.teeingcollectors;

import java.util.List;
import java.util.stream.Collectors;

public class BasicTeeingCollectorExample {

	public static void main(String[] args) {
		List<String> names = List.of("sita rama","uma mahesh","gauri ganesha","radhe krishna");
		
		NameCountStats result = names.stream()
		     .map(name -> name.replaceAll(" ", "")) //removes space for each name
		     .collect(Collectors.teeing(Collectors.joining(","), Collectors.counting(), 
		    		 NameCountStats ::new))
		     ;
		
		System.out.println(result);
	}
}

class NameCountStats{
	
	private final String namesJoined;
	private final long size;
	public NameCountStats(String namesJoined,long size) {
		this.namesJoined = namesJoined;
		this.size = size;
	}
	@Override
	public String toString() {
		return "NameCountStats [namesJoined=" + namesJoined + ", size=" + size + "]";
	}
	
}
