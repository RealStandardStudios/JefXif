package jefXif;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

public interface PartialLoader {
	default WindowController loadPartial(String name, Gui ui) throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(this.getClass().getResource(
				Strings.FileLoc + name + "Partial.fxml"));
		
		AnchorPane partial = loader.load();
		WindowController controller = loader.getController();
		controller.setInterface(ui);
		controller.setNode(partial);
		return controller;
	}
}