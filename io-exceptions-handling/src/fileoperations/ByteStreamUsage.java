package fileoperations;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

//wont store in human readabl=e text format
//it is alsi used in serlaization
public class ByteStreamUsage {

	public static void main(String[] args) {
		String fileName = FileUtils.ROOT_PATH + "bytestream.dat";

		try (DataOutputStream ds = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))) {
			List<Employee> employees = EmployeeList.returnReadOnlyEmployees();
			for (Employee employee : employees) {
				ds.writeUTF(employee.getId() + ":" + employee.getName());
			}
		} catch (IOException e) {

		}

		try (DataInputStream di = new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)))) {
			while (true) {
				String eachLine = di.readUTF();
				if(eachLine == null) {
					break;
				}
				System.out.println(eachLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
