package com.lucas.marsrover.exception;

public class UnknownCommandException extends RuntimeException{
    public UnknownCommandException(String message){
        super(message);
    }
}
