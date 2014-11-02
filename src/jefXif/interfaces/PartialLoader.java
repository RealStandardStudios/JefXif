package jefXif.interfaces;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import jefXif.view.Gui;
import jefXif.view.WindowController;

/**
 * Provides the ability to perform partial loads
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public interface PartialLoader {
	default WindowController loadPartial(String name, Gui ui, Class className) throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(className.getResource(name + "Partial.fxml"));
		
		AnchorPane partial = loader.load();
		WindowController controller = loader.getController();
		controller.setInterface(ui);
		controller.setNode(partial);
		controller.setRoot(ui.getRootLayout());
		return controller;
	}
}