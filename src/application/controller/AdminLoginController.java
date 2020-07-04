package application.controller;

import java.io.IOException;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AdminLoginController {

	@FXML
	private TextField username;

	@FXML
	private TextField password;

	@FXML
	private Button login, cancel;
	
	@FXML
	private Hyperlink link;

	@FXML
	private void loginBtnHandler() throws IOException {
		Stage stage = Main.getMainStage();
		// TODO to be matched from database later
		if (username.getText().equals("a") && password.getText().equals("a")) {
			
			AnchorPane adminPanel = new AnchorPane();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("AdminPanel.fxml"));
			adminPanel = loader.load();
			Scene scene = new Scene(adminPanel, 1024, 500);

			stage.setTitle("Admin Panel");
			stage.setScene(scene);
			stage.show();

		} else {
//			Alert error = new Alert(AlertType.ERROR);
//			error.setHeaderText("You have entered wrong username or password");
//			error.setContentText("Please try again!");
//			error.showAndWait();
			Error.showError("You have entered wrong username or password", "Please try again");
		}
	}

	@FXML
	private void cancelBtnHandler() throws IOException {
		Stage stage = Main.getMainStage();
		AnchorPane mainPane = new AnchorPane();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("..//Welcome.fxml"));
		mainPane= loader.load();
		Scene scene = new Scene(mainPane, 600, 340);
		
		stage.setTitle("QuickBill - by Kumar Dhakal");
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	private void registerLinkHandler() {
		AnchorPane registerPanel = new AnchorPane();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("AdminRegister.fxml"));
		Stage registerStage = Main.getMainStage();
		try {
			registerPanel = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scene scene = new Scene(registerPanel, 400, 470);
		
		registerStage.setScene(scene);
		registerStage.setTitle("Register for a new admin");
		registerStage.show();	
	}

}
