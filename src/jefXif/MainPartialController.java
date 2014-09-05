package jefXif;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import jefXif.io.Data;

public abstract class MainPartialController extends WindowController {

	public final String pathfinderDataLoc = "\\..\\..\\..\\..\\PathfinderData\\Data";
	
	/**
	 * Saves the data into the file through kryo or whatever
	 * is the current save method
	 * @param file The root path to where the files will be saved 
	 * E.g. C:/Program Files/RpgApp/Data/ 
	 */
	public abstract void saveDataToFile(File file) throws IOException;
	
	/**
	 * Loads the data from a files saved through kryo
	 * @param file The root path to where the files will be saved 
	 * E.g. C:/Program Files/RpgApp/Data/
	 */
	public abstract void loadDataFromFile(File file) throws IOException;
	
	/**
	 * Reads the data from the specified file and returns an ArrayList of the specified class from it
	 * @param file The file to read the data from
	 * @param dataClass The type of data to read from the file
	 * @return An array list of the specified data type from the file
	 * @throws IOException Throws this if there is somthing wrong with the file
	 */
	@SuppressWarnings("unchecked")
	public <T> ArrayList<T> readDataFile(File file,  java.lang.Class<T> dataClass)
			throws IOException {
		ArrayList<T> arrayList = new ArrayList<T>();
		Object[] readItems = Data.Read(file.getPath(), Object[].class);
		for (Object object : readItems) {
			arrayList.add((T)object);
		}
		return arrayList;
	}	

}
