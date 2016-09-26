package com.decorator;

import com.classes.Shape;

abstract class ShapeDecorator implements Shape {
	
	protected Shape shapeDecorator;
	
	public ShapeDecorator(Shape shapeDecorator) {
		this.shapeDecorator = shapeDecorator;
	}

	@Override
	public void draw() {
	shapeDecorator.draw();
	}

}
