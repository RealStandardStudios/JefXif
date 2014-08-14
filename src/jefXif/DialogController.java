/**
 * 
 */
package jefXif;

import javafx.stage.Stage;

/**
 * A base class for the Dialog Controller
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public abstract class DialogController extends WindowController {
	
	private Stage dialogStage;
	
	/*
	 * Sets the dialogStage
	 */
	public void setDialogStage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}
	
	/**
	 * 
	 * @returns a dialog stage
	 */
	public Stage getDialogStage() {
		return this.dialogStage;
	}
	
	/**
	 * initialiser for DialogController
	 */
	@Override
	public void initialize() {
		// TODO Auto-generated method stub

	}

}
