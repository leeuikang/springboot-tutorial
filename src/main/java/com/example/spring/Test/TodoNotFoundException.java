package com.example.spring.Test;

public class TodoNotFoundException extends RuntimeException{
    TodoNotFoundException(String message){
        super(message);
    }
}
