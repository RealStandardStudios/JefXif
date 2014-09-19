package jefXif.io.serializers;

import java.util.ArrayList;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.sun.javafx.collections.ObservableListWrapper;

public class ObservableListWrapperSerializer extends Serializer<ObservableListWrapper<Object>> {

	@Override
	public ObservableListWrapper<Object> read(Kryo kryo, Input input,
			Class<ObservableListWrapper<Object>> olwClass) {
		ArrayList<Object> objectList = new ArrayList<Object>();
		Object[] readObject = kryo.readObject(input, Object[].class);
		for (Object object : readObject) {
			objectList.add(object);
		}
		return new ObservableListWrapper<>(objectList);
	}

	@Override
	public void write(Kryo kryo, Output output, ObservableListWrapper<Object> observableListWrapper) {
		kryo.writeObject(output, observableListWrapper.toArray());		
	}

}
