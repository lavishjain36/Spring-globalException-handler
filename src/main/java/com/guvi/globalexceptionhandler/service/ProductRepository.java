package com.guvi.globalexceptionhandler.service;

import org.springframework.data.jpa.repository.JpaRepository;

//connect with jdbc api
public interface ProductRepository  extends   JpaRepository<Products,Long> {
    //CRUD operation implementation
}
