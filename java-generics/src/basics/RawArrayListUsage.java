package basics;

import java.util.ArrayList;
import java.util.List;

public class RawArrayListUsage {
public static void main(String[] args) {
	List rawArrayaList = new ArrayList();
	//type will be object meanin e=anything can go
	
	//issue will happen while fetching , make sure castting is proper
	rawArrayaList.add(23);
	rawArrayaList.add("messi");
	rawArrayaList.add(20);
	rawArrayaList.add(20);
	
	
	for(Object o : rawArrayaList) {
		System.out.println(o + " "+ o.getClass());
	}
	System.out.println("sum ki shuruat");
	//expecting all as ints
	int sum =0;
	for(Object o : rawArrayaList) {
		//System.out.println(o + " "+ o.getClass());
		if(o instanceof Integer)
			sum  += (Integer)o;
	}
	System.out.println(sum);
	
}
}
