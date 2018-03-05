package com.njust.pattern.proxy;

public class ProxyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HelloServiceProxy proxy = new HelloServiceProxy();
		HelloService service = new HelloServiceImpl();
		service = (HelloService)proxy.bind(service, new Class[] {HelloService.class});
		service.sayHello("王金树");

	}

}
