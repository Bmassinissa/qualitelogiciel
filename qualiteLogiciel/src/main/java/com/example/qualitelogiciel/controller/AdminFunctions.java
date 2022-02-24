package com.example.qualitelogiciel.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import com.example.qualitelogiciel.model.User;
import com.example.qualitelogiciel.MainApp;

public class AdminFunctions {
	@FXML
	private Button logOutButton ;
	@FXML
	private Button dispalyUsersButton;
	@FXML
	private TableView<User> usersListeTable;
	
	
	public void usersDisplay(ActionEvent event) throws IOException{
		DisplayUsersInformations();
	}
	
	public void logOut(ActionEvent event) throws IOException{
		MainApp m = new MainApp();
		m.changeScene("../views/LoginView.fxml");

	}


	private void DisplayUsersInformations() throws IOException {
		//TODO: displaying users list infomrations in the table
		
	}
	
}
