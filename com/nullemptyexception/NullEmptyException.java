package com.nullemptyexception;

public class NullEmptyException extends Exception{
    public NullEmptyException() {
        super("Invalid input provided");
    }
	
    public NullEmptyException(String message){
        super(message);
    }
}