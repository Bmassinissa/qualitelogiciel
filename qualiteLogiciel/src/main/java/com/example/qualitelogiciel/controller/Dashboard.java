package com.example.qualitelogiciel.controller;

import java.io.IOException;

import com.example.qualitelogiciel.model.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import com.example.qualitelogiciel.MainApp;

public class Dashboard {
	@FXML
	private Button logOutButton ;
	@FXML
	private Button displayButton ;
	@FXML
	private TextField displayMail;
	@FXML
	private TextField displayUsername;
	@FXML
	private TextField displayPhoneNumber;
	@FXML
	private TextField displaybirthday;
	@FXML
	private TextField displayAdress;
	
	
	public void userInformationsDispay(ActionEvent event) throws IOException{
		DisplayInformations();
	}
	
	public void logOut(ActionEvent event) throws IOException{
		MainApp m = new MainApp();
		m.changeScene("LoginView.fxml");

	}


	private void DisplayInformations() throws IOException {
		displayMail.setText(Login.userConnected.getMail());
		displayUsername.setText(Login.userConnected.getUsername());
		displayPhoneNumber.setText(Login.userConnected.getPhoneNumber());
		displaybirthday.setText(Login.userConnected.getBirthday().toString());
		displayAdress.setText(Login.userConnected.getRoad() + " ," + Login.userConnected.getCity());
	}
	
}
