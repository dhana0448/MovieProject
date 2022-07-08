package com.example.demo.globalexceptions;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(Exception.class)
	String handlerOfTheExceptions(Exception e) 
	{
		return e.getMessage();
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	String validationErrors(MethodArgumentNotValidException ma) 
	{
		FieldError fe=ma.getFieldError();
		return ma.getFieldError().getField()+" : "+fe.getDefaultMessage();
	}

}
