package org.bookmyshow.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BookticketTest {
	public static void serializeObject(Object object, String fileName) throws IOException {
		FileOutputStream fo = new FileOutputStream(fileName);
		ObjectOutputStream o = new ObjectOutputStream(fo);
		o.writeObject(object);

	}

	// Deserialize an object from a file
	public static Object deserializeObject(String fileName) throws IOException, ClassNotFoundException {
		FileInputStream fi = new FileInputStream(fileName);
		ObjectInputStream os = new ObjectInputStream(fi);
		Object object = os.readObject();

		return object;
	}

}
