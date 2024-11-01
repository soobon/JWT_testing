package com.example.JWT_version2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class EmailExisted extends RuntimeException{
    private String message;

    public EmailExisted(String message){
        super(message);
        this.message = message;
    }
}
