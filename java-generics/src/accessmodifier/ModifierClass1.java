package accessmodifier;

public /* final */class ModifierClass1 {

	public void useIt() {
		System.out.println("jai shree ram");
	}
	//can not instantiate and use it or inherit during extending
	private void useItPrivately() {
		System.out.println("jai shree ram");
	}
	//poackage leve access only -> either extends or constructor
	 void useItDefaultAccess() {
		System.out.println("jai shree ram");
	}
	 
	 protected void useItProtectedAccess() {
			System.out.println("jai shree ram");
		}
}
