package utility;

import java.util.logging.Logger;

public class ModuleReflectionUtil {

	private static final Logger logger = Logger.getLogger(ModuleReflectionUtil.class.getName());

	public static <T> void printModuleInfo(Class<T> clazz, boolean useConsole) {
		Module module = clazz.getModule();
		if (useConsole) {
			System.out.println("module name: " + module.getName());
			System.out.println("module info: " + module);
		} else {
			logger.info("module name: " + module.getName());
			logger.info("module info: " + module);
		}
	}
}
