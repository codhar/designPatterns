package com.decorator;

import com.classes.Shape;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape shapeDecorator) {
		super(shapeDecorator);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void draw(){
		shapeDecorator.draw();
		setRedBorder(shapeDecorator);
	}
	
	private void setRedBorder(Shape decoratedShape){
		System.out.println("Border Color Red");
	}

}
