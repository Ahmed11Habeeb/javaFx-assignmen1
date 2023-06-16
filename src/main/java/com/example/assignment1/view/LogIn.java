package com.example.assignment1.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LogIn extends Stage {

    public LogIn() throws IOException {
        FXMLLoader loader=new FXMLLoader(getClass().getResource("logIn.fxml"));
        this.setScene(new Scene(loader.load()));
    }
}
