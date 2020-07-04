package application.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AddCashierController {

	@FXML private TextField id;
	@FXML private TextField name;
	@FXML private TextField mobile;
	@FXML private TextField address;
	@FXML private TextField email;
	@FXML private TextField password;
	
	@FXML private Button addNew;
	@FXML private Button update;
	@FXML private Button delete;
	
	@FXML private void buttonAddNew() {
		Error.showError("", "Add new button");
	}
	@FXML private void buttonUpdate() {
		Error.showError("", "Update button");
	}
	@FXML private void buttonDelete() {
		Error.showError("", "Delete button");
	}
	
}
