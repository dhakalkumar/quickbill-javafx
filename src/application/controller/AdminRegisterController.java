package application.controller;

import java.io.IOException;

import application.Main;
import application.model.Admin;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AdminRegisterController {
	
	@FXML
	private TextField firstName, lastName, username, password, cPassword;
	
	@FXML
	private TextArea address;
	
	@FXML
	private DatePicker dob;
	
	@FXML
	private Button registerButton, cancelButton;
	
	@FXML
	private Hyperlink loginLink;
	
	@FXML
	private void registerButtonHandler() {
		Admin admin = new Admin();
		if(!(firstName.getText().isEmpty() || lastName.getText().isEmpty() || username.getText().isEmpty() ||
				password.getText().isEmpty() || cPassword.getText().isEmpty() || address.getText().isEmpty() ||
				dob.getValue().toString().isEmpty())) {
			admin.setFname(firstName.getText());
			admin.setLname(lastName.getText());
			admin.setUsername(username.getText());
			admin.setPassword(password.getText());
			admin.setAddress(address.getText());
			admin.setDob(dob.getValue());
			
			if(!password.getText().equals(cPassword.getText())){
				Error.showError("", "The two password do not match. Please try again");
				return;
			}
			
			Alert info = new Alert(AlertType.INFORMATION);
			info.setHeaderText("You have entered the following data:");
			info.setContentText("First Name: " + admin.getFname()+"\n"
							  + "Last Name: " + admin.getLname()+"\n"
							  + "Username: " + admin.getUsername()+"\n"
							  + "Password: " + admin.getPassword().replaceAll(".", "*")+"\n"
							  + "Address: " + admin.getAddress()+"\n"
							  + "Date of Birth: " + admin.getDob());
			info.showAndWait();
		} else {
			Error.showError("Please correct the following error:", 
				"One or more values that you have entered \nis invalid or empty.\nPlease correct them!");
		}
	}
	
	@FXML
	private void cancelButtonHandler() {
		Stage stage = Main.getMainStage();
		AnchorPane mainPane = new AnchorPane();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("..//Welcome.fxml"));
		try {
			mainPane= loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scene scene = new Scene(mainPane, 600, 340);
		
		stage.setTitle("QuickBill - by Kumar Dhakal");
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	private void loginLinkHandler() {
		Stage mainStage = Main.getMainStage();
		AnchorPane adminRoot = new AnchorPane();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("AdminLogin.fxml"));
		try {
			adminRoot = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		Scene scene = new Scene(adminRoot, 400, 260);
		
		//mainStage.setResizable(false);
		mainStage.setTitle("Admin Login");
		mainStage.setScene(scene);
		mainStage.show();

	}
	
	
}


