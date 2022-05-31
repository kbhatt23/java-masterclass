package abstractclasses;

public class HumanBeeing extends AbstractLivingBeeing {

	protected HumanBeeing(int id, String name) {
		super(id, name);
	}

	@Override
	public void greet() {
		System.out.println("Human with id " + id + " and name " + name + " saying hello.");
	}

}
