package basics;

//enum can not extend any class
//but can implement any interfaces
public enum MovieGenre /* extends SelfEnum */ implements Cloneable{
	//ordinal starts from 0
	THRILLER(10d), COMEDY(6.66d), ROMANTIC(5.55d) , ACTION(11.99d);
	
	//each enum class extends java.lang.Enum and hence it can override toString method
	public String toString() {
		return "MovieGenre.type: "+name()+",cost: "+cost;
	}
	
	/* private */ MovieGenre(double cost) {
		this.cost=cost;
	}
	
	//lets assume we have fixed cost for each enum based on its constant instance
	private final double cost;
	
	public double cost() {return this.cost;}
}

//can not extends enum
//class FakeExtendable extends MovieGenre{}
