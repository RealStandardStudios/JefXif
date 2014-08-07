package jefXif;

import javafx.fxml.FXML;

/**
 * @author Real Standard Studios - Matthew Meehan
 *
 */
public abstract class WindowController {
	private Gui ui; 
	
	/**
	 * Initializes the controller class. This method is automatically called
	 * after the fxml file has been loaded.
	 */
	@FXML
	public abstract void initialize();
	
	public void setInterface(Gui ui) {
		this.ui = ui;
	}
	
	public Gui getInterface() {
		return this.ui;
	}
}
