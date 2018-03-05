package com.njust.pattern.static_proxy;

public class Proxy implements Subject {
	private Subject realSub;
	Proxy(Subject man){
		this.realSub = man;
	}
	

	public void merry() {
		System.out.println("开始……");
		before();
		realSub.merry();
		System.out.println("完成……");
		after();
	}
	 //添加业务逻辑  
    public void before(){  
        System.out.println("宣读誓言");  
    }  
    public void after(){  
        System.out.println("神父宣布成为合法夫妇");  
    }  

}
