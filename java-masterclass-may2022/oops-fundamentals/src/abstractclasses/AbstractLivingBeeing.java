package abstractclasses;

public abstract class AbstractLivingBeeing {
	//common field like id and name
	//all being can be kept id and name
	//kept in super class as it will be common for all
	protected int id;
	
	protected String name;
	
	protected AbstractLivingBeeing(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	//no default arg present here

	//every living beeing greet in different way
	public abstract void greet();
	
	//however everyone sleeps in the same way mostly
	//so should be concrete and common to all children
	public void sleep() {
		System.out.println("living beeing with id: "+id+" and name: "+name+" sleeping.");
	}
}
