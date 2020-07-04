package application.controller;

import java.util.Optional;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;

public class Confirm {
	public static boolean askConfirmation() {
		Alert confirm = new Alert(AlertType.CONFIRMATION);
		confirm.setHeaderText(null);
		confirm.setContentText("Are you sure?");
		confirm.setTitle("QuickBill - by Kumar Dhakal");
		ButtonType buttonYes = new ButtonType("Yes"),
				buttonNo = new ButtonType("No");

		confirm.getButtonTypes().setAll(buttonYes, buttonNo);
		
		Optional<ButtonType> response = confirm.showAndWait();
		if(response.isPresent() && response.get() == buttonYes) {
			return true;
		}
		return false;		
	}
}
