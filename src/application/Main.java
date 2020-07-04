package application;

import application.controller.Confirm;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
	// public static Stage mainWindow, adminLogin, cashierLogin, adminPanel,
	// cashierPanel;
	private static Stage mainStage;

	public static Stage getMainStage() {
		return mainStage;
	}

	@Override
	public void start(Stage primaryStage) {
		mainStage = primaryStage;
		mainStage.setOnCloseRequest(x -> {
			x.consume();
			if (Confirm.askConfirmation()) {
				Platform.exit();
			}
		});
		try {
			AnchorPane root = new AnchorPane();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Welcome.fxml"));
			root = loader.load();
			Scene scene = new Scene(root, 600, 340, Color.DARKRED);
			// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			// primaryStage.setResizable(false);
			primaryStage.setTitle("QuickBill - by Kumar Dhakal");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
