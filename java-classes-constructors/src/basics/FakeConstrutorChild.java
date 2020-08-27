package basics;

public class FakeConstrutorChild extends SuperClass{

	public FakeConstrutorChild() {
		super("kesha ki jai");
		System.out.println("jai shre ram from child");
		this.superPropertyy = "jai uma mahesh";
	}
	public static void main(String[] args) {
		FakeConstrutorChild la = new FakeConstrutorChild();
		System.out.println(la);
	}
}
