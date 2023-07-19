package basics;

import utility.ModuleReflectionUtil;

public class PrintModuleInfo {

	public static void main(String[] args) {
		ModuleReflectionUtil.printModuleInfo(PrintModuleInfo.class, false);
	}
}
