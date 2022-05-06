package com.learning.java.patterns;

import com.google.gson.Gson;


public class GSONClient {

    public String brand = null;
    public int    doors = 0;
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", doors=" + doors + "]";
	}
    
    
	public static void main(String[] args) {
		System.out.println("jai shree ram says GSON client at startup");
		String json = "{\"brand\":\"Jeep\", \"doors\": 4}";

		Gson gson = new Gson();

		GSONClient car = gson.fromJson(json, GSONClient.class);
		System.out.println("Final output "+car);
	}

}

