package com.example.qualitelogiciel.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.example.qualitelogiciel.model.User;


import com.example.qualitelogiciel.model.UsersList;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ManageJson {
	private List<User> userList;
	private String fileName;

	public ManageJson(String fileName) {
		super();
		this.userList= new ArrayList<User>();
		this.fileName = fileName;
	}
	
	public void setUserList(ArrayList<User> userList) {
		this.userList = userList;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public ArrayList<User> getUserList() {
		return (ArrayList<User>) this.userList;
	}
	
	public void generateUsersList() throws StreamReadException, DatabindException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		File doc = new File(fileName);
		BufferedReader obj = new BufferedReader(new FileReader(doc));
		String strng;
		String jsonArray ="";
		while ((strng = obj.readLine()) != null){
			jsonArray+=strng;
		}
		userList= objectMapper.readValue(jsonArray, new TypeReference<List<User>>(){});
	}
	
	public void addUser(User user) throws StreamWriteException, DatabindException, IOException {
		generateUsersList();
		this.userList.add(user);
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.writeValue(new File(fileName), userList);
	}
	
	public boolean existe(User user) throws IOException {
		generateUsersList();
		for(User us : userList){
			if(us.equals(user)) {
				return true;
			}
		}
		return false;
	}
	
}
