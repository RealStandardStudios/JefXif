package jefXif.view;

import javafx.stage.Stage;

public abstract class HoverDialog extends WindowController {
	Stage dialogStage;

	/**
	 * @return the dialogStage
	 */
	public Stage getDialogStage() {
		return dialogStage;
	}

	/**
	 * @param dialogStage the dialogStage to set
	 */
	public void setDialogStage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}
	
	
}
