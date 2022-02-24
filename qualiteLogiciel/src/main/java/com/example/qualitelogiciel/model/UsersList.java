package com.example.qualitelogiciel.model;
import java.util.ArrayList;

public class UsersList {
    private ArrayList<User> list;

    public UsersList() {
        this.list = new ArrayList<User>();
    }

    public ArrayList<User> getList() {
        return list;
    }

    public void setList(ArrayList<User> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "UsersList{" +
                "list=" + list.toString() +
                '}';
    }
}
