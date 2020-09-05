package _static;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StaticBlockUSage {
	//final means only once we can initlzize
	//obviusly onstructor will be bad place as copy will be same
	//so best place could be static block, if  init can not be done in one line
	private static final List<String> cradleSupportedPageTypes = Arrays.asList("contactUs", "settings");
	//map can not be initialized in single line and since it is static vairable -> static block is best place to do it
	private static final Map<String, Boolean> aemSupportedPageMap;
	//static block gets called only once , during class load
	//every time class constructor is called it wont get called -> init block gets called in that case, but constructor is better choice in taht case
	static {
		System.out.println("initizliang aem map");
		aemSupportedPageMap = new HashMap<String, Boolean>();
		aemSupportedPageMap.put("contactUs", true);
		aemSupportedPageMap.put("settings", true);
		aemSupportedPageMap.put("plansDeviceLanding", true);
		aemSupportedPageMap.put("launchApp", false);
	}
	
	public static void main(String[] args) {
		StaticBlockUSage obj = new StaticBlockUSage();
		StaticBlockUSage obj2 = new StaticBlockUSage();
		StaticBlockUSage obj3  = new StaticBlockUSage();
		System.out.println("cradle suppoerted pages "+cradleSupportedPageTypes);
		System.out.println("aem data map "+aemSupportedPageMap);
		
	}
}
