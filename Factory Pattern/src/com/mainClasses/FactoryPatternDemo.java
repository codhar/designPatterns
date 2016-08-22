package com.mainClasses;

import com.factoryClass.ShapeFactory;
import com.interfaces.Shape;

public class FactoryPatternDemo {
	
	public static void main(String args[]){
		
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape = shapeFactory.getShape("square");
		
		shape.draw();
		
		shape = shapeFactory.getShape("triangle");
		
		shape.draw();
		
		shape = shapeFactory.getShape("rectangle");
		
		shape.draw();
	}

}
