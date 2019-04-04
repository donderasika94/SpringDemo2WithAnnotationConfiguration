package com.capgemini.spring.provider;

import org.springframework.stereotype.*;


@Component("gm")
public class GMMessageProvider implements MessageProvider{

	@Override
	public String getMessage(){
		return "Good Morning!!!";

	}

}