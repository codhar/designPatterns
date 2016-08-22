package com.singletonClasses;

public class Singleton {
	
	private static int test;
	
	
	
/*	public static int getTest() {
		return test;
	}*/

	public void setTest(int test) {
		this.test = test;
	}

	private Singleton(){
		
	}

	public static Singleton getInstance(){
		return new Singleton();
	}
	
	public void showMessage(){
		System.out.println("Hello from Singleton"+ test);
	}
}
