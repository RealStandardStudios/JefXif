package jefXif.view;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;

public abstract class RootLayoutController {
	protected Gui ui;
	
	@FXML
	protected BorderPane rootLayout;

	/**
	 * @return the ui
	 */
	public Gui getInterface() {
		return ui;
	}

	/**
	 * @param ui the ui to set
	 */
	public abstract void setInterface(Gui ui);
	
	
}
