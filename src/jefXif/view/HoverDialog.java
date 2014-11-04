package jefXif.view;

import javafx.scene.layout.AnchorPane;

public abstract class HoverDialog extends WindowController {
	AnchorPane pane;

	/**
	 * @return the dialogStage
	 */
	public AnchorPane getDialogStage() {
		return pane;
	}

	/**
	 * @param dialogStage the dialogStage to set
	 */
	public void setDialogStage(AnchorPane dialogStage) {
		this.pane = dialogStage;
	}
	
	
}
