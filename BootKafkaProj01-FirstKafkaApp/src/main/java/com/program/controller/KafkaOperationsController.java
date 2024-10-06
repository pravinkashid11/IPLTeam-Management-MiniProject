package com.program.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.program.producer.MessageProducer;
import com.program.store.MessageStore;

@RestController
public class KafkaOperationsController {

	@Autowired
	private MessageStore store;
	
	@Autowired
	private MessageProducer producer;
	
	@GetMapping("/send")
	public String sendMessage(String message) {
		String status=producer.sendMessage(message);
		return "<h1>"+status+"<h1>";
	}
	
	@GetMapping("/findAll")
	public String showAllmessages() {
		return "<h1>"+store.showAllMessage()+"<h1>";
	}
	
}
