package com.decorator;

import com.classes.Shape;

public class GreenShapeDecorator extends ShapeDecorator {

	public GreenShapeDecorator(Shape shapeDecorator) {
		super(shapeDecorator);
		// TODO Auto-generated constructor stub
	}
	
	public void draw(){
		shapeDecorator.draw();
		setGreenBorder(shapeDecorator);
	}

	private void setGreenBorder(Shape shapeDecorator){
		System.out.println("Border color green");
	}
}
