package jefXif.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import jefXif.io.serializers.ObjectPropertySerializer;
import jefXif.io.serializers.ObservableListWrapperSerializer;
import jefXif.io.serializers.StringPropertySerializer;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.sun.javafx.collections.ObservableListWrapper;

/**
 * A static Class that reads and writes other objects
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class Data {
	private static final Kryo kryo = new Kryo();

	/**
	 * universal class to write data
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
		kryo.register(ObservableListWrapper.class, new ObservableListWrapperSerializer());
		kryo.register(new SimpleObjectProperty<Object>().getClass(), new ObjectPropertySerializer());

		output = new Output(new FileOutputStream(filePath));
		kryo.writeObject(output, data);
		//writeObject(kryo, output, data);
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
		kryo.register(ObservableListWrapper.class, new ObservableListWrapperSerializer());
		kryo.register(new SimpleObjectProperty<Object>().getClass(), new ObjectPropertySerializer());
		
		Input input = new Input(new FileInputStream(filePath));
		result = kryo.readObject(input, Class);
		input.close();
		return result;
	}
	
//	/**
//	 * A method to slow down the writing process
//	 * 
//	 * @param kryo
//	 * @param output
//	 * @param data
//	 */
//	private static void writeObject(Kryo kryo, Output output, Object data) {
//		try {
//			kryo.writeObject(output, data);
//		} catch (ConcurrentModificationException |KryoException e) {
//			try {
//				e.printStackTrace();
//				TimeUnit.SECONDS.sleep(1);
//				writeObject(kryo, output, data);
//			} catch (InterruptedException e1) {
//				Dialogs.create().title("ERROR").masthead("Dangerous coding has produced an error").message(e.getMessage()).showWarning();
//				e1.printStackTrace();
//			}
//		}
//	}
}
