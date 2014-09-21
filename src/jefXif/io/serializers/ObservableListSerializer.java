package jefXif.io.serializers;

import java.util.ArrayList;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.sun.javafx.collections.ObservableListWrapper;

public class ObservableListSerializer extends Serializer<ObservableListWrapper<Object>> {

	@Override
	public ObservableListWrapper<Object> read(Kryo kryo, Input input, Class<ObservableListWrapper<Object>> olClass) {
		ArrayList<Object> readObject = kryo.readObject(input, ArrayList.class);
		return new ObservableListWrapper<>(readObject);
	}

	@Override
	public void write(Kryo kryo, Output output, ObservableListWrapper<Object> observableList) {
		kryo.writeObject(output, observableList.toArray());
	}

}
