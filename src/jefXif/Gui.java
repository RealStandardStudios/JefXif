package jefXif;

import java.io.File;
import java.io.IOException;
import java.util.prefs.Preferences;

import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * A base class for the GUI
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public abstract class Gui implements PartialLoader{
	public static String FileLoc = "../view/partials/";
	public static String DataFileLoc = "\\PathfinderData\\Data\\";
	private Stage primaryStage;
	private BorderPane rootLayout;
	
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
	 * loadPartials method for Gui
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
	public BorderPane getRootLayout() {
		return rootLayout;
	}

	/**
	 * setRootLayout method for GUI
	 * 
	 * @param rootLayout
	 */
	public void setRootLayout(BorderPane rootLayout) {
		this.rootLayout = rootLayout;
	}
	
	public File getProgramFilePath() {
	    Preferences prefs = Preferences.userNodeForPackage(this.getClass());
	    String filePath = prefs.get("filePath", null);
	    if (filePath != null) {
	        return new File(filePath);
	    } else {
	        return null;
	    }
	}
	
	public void setProgramFilePath(File file) {
	    Preferences prefs = Preferences.userNodeForPackage(this.getClass());
	    if (file != null) {
	        prefs.put("filePath", file.getPath());
	    } else {
	        prefs.remove("filePath");
	    }
	}
	
}
