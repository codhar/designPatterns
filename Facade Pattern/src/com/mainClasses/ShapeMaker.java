package com.mainClasses;

import com.shapes.Circle;
import com.shapes.Rectangle;
import com.shapes.Shape;
import com.shapes.Square;

public class ShapeMaker {
	Shape rectangleShape;
	Shape circle;
	Shape square;
	public ShapeMaker() {
		rectangleShape = new Rectangle();
		circle = new Circle();
		square = new Square();
	}
	
	public void drawCircle(){
		circle.draw();
	}
	
	public void drawRectangleShape(){
		rectangleShape.draw();
	}
	
	public void drawSquare(){
		square.draw();
	}
}
