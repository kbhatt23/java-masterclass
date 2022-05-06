public class TwoDArrayBasic{
	
	//this assigns null value as it is field of class level
			//static ObjectReference obj;

public static void main(String... args){
	int[][] twod = new int[4][2];
	
	twod[0][0]=9;
	twod[0][1]=11;
	twod[1][0]=2;
	twod[1][1]=5;
	twod[2][0]=4;
	twod[2][1]=4;
	twod[3][0]=6;
	twod[3][1]=13;
	
	for(int i = 0 ; i < twod.length ; i++){
	
		for(int j = 0 ; j < twod[i].length ; j++){
		System.out.print(twod[i][j] + ",");
		}
		System.out.println("-----------------------------");
	}
}}