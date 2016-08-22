package com.draw;

public class GreenCircle implements DrawAPI {

	@Override
	public void drawCircle(int x, int y ,int radius) {
		System.out.println("Green Circle wit x = "+x+" y = "+y+" with radius "+radius);
		
	}
	

}
