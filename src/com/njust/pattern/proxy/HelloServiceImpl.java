package com.njust.pattern.proxy;

public class HelloServiceImpl implements HelloService {

	public void sayHello(String s) {
		System.out.println("Hello" + s);
	}

}
