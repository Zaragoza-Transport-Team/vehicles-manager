package com.mentoring.vehicles.domain.exception;

import org.springframework.http.HttpStatus;

public class DomainException extends RuntimeException {

    HttpStatus status;

    public DomainException( String message, HttpStatus status) {
        super(message);
        this.status = status;
    }


}
