package jefXif.view;

import java.io.File;
import java.io.IOException;
import java.util.prefs.Preferences;

import javafx.stage.Stage;
import jefXif.interfaces.PartialLoader;

/**
 * A base class for the GUI
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public abstract class Gui implements PartialLoader{
	public static String FileLoc = "../view/partials/";
	public static String DataFileLoc = "\\PathfinderData\\Data\\";
	private Stage primaryStage;
	private RootLayoutController rootLayoutController;
	
	/**
	 * Constructor for GUI
	 * 
	 * @param primaryStage
	 */
	public Gui(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}
	
	/**
	 * Initialise Method for GUI
	 */
	public abstract void initialize();

	/**
	 * initRootLayout method for GUI
	 */
	public abstract void initRootLayout();
	
	/**
	 * loadPartials method for GUI
	 * 
	 * @throws IOException
	 */
	public abstract void loadPartials() throws IOException;
	
	/**
	 * loadData method for GUI
	 */
	public abstract void loadData();

	/**
	 * getPrimaryStage method for GUI
	 * 
	 * @returns primary stage
	 */
	public Stage getPrimaryStage() {
		return primaryStage;
	}

	/**
	 * setPrimaryStage method for GUI
	 * 
	 * @param primaryStage
	 */
	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}

	/**
	 * getRootLayout method for GUI
	 * 
	 * @returns rootLayout
	 */
	public RootLayoutController getRootLayout() {
		return rootLayoutController;
	}

	/**
	 * setRootLayout method for GUI
	 * 
	 * @param rootLayout
	 */
	public void setRootLayout(RootLayoutController rootLayout) {
		this.rootLayoutController = rootLayout;
	}
	
	/**
	 * getProgramFilePath method for the GUI
	 * 
	 * @returns either a filePath or null
	 */
	public File getProgramFilePath() {
	    Preferences prefs = Preferences.userNodeForPackage(this.getClass());
	    String filePath = prefs.get("filePath", null);
	    if (filePath != null) {
	        return new File(filePath);
	    } else {
	        return null;
	    }
	}
	
	/**
	 * setProgramFilePath method for GUI
	 * 
	 * @param file - a File
	 */
	public void setProgramFilePath(File file) {
	    Preferences prefs = Preferences.userNodeForPackage(this.getClass());
	    if (file != null) {
	        prefs.put("filePath", file.getPath());
	    } else {
	        prefs.remove("filePath");
	    }
	}
	
}
