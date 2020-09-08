package fileoperations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadAndCreateStaticObjects {
	public static void main(String[] args) {
		String fileName = FileUtils.ROOT_PATH + "employee.txt";
		List<Employee> employees = EmployeeList.returnReadOnlyEmployees();

		try (FileWriter fw = new FileWriter(fileName)) {
			for (Employee e : employees) {
				fw.write(e.getId() + ":" + e.getName() + "\n");
			}
		} catch (IOException e) {
			System.out.println("catch block called while writing");
			e.printStackTrace();
		}
		readDatausingReader(fileName);
		readDataUsingScanner(fileName);
	}

	private static void readDataUsingScanner(String fileName) {
		List<Employee> employessRead = new ArrayList<Employee>() ;
		try (Scanner scanner = new Scanner(new FileReader(fileName))) {
			while(scanner.hasNextLine()) {
				String nextLine = scanner.nextLine();
				System.out.println("iterator ki shuruat "+nextLine);
				employessRead.add(new Employee(nextLine.split(":")[0], nextLine.split(":")[1]));
			}
		} catch (IOException e) {
		}
		//scannre defnined inside the try resoruce wont be accesible outside
		//scanner.class;
		employessRead.stream().forEach(System.out::println);
	}

	private static void readDatausingReader(String fileName) {
		List<Employee> employessRead = null;
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			List<String> lines = reader.lines().collect(Collectors.toList());

			employessRead = reader.lines().map(str -> new Employee(str.split(":")[0], str.split(":")[1]))
					.collect(Collectors.toList());
			for (String readLine : lines) {
				String[] split = readLine.split(":");
				employessRead.add(new Employee(split[0], split[1]));
			}
		} catch (IOException e) {
			System.out.println("catch block called while reading");
			e.printStackTrace();
		}

		employessRead.forEach(System.out::println);
	}
}
