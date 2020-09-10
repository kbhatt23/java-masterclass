package fileoperations.niousage;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import fileoperations.Employee;
import fileoperations.FileUtils;

public class CreateEmployeeWithoutSpliteratot {

	public static void main(String[] args) {
		Path path = Paths.get(FileUtils.ROOT_PATH + "employeesNio.txt");
		List<String> lines = null;
		try (BufferedReader reader = Files.newBufferedReader(path)) {
				lines = reader.lines().collect(Collectors.toList());
		} catch (IOException e) {
			System.err.println("Exception occurred while reading file " + e);
		}
		
		if(lines == null || lines.isEmpty()) {
			System.err.println("empty file");
		}else {
			List<Employee> employees= new ArrayList<Employee>();
			for(int i=0 ;i<lines.size()-1; i=i+2) {
				Employee emp = new Employee(lines.get(i), lines.get(i+1));
				employees.add(emp);
			}
			employees.forEach(System.out::println);
		}
	}
}
