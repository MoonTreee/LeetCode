package com.njust.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HelloServiceProxy implements InvocationHandler {
	private Object subject;
 
   /**
    * Object proxy:代理对象
    * Method method:代理方法
    * Object[] arg:方法的参数*/
	public Object invoke(Object proxy, Method method, Object[] arg)
			throws Throwable {
		System.out.println("****JDK的动态代理******");
		Object result = null;
		System.out.println("反射方法前调用");
		result = method.invoke(subject, arg);
		System.out.println("反射方法后调用");
		return result;
		
	}
	public Object bind(Object subject, Class[] interfaces){
		this.subject = subject;
		// 该方法用于为指定类装载器、一组接口及调用处理器生成动态代理类实例
		return Proxy.newProxyInstance(subject.getClass().getClassLoader(), 
				subject.getClass().getInterfaces(), this);
		
	}

}
