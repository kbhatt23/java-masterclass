package accessmodifierusage;

import accessmodifier.ModifierClass1;

public class ModifierClassUser {
public static void main(String[] args) {
	ModifierClass1 obj = new ModifierClass1();
	obj.useIt();
	//obj.useItPrivately();
	//outside package not visible
		//obj.useItDefaultAccess();
	//protected method visible only throigh extension in outside package
	//obj.useItProtectedAccess();
}
}
