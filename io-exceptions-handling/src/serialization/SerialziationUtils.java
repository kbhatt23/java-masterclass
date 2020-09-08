package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialziationUtils<T> {

	public void serialzieObject(T obj, String fileName) {
		ObjectOutputStream os = null;
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			os = new ObjectOutputStream(fos);
			os.writeObject(obj);

		} catch (IOException e) {
			System.out.println("exception while writing file. "+e);
		} finally {
			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public T deserialzeObject(String fileName) {
		ObjectInputStream ois = null;
		try {
			FileInputStream fis = new FileInputStream(fileName);
			ois = new ObjectInputStream(fis);
			return (T) ois.readObject();
		} catch (Exception e) {
			System.out.println("exception occured while reading object "+e);
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
	}
}
