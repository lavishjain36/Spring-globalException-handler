package com.guvi.globalexceptionhandler.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//class will hanlde global exception for your application
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({ProductNotFound.class})
    public ResponseEntity<Object> handleProductNotFoundException (ProductNotFound exception){
        //return response internal,bad request,//exception
        return  ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(exception.getMessage());
    }

    //Product already exist exception

//Exception and Error






}
