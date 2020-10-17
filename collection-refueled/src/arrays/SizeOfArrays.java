package arrays;

import java.util.Arrays;

import common.PrintUtility;

public class SizeOfArrays {
public static void main(String[] args) {
	//array size can be 0 or greater than 0 , can not take negative
	//int[] zeroArray = new int[0];
	//will give array index out of bound exception
	//zeroArray[0]  =23;
	
	int[] zeroArray = new int[2];
	//should print 0,0 as default int value
	PrintUtility.printJoinedStream(Arrays.stream(zeroArray).boxed(), "array items ");
	
	//negative size will give compialtion error
	
	//int[] negativeSizedArray = new int[-1];
	//negative array index exception at runtime
	//negativeSizedArray[-1] = 23;
	//PrintUtility.printJoinedStream(Arrays.stream(negativeSizedArray).boxed(), "array items ");
	
	//'a' char can be auto converted to int asnd its aski value is 97 , so dsize will be 97
	int[] charSizedArray =new int['a'];
	System.out.println("size of char put array size "+charSizedArray.length);
	
	//size part of array can be anything force or autocasted to int
	//auto case: byte,short,char,int
	//force cas:double,int
	byte b =11;
	int[] byteSizedArray =new int[b];
	System.out.println("size of char put array size "+byteSizedArray.length);
	
	double a =12.99d;
	int[] doubleSizedArray =new int[(int)a];
	System.out.println("size of char put array size "+doubleSizedArray.length);
	
}
}
