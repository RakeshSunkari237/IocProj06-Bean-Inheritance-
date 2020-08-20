package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Bike;

public class ClientApp {

	public static void main(String[] args) {
		
		//Locate config file and Activate spring container
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//get bean 
		Bike pulsor1 = ac.getBean("pulsor1", Bike.class);
		System.out.println(pulsor1);
				
		Bike pulsor2 = ac.getBean("pulsor2", Bike.class);
		System.out.println(pulsor2);
	}
}
