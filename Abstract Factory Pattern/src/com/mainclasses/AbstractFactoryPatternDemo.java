package com.mainclasses;

import com.abstractFactory.AbstractFactory;
import com.abstractFactory.FactoryProducer;
import com.interfaces.Color;
import com.interfaces.Shape;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		
		Shape shapeType = shapeFactory.getShape("squre");
		
		shapeType.draw();
		
		shapeType = shapeFactory.getShape("rectangle");
		
		shapeType.draw();
		
		shapeType = shapeFactory.getShape("Triangle");
		
		shapeType.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		
		Color colorType = colorFactory.getColor("red");
		
		colorType.fill();
		
		colorType = colorFactory.getColor("green");
		
		colorType.fill();
		
		colorType = colorFactory.getColor("blue");
		
		colorType.fill();
		
	}

}
