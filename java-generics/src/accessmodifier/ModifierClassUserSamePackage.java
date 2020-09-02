package accessmodifier;


public class ModifierClassUserSamePackage {
public static void main(String[] args) {
	ModifierClass1 obj = new ModifierClass1();
	obj.useIt();
	//obj.useItPrivately();
	obj.useItDefaultAccess();
	obj.useItProtectedAccess();
}
}
