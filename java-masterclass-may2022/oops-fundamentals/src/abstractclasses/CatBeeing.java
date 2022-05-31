package abstractclasses;

public class CatBeeing extends AbstractLivingBeeing {

	protected CatBeeing(int id, String name) {
		super(id, name);
	}

	@Override
	public void greet() {
		System.out.println("Cat with id " + id + " and name " + name + " saying meeow.");
	}

}
