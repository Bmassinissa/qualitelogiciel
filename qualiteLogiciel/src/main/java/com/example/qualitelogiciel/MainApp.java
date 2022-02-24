package com.example.qualitelogiciel;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
	private static Stage stg;
	@Override
	public void start(Stage primaryStage)  {
		stg= primaryStage;
		stg.setResizable(false);
		
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("LoginView.fxml"));

			Scene scene = new Scene(root, 600, 400);
			stg.setScene(scene);
			stg.setTitle("Software quality Application");
			stg.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void changeScene(String fxml) throws IOException {
		Parent panne = FXMLLoader.load(getClass().getResource(fxml));
		stg.getScene().setRoot(panne);
	}

	public static void main(String[] args) {
		launch(args);
	}

	
}
