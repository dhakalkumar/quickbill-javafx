package application.controller;

import java.io.IOException;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CashierLoginController {
	@FXML
	private TextField username;

	@FXML
	private TextField password;

	@FXML
	private Button login, cancel;

	@FXML
	private void loginBtnHandler() {
		Stage stage = Main.getMainStage();
		if (username.getText().equals("user") && password.getText().equals("user")) {
			AnchorPane cashierPanel = new AnchorPane();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("CashierPanel.fxml"));
			try {
				cashierPanel = loader.load();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Scene scene = new Scene(cashierPanel, 1024, 500);

			stage.setTitle("Cashier Panel");
			stage.setScene(scene);
			stage.show();
		} else {
			Alert error = new Alert(AlertType.ERROR);
			error.setHeaderText("You have entered wrong username or password");
			error.setContentText("Please try again!");
			error.showAndWait();
		}
	}

	@FXML
	private void cancelBtnHandler() {
		Stage stage = Main.getMainStage();
		AnchorPane mainPane = new AnchorPane();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("..//Welcome.fxml"));
		try {
			mainPane = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scene scene = new Scene(mainPane, 600, 340);
		
		stage.setTitle("QuickBill - by Kumar Dhakal");
		stage.setScene(scene);
		stage.show();
	}
}
