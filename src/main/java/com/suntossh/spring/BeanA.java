package com.suntossh.spring;

public class BeanA {
	
	public BeanA() {
		System.out.println("I am am instaniated by Spring IOC Container");
	}
	
	private String message;
	
	
	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public void printMessage(){
		System.out.println("\n"+this.getMessage());
	}
}
