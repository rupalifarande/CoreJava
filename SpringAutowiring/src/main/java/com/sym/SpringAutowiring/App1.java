package com.sym.SpringAutowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Company;

public class App1 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring1.xml");
    	Company a1=(Company)context.getBean("cust");
  	    System.out.println(a1);

	}

}
