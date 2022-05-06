public class InheritanceRule{

public static void main(String... args){
	
	Parent p = new Parent(1	);
	
	Child c = new Child(1,"waad");
}

	
}

class Parent{
	
	 int id;
	 //now no arg constructor do not exist
	 
	 Parent(int id){
		 this.id=id;
	 }
	 
	/* Parent(){
		 this.id=123;
	 }*/
	
}

class Child extends Parent{
	
	//we know automatically default consturcotr is calling super no arg constructor
	
	 String special;
	 
	 Child(int id , String special){
		 super(id);
		 this.special = special;
	 }
	 
	 //default constructor calls super no arg construcot but it do not exist
}