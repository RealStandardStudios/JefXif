package jefXif.view;

import javafx.fxml.FXML;
import javafx.scene.Node;

/**
 * A base class for WindowController
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public abstract class WindowController {
	private Gui ui;
	private Node node;
	private WindowController parentWindow;
	
	private RootLayoutController root;

	/**
	 * Initializes the controller class. This method is automatically called
	 * after the fxml file has been loaded.
	 */
	@FXML
	public abstract void initialize();
	
	/**
	 * set method for Gui
	 * 
	 * @param ui
	 */
	public void setInterface(Gui ui) {
		this.ui = ui;
	}
	
	/**
	 * Get method for GUI
	 * 
	 * @returns a GUI
	 */
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

	public WindowController getParentWindow() {
		return parentWindow;
	}

	public void setParentWindow(WindowController parentWindow) {
		this.parentWindow = parentWindow;
	}

	/**
	 * @return the root
	 */
	public RootLayoutController getRoot() {
		return root;
	}

	/**
	 * @param root the root to set
	 */
	public void setRoot(RootLayoutController root) {
		this.root = root;
	}
	
}
