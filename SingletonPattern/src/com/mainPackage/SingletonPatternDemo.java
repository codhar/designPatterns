package com.mainPackage;

import com.singletonClasses.Singleton;

public class SingletonPatternDemo {
	
	public static void main(String args[]){
		SingletonFirstCall firstCall = new SingletonFirstCall();
		firstCall.setTest(10);
		Singleton object = Singleton.getInstance();
		object.setTest(11);
		object.showMessage();
	}

}
