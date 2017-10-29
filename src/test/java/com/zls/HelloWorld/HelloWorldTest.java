package com.zls.HelloWorld;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {

	@Test
	public void main() {
		HelloWorld helloWorld = new HelloWorld();
		String result = helloWorld.sayHelloWorld();
		assertEquals("hello world",result);
	}
}
