package jefXif.io.serializers;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;

public class ObjectPropertySerializer extends
		Serializer<ObjectProperty<Object>> {

	@Override
	public ObjectProperty<Object> read(Kryo arg0, Input arg1,
			Class<ObjectProperty<Object>> arg2) {
		return new SimpleObjectProperty<Object>(arg0.readClassAndObject(arg1));
	}

	@Override
	public void write(Kryo arg0, Output arg1, ObjectProperty<Object> arg2) {
		arg0.writeClassAndObject(arg1, arg2.get());
	}

}
