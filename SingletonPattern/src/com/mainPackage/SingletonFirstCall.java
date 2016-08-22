package com.mainPackage;

import com.singletonClasses.Singleton;

public class SingletonFirstCall {

	public SingletonFirstCall() {
	}
	
	public void setTest(int test){
		Singleton single = Singleton.getInstance();
		single.setTest(test);
		single.showMessage();
//		single.setTest(test);
//		System.out.println(test);
//		System.out.println(single.);
	}
	

}
