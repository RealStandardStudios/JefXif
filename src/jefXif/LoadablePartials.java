package jefXif;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

public interface LoadablePartials {
	default Node loadPartial(String name) throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(this.getClass().getResource(
				Strings.FileLoc + name + "Partial.fxml"));
		
		AnchorPane partial = loader.load();
		return partial;
	}
}