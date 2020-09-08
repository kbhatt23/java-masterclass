package basics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import fileoperations.Employee;
import fileoperations.EmployeeList;
import fileoperations.FileUtils;

public class PrintWriterUSage {
public static void main(String[] args) {
		/*
		 * try(BufferedWriter writer1 = new BufferedWriter(new
		 * FileWriter(FileUtils.ROOT_PATH+"bufferedwriter.txt"))){ //n needs to be
		 * inserted manually
		 * 
		 * for(Employee employee: EmployeeList.returnReadOnlyEmployees()) {
		 * writer1.write(employee.getId()+":"+employee.getName()+"\n"); } }catch
		 * (IOException e) { System.out.println("exception block while writing"); }
		 */
	
	System.out.println("writing using printwriter");
	//even just file path is good enough to handle writing here, 
	//in bufferedearer we needed to decorate with file object or filewriter object or bufferewriter object
	try(PrintWriter writer1 = new PrintWriter(FileUtils.ROOT_PATH+"bufferedwriter.txt")){
		//n needs to be inserted manually
		
		for(Employee employee: EmployeeList.returnReadOnlyEmployees()) {
			writer1.println(employee.getId()+":"+employee.getName());
		}
	}catch (IOException e) {
		System.out.println("exception block while writing");
	}
}
}
