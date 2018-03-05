package com.njust.pattern.singletion;

public class Singleton {
	private Singleton(){
		
	}
	
//	private static class SingletionHolder{
//		static Singleton instance = new Singleton(); 
//	}
//	public static Singleton getSingleton(){
//		System.out.println("getSingleton……");
//		return SingletionHolder.instance;
//	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main函数开始……");
		Tree t1 = Tree.getInstance();
		Tree t2 = Tree.getInstance();
		System.out.println(t1.equals(t2));

	}

}
