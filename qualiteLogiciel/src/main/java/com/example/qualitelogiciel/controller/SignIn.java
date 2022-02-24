package com.example.qualitelogiciel.controller;

import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import com.example.qualitelogiciel.model.User;
import com.example.qualitelogiciel.MainApp;

public class SignIn {
	@FXML
	private Button signInButton;
	@FXML
	private Button alreadyHaveAccountButton;
	@FXML
	private Label notCorrectInformationsLabel;
	@FXML
	private TextField usernameField;
	@FXML
	private TextField mailField;
	@FXML
	private TextField phoneField;
	@FXML
	private TextField roadField;
	@FXML
	private TextField pcField;
	@FXML
	private TextField cityField;
	@FXML
	private DatePicker birthdayPicker;
	@FXML
	private PasswordField passwordField;
	
	public void signIn(ActionEvent event) throws IOException{
		checkSignIn();
	}

	private void checkSignIn() throws StreamWriteException, DatabindException, IOException {
		Date date = Date.from(Instant.from(birthdayPicker.getValue().atStartOfDay(ZoneId.systemDefault())));
		User newUser= new User(mailField.getText().toString(), passwordField.getText().toString(), usernameField.getText().toString(), phoneField.getText().toString(), date, roadField.getText().toString(), pcField.getText().toString(), cityField.getText().toString(), false);
		ManageJson mj= new ManageJson("usersList.json");
		if(mj.existe(newUser)) {
			
			notCorrectInformationsLabel.setText(" you already have an account !");
		}
		else {
			mj.addUser(newUser);
			MainApp m = new MainApp();
			m.changeScene("UserDashboardView.fxml");
		}
		
	}

	public void alreadyHaveAccount(ActionEvent event) throws IOException {
		MainApp m = new MainApp();
		m.changeScene("LoginView.fxml");
	}
	
}
