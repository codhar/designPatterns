package com.shapes;

import com.abstractClasses.Shape;

public class Square extends Shape {

	@Override
	public void draw() {
		System.out.println("in square draw method");
	}
	
	public Square(){
		type = "Square";
	}

}
