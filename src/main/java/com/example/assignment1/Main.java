package com.example.assignment1;

import com.example.assignment1.view.ViewManager;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public void start(Stage stage) throws IOException {
        ViewManager.getLogInPage().show();
    }

    public static void main(String []args){
        launch(args);
    }
}
