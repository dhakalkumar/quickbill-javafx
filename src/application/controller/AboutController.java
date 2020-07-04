package application.controller;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.SwingUtilities;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AboutController {

	@FXML
	private Hyperlink email;

	@FXML
	private Hyperlink github;

	@FXML
	private void emailHandler() {
		if (Desktop.isDesktopSupported()) {
			new Thread(() -> {
				try {
					Desktop.getDesktop().mail(new URI("mailto:dhakalkumar10@gmail.com"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (URISyntaxException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		} else {
			Error.showError("Desktop browsing not supported in your system!", null);
		}
	}

	@FXML
	private void githubHandler() {
		if (Desktop.isDesktopSupported()) {
			new Thread(() -> {
				try {
					Desktop.getDesktop().browse(new URI("http://dhakalkumar.github.io"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (URISyntaxException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		} else {
			Error.showError("Desktop browsing not supported in your system!",
					"Try changing your browser or the system");
		}

	}
}
