
package com.learning.parent;
//class can be public or default
//public can be imported any where but default can be imoprted only in same package

//same directory class need not to be imported
//also default class can be used without import ins ame package
//import com.learning.parent.PublicClass;
public class AccessModifierRunner{
	
	public static void main(String... args){
		new PublicClass().hello();
		
		// wont compile itself
		//new PublicClass().privateHello("same package says jai radha madhav");
		
		//same package allows default method access
		new PublicClass().defaultHello();
		
		//System.out.println("private field ka value "+new PublicClass().id);
		
		System.out.println("equals of 2 objects : " + new PublicClass().equals(new PublicClass()));
	}
}