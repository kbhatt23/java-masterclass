package arrays;

public class ThreeDArray {
public static void main(String[] args) {
	int[][][] threeD  =new int[2][][];
	threeD[0] = new int[2][];
	threeD[1] = new int[3][];
	
	threeD[0][0] = new int[2];
	threeD[0][1] = new int[2];
	
	threeD[1][0] = new int[1];
	threeD[1][1] = new int[2];
	threeD[1][2] = new int[2];
	
	threeD[0][0][0] = 1;
	threeD[0][0][1] = 2;
	threeD[0][1][0] = 3;
	threeD[0][1][1] = 4;

	threeD[1][0][0] = 5;
	threeD[1][1][0] = 6;
	threeD[1][1][1] = 7;
	threeD[1][2][0] = 8;
	threeD[1][2][1] = 9;
	
	for(int[][] outer: threeD) {
		for(int[] inner : outer) {
			for(int num : inner) {
				System.out.println(num);
			}
		}
		System.out.println("=================");
	}
	

	//can not have threeD[2] = array index oputof bound
}
}
