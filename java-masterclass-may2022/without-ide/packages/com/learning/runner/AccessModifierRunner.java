
package com.learning.runner;
//class can be public or default
//public can be imported any where but default can be imoprted only in same package

import com.learning.parent.PublicClass;
public class AccessModifierRunner{
	
	public static void main(String... args){
		new PublicClass().hello();
		
		//new PublicClass().privateHello("different package says jai radha madhav");
		
		//new PublicClass().defaultHello();
		
		//System.out.println("private field ka value "+new PublicClass().id);
		
		System.out.println("equals of 2 objects : "+new PublicClass().equals(new PublicClass()));
		
	}
}