package jefXif;

import java.io.IOException;

import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * @author Real Standard Studios - Matthew Meehan
 *
 */
public abstract class Gui implements PartialLoader{
	public static String FileLoc = "../view/partials/";
	private Stage primaryStage;
	private BorderPane rootLayout;
	
	
	public Gui(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}
	
	public abstract void initialize();


	public abstract void initRootLayout();
	
	public abstract void loadPartials() throws IOException;
	
	public abstract void loadData();

	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}

	public BorderPane getRootLayout() {
		return rootLayout;
	}

	public void setRootLayout(BorderPane rootLayout) {
		this.rootLayout = rootLayout;
	}
	
	
}
