package fileoperations.niousage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import fileoperations.FileUtils;
import serialization.ClassToSerialize;

public class SerializationUsingNIO {
	public static void main(String[] args) {
		ClassToSerialize obj = new ClassToSerialize("jai shree ram" ,108);
		Path path = Paths.get(FileUtils.ROOT_PATH + "serailzationUsingNIO.txt");
		System.out.println("inital object "+obj+"with hascode "+obj.hashCode());
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(path))) {
			objectOutputStream.writeObject(obj);
		} catch (IOException e) {
			System.err.println("exception while writing file");
		}
		
		try (ObjectInputStream is = new ObjectInputStream(Files.newInputStream(path))) {
			ClassToSerialize readObject =(ClassToSerialize) is.readObject();
			System.out.println("deseriazlized object "+readObject+" with hashcode "+readObject.hashCode() );
		} catch (IOException | ClassNotFoundException e) {
			System.err.println("exception while writing file");
		}
		

	}
}
