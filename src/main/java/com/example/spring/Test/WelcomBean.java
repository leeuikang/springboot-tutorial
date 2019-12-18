package com.example.spring.Test;

public class WelcomBean {
    private  String message;
    WelcomBean(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
