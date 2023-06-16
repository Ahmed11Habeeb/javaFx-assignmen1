package com.example.assignment1.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CurrencyConversation extends Stage {

    private Scene currencyConversion;

    public void setCurrencyConversionScene() throws IOException {
        FXMLLoader loader=new FXMLLoader(getClass().getResource("currencyConversion.fxml"));
        currencyConversion=new Scene(loader.load());
        this.setScene(currencyConversion);
    }
}
