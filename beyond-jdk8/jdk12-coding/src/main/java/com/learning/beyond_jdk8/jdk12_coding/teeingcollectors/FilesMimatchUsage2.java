package com.learning.beyond_jdk8.jdk12_coding.teeingcollectors;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesMimatchUsage2 {

	public static void main(String[] args) throws IOException {
		Path path1 = Paths.get("file1.txt");
		Path path2 = Paths.get("file3.txt");
		
		System.out.println(Files.mismatch(path1, path2)); //if file size is same returns the first mistamatched index
	}
}
