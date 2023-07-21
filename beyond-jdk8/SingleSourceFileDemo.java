public class SingleSourceFileDemo{
	public static void main(String[] args){
	System.out.println("jai shree ram");
	
	System.out.println(new Student("kbhatt23").getName());
	}
}

class Student{
	
	private String name;
	
	Student(String name){this.name=name;} 
	
	String getName(){
		return this.name;
	}
}