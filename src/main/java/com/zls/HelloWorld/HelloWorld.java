package com.zls.HelloWorld;

public class HelloWorld {
	/**
	 * 打印hello world
	 * @return String
	 */
	public String sayHelloWorld(){
		return "hello world";
	}
	
	public static void main(String[] args) {
		System.out.println(new HelloWorld().sayHelloWorld());
	}
}
