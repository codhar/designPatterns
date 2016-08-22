package com.shapes;

import com.abstractClasses.Shape;

public class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("in Circle draw function");
	}
	
	public Circle(){
		type = "Circle";
	}

}
