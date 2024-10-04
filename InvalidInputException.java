package com.invalidinputexception;

public class InvalidInputException extends Exception{
    public InvalidInputException() {
        super("Invalid input provided");
    }
	
    public InvalidInputException(String message){
        super(message);
    }
}
