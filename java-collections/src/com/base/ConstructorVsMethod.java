package com.base;

public class ConstructorVsMethod {
	
	public ConstructorVsMethod(int count) {
		if(count == 0) {
			System.out.println("constructor bad input");
			return;
		}
	}
	public ConstructorVsMethod method(int count) {
		if(count == 0) {
			System.out.println("method bad input");
			return null;
		}
		return new ConstructorVsMethod(count);
	}
	
	public static void main(String[] args) {
		ConstructorVsMethod kal  = new ConstructorVsMethod(0);
		System.out.println(kal);
		ConstructorVsMethod method = kal.method(0);
		System.out.println(method);
	}
}
