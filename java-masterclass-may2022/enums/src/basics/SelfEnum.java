package basics;

import java.util.Arrays;
import java.util.List;

// Self Created enum using class
// class is final so that other class can not extend and override the behavior
public final class SelfEnum {

	private static final String TYPE_TWO = "TYPE_TWO";
	private static final String TYPE_ONE = "TYPE_ONE";

	private final int ordinal;

	private final String name;
	
	//crate fixed type of instances allowed
	//since client can not create its insance it has to use one of these allowed instances only
	public static final SelfEnum TYPE_ONE_INSTANNCE = new SelfEnum(0, TYPE_ONE);
	public static final SelfEnum TYPE_TWO_INSTANNCE = new SelfEnum(1, TYPE_TWO);

	// no one should create on the fly object with bad data with unexpected results
	private SelfEnum(int ordinal, String name) {
		this.ordinal = ordinal;
		this.name = name;
	}

	public final int ordinal() {
		return this.ordinal;
	}
	
	public final String name() {
		return this.name;
	}
	
	//see that we are adding this code at compile tie
	//as reflection would be slower at runtime
	//writing same boliterplate code is cumbersome and time waste
	//so jdk designers provided this in the name of enum to be used
	public static List<SelfEnum> values(){
		//fixed size array so that client can not add fake data
		return Arrays.asList(TYPE_ONE_INSTANNCE, TYPE_TWO_INSTANNCE);
	}
	
	public static SelfEnum findByName(String name){
		List<SelfEnum> values = values();
		
		for(SelfEnum selfEnum : values) {
			if(selfEnum.name.equals(name))
				return selfEnum;
		}
		
		return null;
	}
}
