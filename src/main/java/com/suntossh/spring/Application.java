package com.suntossh.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		BeanA bean1 = context.getBean("_bean1",BeanA.class);
		BeanA bean2 = context.getBean("bean2",BeanA.class);
		System.out.println(bean1==bean2);
		System.out.println(bean1==bean2?"equal":"not equal");
		bean1.printMessage();
	}

}
