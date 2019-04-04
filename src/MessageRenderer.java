package com.capgemini.spring.renderer;

import com.capgemini.spring.provider.MessageProvider;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Service("renderer")
public class MessageRenderer{

	
	private MessageProvider messageProvider;
	
	/*@Autowired
	public MessageRenderer(MessageProvider messageProvider){
		this.messageProvider = messageProvider;
	}*/

	@Autowired
	@Qualifier("gm")
	public void setMessageProvider(MessageProvider messageProvider){
		System.out.println("Setter Injection....");
		this.messageProvider = messageProvider;

	}

	public void render(){

		System.out.println(messageProvider.getMessage());	
	}
}