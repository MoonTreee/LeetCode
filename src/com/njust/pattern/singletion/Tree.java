package com.njust.pattern.singletion;

public class Tree {
	private static Tree instance = new Tree();

	private Tree() {
		System.out.println("Tree构造函数");
	}
	public static Tree getInstance(){
		return instance;
	}

}
