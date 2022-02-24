package com.example.qualitelogiciel.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import com.example.qualitelogiciel.model.User;
import com.example.qualitelogiciel.MainApp;

public class Login {
	@FXML
	private Button loginButton;
	@FXML
	private Label wrongLoginLabel;
	@FXML
	private TextField usernameField;
	@FXML
	private PasswordField passwordField;
	public static User userConnected;

	public void userLogin(ActionEvent event) throws IOException{
		checkLogin();
	}
	public void userSignIn (ActionEvent event) throws IOException{
		MainApp m = new MainApp();
		m.changeScene("SignInView.fxml");

	}

	public void checkLogin() throws IOException {
		ManageJson mg= new ManageJson("usersList.json");
		if(usernameField.getText().isEmpty() || passwordField.getText().isEmpty()) {
			wrongLoginLabel.setText("please enter your data!");
		}
		else{
			MainApp m = new MainApp();
			mg.generateUsersList();
			for(User us : mg.getUserList()){
				if(us.getUsername().equals(usernameField.getText().toString()) && us.getPassword().equals(passwordField.getText().toString())) {
					userConnected=us;
					wrongLoginLabel.setText("sucess!");
					m.changeScene("UserDashboardView.fxml");
				}
			}
		}
		wrongLoginLabel.setText("please enter your data!");
		


		


	}

}
