package com.guvi.globalexceptionhandler.service;

public class ProductNotFound extends  RuntimeException{
    public ProductNotFound(String message) {
        super(message);
    }
}
