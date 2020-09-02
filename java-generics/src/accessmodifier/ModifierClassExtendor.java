package accessmodifier;

public class ModifierClassExtendor extends ModifierClass1{

	public static void main(String[] args) {
		ModifierClassExtendor obj = new ModifierClassExtendor();
		obj.useIt();
		//obj.useItPrivately();
		obj.useItDefaultAccess();
		obj.useItProtectedAccess();
	}
}
