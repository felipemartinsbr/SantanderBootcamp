package com.project.bootcamp.exceptions;

public class ExceptionResponse {

    String message;


    public ExceptionResponse(String message){
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
