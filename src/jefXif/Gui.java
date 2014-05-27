package jefXif;

import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public abstract class Gui{
	private Stage primaryStage;
	private BorderPane rootLayout;
	
	
	public Gui(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}
	
	public abstract void initialize();


	public abstract void initRootLayout();


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
