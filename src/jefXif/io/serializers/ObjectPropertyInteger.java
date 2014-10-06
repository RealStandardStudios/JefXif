package jefXif.io.serializers;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;

public class ObjectPropertyInteger extends Serializer<ObjectProperty<Integer>> {

	@Override
	public ObjectProperty<Integer> read(Kryo kryo, Input input, Class<ObjectProperty<Integer>> Class) {
		return new SimpleObjectProperty<Integer>(kryo.readObject(input, Integer.class));
	}

	@Override
	public void write(Kryo kryo, Output output, ObjectProperty<Integer> data) {
		kryo.writeObject(output, data.get());
	}
	
}
