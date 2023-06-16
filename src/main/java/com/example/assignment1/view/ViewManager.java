package com.example.assignment1.view;

import com.example.assignment1.controller.ConversionController;

import java.io.IOException;

public class ViewManager {

    private static LogIn logIn;
    private static CurrencyConversation currencyConversion;

    public static LogIn getLogInPage() throws IOException {
        if(logIn==null)
            logIn=new LogIn();
        return logIn;
    }

    public static CurrencyConversation getCurrencyConversionPage(){
        if(currencyConversion==null)
            currencyConversion=new CurrencyConversation();
        return currencyConversion;
    }

}
