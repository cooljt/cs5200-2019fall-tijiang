package edu.northeastern.cs5200.controller.hello;

public class HelloObject {
	private String message;
	public HelloObject() {
		
	}
	public HelloObject(String message) {
		this.message = message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
}
