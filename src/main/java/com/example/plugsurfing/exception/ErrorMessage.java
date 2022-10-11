package com.example.plugsurfing.exception;

import lombok.Getter;

import java.util.Date;

@Getter
public class ErrorMessage {
    private Integer statusCode;
    private Date timestamp;
    private String message;
    private String description;

    public ErrorMessage(int statusCode, Date timestamp, String message, String description) {
        this.statusCode = statusCode;
        this.timestamp = timestamp;
        this.message = message;
        this.description = description;
    }
}
