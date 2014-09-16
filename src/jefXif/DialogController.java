/**
 * 
 */
package jefXif;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;

/**
 * A base class for the Dialog Controller
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public abstract class DialogController extends WindowController {
	public boolean okayClicked = false;
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
	
	@FXML
	public void handleCancel(ActionEvent event) {
		this.dialogStage.close();
	}
	
	@FXML
	public abstract void handleOkay(ActionEvent event);
	
	public boolean isOkayClicked() {
		return this.okayClicked;
	}

}
