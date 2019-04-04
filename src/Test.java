package com.capgemini.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.capgemini.spring.provider.*;
import com.capgemini.spring.renderer.MessageRenderer;

public class Test{

	public static void main(String[] args){
		

		//setter injection using annotation configuratuion
 		ApplicationContext context  = new ClassPathXmlApplicationContext("context.xml");
		 MessageRenderer renderer =(MessageRenderer)context.getBean("renderer");
		System.out.println(renderer.hashCode());
	
		 MessageRenderer renderer1 =(MessageRenderer)context.getBean("renderer");
		System.out.println(renderer1.hashCode());
		renderer.render();
	}

}