package com.example.assignment1.model;

public class LogInData {

    private static String userName="Ahmed";
    private static String password="123456";

    public static boolean logInCheck(String userName,String password){
        boolean userNameCheck=userName.equals(LogInData.userName);
        boolean passwordCheck=password.equals(LogInData.password);
        return userNameCheck&&passwordCheck;
    }
}
