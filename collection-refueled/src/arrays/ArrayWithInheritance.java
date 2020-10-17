package arrays;

import java.util.Arrays;

import common.BasicChild;
import common.BasicChildsChild;
import common.BasicFather;
import common.PrintUtility;

public class ArrayWithInheritance {
public static void main(String[] args) {
	//arrays allow initalizing to child type -> can be dangerous in runtime
	BasicFather[] fatherArray = new BasicFather[3];
	//no issue like this
	//indivudla item can be father or child hence no issue
	fatherArray[0] = new BasicFather();
	fatherArray[1] = new BasicChild();
	fatherArray[2] = new BasicChildsChild();
	
	PrintUtility.printJoinedStream(Arrays.stream(fatherArray), "good father array");
	
	//dangerous case
	BasicFather[] dangerousFatherArray = new BasicChild[3];
	
	//compiler wont help anyway
	//at runtime if we put object of father than it breaks at runtime
	//dangerousFatherArray[0] = new BasicFather();
	dangerousFatherArray[0] = new BasicChild();
	dangerousFatherArray[1] = new BasicChildsChild();
	//this works -> as child of basicl child can be inserted without issue
	dangerousFatherArray[2] = new BasicChild();
	//dangerousFatherArray[2] = new BasicFather();
	
	PrintUtility.printJoinedStream(Arrays.stream(dangerousFatherArray), "dangerous"
			+ " father array");
}
}
