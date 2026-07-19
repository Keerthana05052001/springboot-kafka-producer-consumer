package com.order.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.kafka.module.Order;
import com.order.kafka.service.OrederService;

@RestController
@RequestMapping("/kafka")
public class OrderController 
{
	@Autowired
	private OrederService orederService;
	
    @GetMapping("/get-order")
	public ResponseEntity<String> getOrder()
    {
    	String response = orederService.getMessage();
		return new ResponseEntity<String>(response,HttpStatus.OK);
	}

}
