package com.example.assignment1.controller;

import com.example.assignment1.model.LogInData;
import com.example.assignment1.view.ViewManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LogInController {
    @FXML
    private TextField userName;
    @FXML
    private PasswordField password;

    @FXML
    private Label alert;
    @FXML
    void logIn(ActionEvent event) throws IOException {
        String userData=userName.getText();
        String passData=password.getText();
        boolean check= LogInData.logInCheck(userData,passData);
        if(check){
            ViewManager.getLogInPage().close();
            ViewManager.getCurrencyConversionPage().setCurrencyConversionScene();
            ViewManager.getCurrencyConversionPage().show();
            alert.setText("");
        }else
            alert.setText("Invalid logIn Data");

    }
}
