package accessmodifierusage;

import accessmodifier.ModifierClass1;

public class ModifierClassExtendorOuter extends ModifierClass1{
public static void main(String[] args) {
	ModifierClassExtendorOuter obj = new ModifierClassExtendorOuter();
	obj.useIt();
	//obj.useItPrivately();
	
	//outside package not visible
	//obj.useItDefaultAccess();
	//extends and hence visible
	obj.useItProtectedAccess();
}
}
