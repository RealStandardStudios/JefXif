package jefXif.interfaces;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import jefXif.io.Data;

/**
 * An interface to allow reading of Kryo files
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public interface DataFileReader {
	
	/**
	 * Reads the data from the specified file and returns an ArrayList of the specified class from it
	 * @param file The file to read the data from
	 * @param dataClass The type of data to read from the file
	 * @return An array list of the specified data type from the file
	 * @throws IOException Throws this if there is somthing wrong with the file
	 */
	@SuppressWarnings("unchecked")
	public default <T> ArrayList<T> readDataFile(File file,  java.lang.Class<T> dataClass)
			throws IOException {
		ArrayList<T> arrayList = new ArrayList<T>();
		Object[] readItems = Data.Read(file.getPath(), Object[].class);
		for (Object object : readItems) {
			arrayList.add((T)object);
		}
		return arrayList;
	}
}
