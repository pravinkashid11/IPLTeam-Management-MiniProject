package com.program.reciever;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.program.store.MessageStore;

@Component("reciever")
public class MessageReciever {
	
	@Autowired
	private MessageStore store;
	
	@KafkaListener(topics = "${app.topic.name}",groupId = "grp1")
	public void readMessages(String message) {
		store.addMessage(message);
	}

}
