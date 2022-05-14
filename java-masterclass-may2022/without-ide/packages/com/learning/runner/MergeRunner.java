package com.learning.runner;

//MergeUtil is in different package and hence need to import it manually before using
import org.learning.MergeUtil;
public class MergeRunner{

	public static void main(String... args){
		
		MergeUtil mergeUtil = new MergeUtil();
		
		//no need to import as it is of same package
		MergeRunnerUtil util = new MergeRunnerUtil(mergeUtil);
		
		
		String output = util.merge("sita", "ram", "hanuman");
		
		System.out.println("MergeRunner: output is: "+output);
	}
}