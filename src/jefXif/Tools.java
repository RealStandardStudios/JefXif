package jefXif;

import java.io.File;
import java.util.ArrayList;

/**
 * @author Matthew
 * A class with some static support/tool methods
 */
public class Tools {
	/**
	 * Gets all the files for the folder and returns them in an array
	 * @param folder The folder to look in
	 * @return files The files found
	 */
	public static File[] listFilesForFolder(final File folder) {
		ArrayList<File> files = new ArrayList<>();
		for (final File fileEntry : folder.listFiles()) {
			if (!fileEntry.isDirectory()) {
				files.add(fileEntry);
			}
		}
		return files.toArray(new File[files.size()]);
	}
}
