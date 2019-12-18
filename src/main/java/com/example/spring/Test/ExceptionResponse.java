package com.example.spring.Test;

import java.util.Date;

public class ExceptionResponse {
    private Date timestamp = new Date();
    private String message;
    private String details;

    ExceptionResponse(String message, String details){
        this.message = message;
        this.details = details;
    }

    Date getTimestamp(){
        return timestamp;
    }
    String getMessage(){
        return message;
    }
    String getDetails(){
        return details;
    }
}
