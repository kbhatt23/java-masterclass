package basics;

import java.util.ArrayList;
import java.util.List;

public class GenericTypeSubClassing {
public static void main(String[] args) {
	BasicGeneric<? extends Number> item = new BasicGeneric<Number>(23);
	BasicGeneric<? extends Number> itemInt = new BasicGeneric<Integer>(24);
	System.out.println(item.getT());
	System.out.println(itemInt.getT());
	//any method that updates <T> type will give compilation erro
	//item.setT(99);
	//itemInt.setT(99);
	
	BasicGeneric<?> itemAnyThing = new BasicGeneric<>(23);
	int la = (Integer)itemAnyThing.getT();
	
	List<?> wildCard = new ArrayList<>();
	//wildCard.add(23);
	//any wild card ? or ?extends  can not call a method that update T type passed 
}
}
