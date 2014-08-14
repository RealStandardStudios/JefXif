package jefXif.io.serializers;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;

/**
 * This class gives us the ability to read/write the StringPropertySerializer object
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class StringPropertySerializer extends Serializer<StringProperty> {

	/**
	 * a method for reading a StringProperty
	 */
	@Override
	public StringProperty read(Kryo kryo, Input input, Class<StringProperty> spClass) {
		return new SimpleStringProperty(kryo.readObject(input, String.class));
	}

	/**
	 * a method for writing to a StringProperty
	 */
	@Override
	public void write(Kryo kryo, Output output, StringProperty stringP) {
		kryo.writeObject(output, stringP.getValue());
	}

}
