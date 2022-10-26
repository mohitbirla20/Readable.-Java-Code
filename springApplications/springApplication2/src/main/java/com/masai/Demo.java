package com.masai;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
	   
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
        Collage c = ctx.getBean("c1" , Collage.class);
        
        c.showDetails();
		
	}

}
