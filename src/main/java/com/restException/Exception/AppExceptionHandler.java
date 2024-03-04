package com.restException.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(value = UserNotFoundException.class)
	public ResponseEntity<ErrorInfo> UserNotFoundExceptionmsg(UserNotFoundException e) {
		String message = e.getMessage();
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setCode("X12432");
		errorInfo.setMsg("This is Custom error message "+message);
		errorInfo.setWhen(LocalDateTime.now());

		return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ErrorInfo> globalErrormsg(Exception e) {
		String message = e.getMessage();
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setCode("X123");
		errorInfo.setMsg("This is Global Error page--" + message);
		errorInfo.setWhen(LocalDateTime.now());
		return new ResponseEntity<>(errorInfo, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
