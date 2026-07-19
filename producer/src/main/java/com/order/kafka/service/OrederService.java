package com.order.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.order.kafka.module.Order;

@Service
public class OrederService {
    @Autowired
	private KafkaTemplate<String, Order> kafkaTemplate;
    
    public String sendMessage(Order order)
    {
    	kafkaTemplate.send("order","order",order);
    	return "message sent to the kafka server";
    }
}
