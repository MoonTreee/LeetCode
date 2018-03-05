package com.njust.pattern.static_proxy;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Subject man = new RealSub();
		Proxy proxy = new Proxy(man);
		proxy.merry();
	}

}
