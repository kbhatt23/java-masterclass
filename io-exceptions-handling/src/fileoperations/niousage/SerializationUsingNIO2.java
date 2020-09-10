package fileoperations.niousage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import fileoperations.FileUtils;
import serialization.ClassToSerialize;

public class SerializationUsingNIO2 {
	public static void main(String[] args) {
		ClassToSerialize obj = new ClassToSerialize("jai shree ram" ,108);
		ClassToSerialize obj2 = new ClassToSerialize("jai shree krishna" ,111);
		ClassToSerialize obj3 = new ClassToSerialize("jai uma shankar" ,107);
		List<ClassToSerialize> listObj = new ArrayList<ClassToSerialize>();
		listObj.add(obj);listObj.add(obj2);listObj.add(obj3);
		Path path = Paths.get(FileUtils.ROOT_PATH + "serailzationUsingNIO.txt");
		System.out.println("inital object "+listObj+"with hascode "+obj.hashCode());
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(path))) {
			objectOutputStream.writeObject(listObj);
		} catch (IOException e) {
			System.err.println("exception while writing file");
		}
		
		try (ObjectInputStream is = new ObjectInputStream(Files.newInputStream(path))) {
			List<ClassToSerialize> readObject =(List<ClassToSerialize>) is.readObject();
			System.out.println("deseriazlized object "+readObject+" with hashcode "+readObject.hashCode() );
		} catch (IOException | ClassNotFoundException e) {
			System.err.println("exception while writing file");
		}
		

	}
}
