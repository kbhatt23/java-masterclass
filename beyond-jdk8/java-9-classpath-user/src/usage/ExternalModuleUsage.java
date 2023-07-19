package usage;

import java.util.logging.Logger;

import utility.ModuleReflectionUtil;

public class ExternalModuleUsage {
	private static final Logger logger = Logger.getLogger(ExternalModuleUsage.class.getName());
	public static void main(String[] args) {
		logger.info("client work started");
		
		ModuleReflectionUtil.printModuleInfo(ExternalModuleUsage.class, false);
	}

}
