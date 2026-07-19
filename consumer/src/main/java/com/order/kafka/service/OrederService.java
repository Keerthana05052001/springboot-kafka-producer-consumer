package com.order.kafka.service;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.order.kafka.module.Order;

@Service
public class OrederService {
    private String message;
	
    @KafkaListener(topics="order",groupId="order-group")
    public void consumer(Order order)
    {
    	message=order+"got the data from kafka";
        System.out.println(message);   
     }
    
    public String getMessage()
    {
		return message;
    	
    }
}
