package jefXif;

import javafx.fxml.FXML;
import javafx.scene.Node;

/**
 * @author Real Standard Studios - Matthew Meehan
 *
 */
public abstract class WindowController {
	private Gui ui;
	private Node node;

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
	
	/**
	 * @return the node
	 */
	public Node getNode() {
		return node;
	}

	/**
	 * @param node the node to set
	 */
	public void setNode(Node node) {
		this.node = node;
	}
}
