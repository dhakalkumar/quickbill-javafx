package application.controller;

import java.io.IOException;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AdminPanelController {

	@FXML
	private Label cashier, transaction, stock, sales, exit, statusBar;

	@FXML
	private void cashierButtonHandler() {
		Stage cashierStage = new Stage();
		cashierStage.setResizable(false);
		FXMLLoader loader = new FXMLLoader(getClass().getResource("AddCashier.fxml"));
		AnchorPane anchorPane = new AnchorPane();
		
		try {
			anchorPane = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scene scene = new Scene(anchorPane, 704, 400);
				
		cashierStage.setTitle("Add cashier");
		cashierStage.setScene(scene);
		cashierStage.show();		
	}
	
	@FXML
	private void mouseEnteredEventHandler() {
		Label source = new Label();		
	
	}

	@FXML
	private void transactionButtonHandler() {
		Stage tranStage = new Stage();
		tranStage.setResizable(false);
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Transaction.fxml"));
		AnchorPane anchorPane = new AnchorPane();
		try {
			anchorPane = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scene scene = new Scene(anchorPane, 700, 400);
		
		tranStage.setTitle("Transaction details");
		tranStage.setScene(scene);
		tranStage.show();		
	}

	@FXML
	private void stockButtonHandler() {
		Stage stockStage = new Stage();
		stockStage.setResizable(false);
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Stock.fxml"));
		AnchorPane anchorPane = new AnchorPane();
		try {
			anchorPane = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Scene scene = new Scene(anchorPane, 700, 400);
		stockStage.setTitle("Current Stock");
		stockStage.setScene(scene);
		stockStage.show();
	}

	@FXML
	private void salesButtonHandler() {
		Stage salesStage = new Stage();
		salesStage.setResizable(false);
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Sales.fxml"));
		AnchorPane anchorPane = new AnchorPane();
		try {
			anchorPane = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scene scene = new Scene(anchorPane, 700, 400);
		salesStage.setTitle("Sales");
		salesStage.setScene(scene);
		salesStage.show();
	}

	@FXML
	private void exitButtonHandler() {
		if(Confirm.askConfirmation()) {
			Platform.exit();
		}
	}
}
