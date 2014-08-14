package jefXif.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javafx.beans.property.SimpleStringProperty;
import jefXif.io.serializers.StringPropertySerializer;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;

/**
 * A static Class that reads and writes other objects
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class Data {
	private static final Kryo kryo = new Kryo();

	/**
	 * universal class to write datd
	 * 
	 * @param filePath
	 * @param data
	 * @return true if worked, otherwise throws exception
	 * @throws IOException
	 */
	public static boolean Write(String filePath, Object data)
			throws IOException {
		Output output;
		boolean result = true;
		
		kryo.register(SimpleStringProperty.class, new StringPropertySerializer());

		output = new Output(new FileOutputStream(filePath));
		kryo.writeObject(output, data);
		if (output != null)
			output.close();
		return result;
	}

	/**
	 * takes a class and reads in data and tries to return it as a class
	 * 
	 * @param filePath
	 * @param Class
	 * @return the result of the class in T
	 * @throws IOException
	 */
	public static <T> T Read(String filePath, Class<T> Class)
			throws IOException {
		T result;
		
		kryo.register(SimpleStringProperty.class, new StringPropertySerializer());
		
		Input input = new Input(new FileInputStream(filePath));
		result = kryo.readObject(input, Class);
		input.close();
		return result;
	}
}
