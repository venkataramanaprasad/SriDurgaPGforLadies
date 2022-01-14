package com.sridurgapgforladies.exception;

import java.io.FileNotFoundException;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class AppExceptionsHandler {

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<Object> handleAnyException(Exception exception, WebRequest webRequest) {
		ApiException apiException = new ApiException(exception.getMessage(),exception, HttpStatus.INTERNAL_SERVER_ERROR,
				ZonedDateTime.now(ZoneId.of("Z")));
		return new ResponseEntity<>(apiException, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(value = ApiRequestException.class)
	public ResponseEntity<Object> handleApiRequestException(ApiRequestException apiRequestException) {

		ApiException apiException = new ApiException(apiRequestException.getMessage(), apiRequestException,
				HttpStatus.BAD_REQUEST, ZonedDateTime.now(ZoneId.of("Z")));

		return new ResponseEntity<>(apiException, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = FileNotFoundException.class)
	public ResponseEntity<Object> handleFileNotFoundException(FileNotFoundException fileNotFoundException,
			WebRequest webRequest) {
		ApiException apiException = new ApiException(fileNotFoundException.getMessage(), fileNotFoundException,
				HttpStatus.NOT_FOUND, ZonedDateTime.now(ZoneId.of("Z")));
		return new ResponseEntity<>(apiException, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(value = NullPointerException.class)
	public ResponseEntity<Object> handleNullPointerException(NullPointerException nullPointerException,
			WebRequest webRequest) {
		ApiException apiException = new ApiException(nullPointerException.getMessage(), nullPointerException,
				HttpStatus.NO_CONTENT, ZonedDateTime.now(ZoneId.of("Z")));
		return new ResponseEntity<>(apiException, HttpStatus.NO_CONTENT);
	}

	@ExceptionHandler(value = ResourceNotFoundException.class)
	public ResponseEntity<Object> handleResourceNotFoundException(ResourceNotFoundException resourceNotFoundException,
			WebRequest webRequest) {
		ApiException apiException = new ApiException(resourceNotFoundException.getMessage(), resourceNotFoundException,
				HttpStatus.NOT_FOUND, ZonedDateTime.now(ZoneId.of("Z")));
		return new ResponseEntity<>(apiException, HttpStatus.NOT_FOUND);
	}

}
