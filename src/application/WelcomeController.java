package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class WelcomeController {
	
	@FXML
	private Button adminLoginButton, cashierLoginButton;

	@FXML
	private void adminLoginHandler() throws IOException {
		Stage mainStage = Main.getMainStage();
		AnchorPane adminRoot = new AnchorPane();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("controller/AdminLogin.fxml"));
		adminRoot = loader.load();	
		
		Scene scene = new Scene(adminRoot, 400, 260);
		
		//mainStage.setResizable(false);
		mainStage.setTitle("Admin Login");
		mainStage.setScene(scene);
		mainStage.show();

	}

	@FXML
	private void cashierLoginHandler() throws IOException {
		Stage mainStage = Main.getMainStage();
		AnchorPane cashierRoot = new AnchorPane();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("controller/CashierLogin.fxml"));
		cashierRoot = loader.load();
		Scene scene = new Scene(cashierRoot, 400, 260);
		
		//mainStage.setResizable(false);
		mainStage.setTitle("Cashier Login");
		mainStage.setScene(scene);
		mainStage.show();

	}
	
	@FXML
	private void aboutController() throws IOException {
		Stage aboutStage = new Stage();
		AnchorPane about = new AnchorPane();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("controller/About.fxml"));
		about = loader.load();
		Scene scene = new Scene(about, 500, 300);
		
		aboutStage.setTitle("About");
		aboutStage.setScene(scene);
		aboutStage.show();
	}
}




