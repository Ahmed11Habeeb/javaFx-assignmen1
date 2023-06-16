package com.example.assignment1.controller;

import com.example.assignment1.model.ConvertCurrency;
import com.example.assignment1.view.CurrencyConversation;
import com.example.assignment1.view.ViewManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ConversionController {

    @FXML
    private TextField usd;

    @FXML
    private TextField nis;

    @FXML
    void convert(ActionEvent event) {
        String usdValue=usd.getText();
        String nisValue=nis.getText();

        if(usdValue.isEmpty()){
            String value= String.valueOf(ConvertCurrency.nisToUsd(Double.parseDouble(nisValue)));
            usd.setText(value);
        }else if(nisValue.isEmpty()){
            String value= String.valueOf(ConvertCurrency.usdToNis(Double.parseDouble(usdValue)));
            nis.setText(value);
        }
    }

    @FXML
    void logOut(ActionEvent event) throws IOException {
        ViewManager.getCurrencyConversionPage().close();
        ViewManager.getLogInPage().show();
    }

}
