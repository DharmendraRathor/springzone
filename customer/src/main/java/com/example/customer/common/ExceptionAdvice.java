package com.example.customer.common;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {

	@ExceptionHandler(value = CustomerNotFoundException.class)
	public ResponseEntity<CustomErrorResponse> handleGenericException(Exception e) {
		CustomErrorResponse error = new CustomErrorResponse("GENERAL_ERROR", e.getMessage());
		error.setTimestamp(LocalDateTime.now());
		error.setStatus((HttpStatus.NOT_FOUND.value()));
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
}
