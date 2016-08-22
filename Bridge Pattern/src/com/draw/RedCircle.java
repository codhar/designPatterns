package com.draw;

public class RedCircle implements DrawAPI {

	@Override
	public void drawCircle(int x,int y, int radius) {
		System.out.println("RED Circle wit x = "+x+" y = "+y+" with radius "+radius);
	}

}
