package com.program.store;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("msgStore")
public class MessageStore {

	private List<String> messageList=new ArrayList();
	
	public void addMessage(String message) {
		messageList.add(message);
	}
	
	public String showAllMessage() {
		return messageList.toString();
	}
}
