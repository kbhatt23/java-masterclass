package patternmatchinginstanceof;

import java.util.Date;
import java.util.Random;

public class BasicPAtternMAtchingInstanceOfDemo {

	public static void main(String[] args) {
		Object item = fetchObject();
		
		usingOldWay(item);
		usingNewWay(item);
	}

	private static void usingOldWay(Object item) {
		if(item instanceof String) {
			String itemStr = (String)item;
			System.out.println(itemStr.toUpperCase());
		}else if(item instanceof Date) {
			Date itemDate = (Date)item;
			System.out.println(itemDate.getTime());
		}
	}
	private static void usingNewWay(Object item) {
		if(item instanceof String itemStr) {
			System.out.println(itemStr.toUpperCase());
		}else if(item instanceof Date itemDate) {
			System.out.println(itemDate.getTime());
		}
	}

	private static Object fetchObject() {
		boolean nextBoolean = new Random().nextBoolean();
		if(nextBoolean) {
			return "sita rama";
		}else {
			return new Date();
		}
	}
}
