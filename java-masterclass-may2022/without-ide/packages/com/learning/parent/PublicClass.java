
package com.learning.parent;
//class can be public or default
//public can be imported any where but default can be imoprted only in same package

public class PublicClass{
	//private instance field
	private int id = 99;
	
	public void hello(){
		privateHello("jai shree ram");
	}
	
	//private method can be called only within the same class or inner class

	private void privateHello(String msg){
		System.out.println(msg);
		
	}
	
	//default method means can be accesible within same package
	
	void defaultHello(){
		privateHello("default method says jai shree ram");
	}
	
	public boolean equals(PublicClass other){
		//other is other object but class type is same and hence can access even private fields
		return this.id == other.id;
		
	} 
}