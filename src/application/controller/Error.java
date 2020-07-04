package application.controller;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Error {
	public static void showError(String header, String content) {
		Alert error = new Alert(AlertType.ERROR);
		if (header.isBlank()) {
			error.setHeaderText(null);
			error.setContentText(content);
			error.showAndWait();
		} else if (content.isBlank()) {
			error.setContentText(null);
			error.setHeaderText(header);
			error.showAndWait();
		} else {
			error.setHeaderText(header);
			error.setContentText(content);
			error.showAndWait();
		}
	}
}
