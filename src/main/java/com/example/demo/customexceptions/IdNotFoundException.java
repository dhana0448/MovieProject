package com.example.demo.customexceptions;

public class IdNotFoundException extends RuntimeException{

	public IdNotFoundException(String message) 
	{
		super(message);
	}
}
