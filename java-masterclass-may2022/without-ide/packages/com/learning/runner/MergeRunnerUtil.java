package com.learning.runner;

//MergeUtil is in different package and hence need to import it manually before using
import org.learning.MergeUtil;
public class MergeRunnerUtil{

	private MergeUtil mergeUtil;
	public MergeRunnerUtil(MergeUtil mergeUtil){
		this.mergeUtil=mergeUtil;
	}
	
	public String merge(String... input){
		System.out.println("MergeRunnerUtil input recieved with size: "+input.length);
		
		return mergeUtil.merge(input);
	}
	
}