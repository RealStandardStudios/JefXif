package jefXif;

import java.io.File;
import java.io.IOException;

public abstract class MainPartialController extends WindowController {

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

}
