/**
 * 
 */
package jefXif;

import javafx.stage.Stage;

/**
 * A base class for the Dialog Controller
 * @author Real Standard Studios - Matthew Meehan
 */
public abstract class DialogController extends WindowController {
	
	private Stage dialogStage;
	
	public void setDialogStage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}
	
	public Stage getDialogStage() {
		return this.dialogStage;
	}
	
	@Override
	public void initialize() {
		// TODO Auto-generated method stub

	}

}
