package usage;

import java.util.logging.Logger;

/*import basics.SampleTestClass;*/
import utility.ModuleReflectionUtil;

public class ExternalModuleUsage {
	private static final Logger logger = Logger.getLogger(ExternalModuleUsage.class.getName());
	public static void main(String[] args) {
		logger.info("client work started");
		
		//only utility package is exposed
		//wont work as it is outside exports package
		//SampleTestClass obj = null;
		
		
		ModuleReflectionUtil.printModuleInfo(ExternalModuleUsage.class, false);
	}

}
