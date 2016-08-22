	package com.factoryClasses;

import com.abstractFactory.AbstractFactory;
import com.classes.Rectangle;
import com.classes.Squre;
import com.classes.Triangle;
import com.interfaces.Color;
import com.interfaces.Shape;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		if(shape.equalsIgnoreCase("Triangle")){
			return new Triangle();
		}
		else if(shape.equalsIgnoreCase("squre")){
			return new Squre();
		}
		else if(shape.equalsIgnoreCase("rectangle")){
			return new Rectangle();
		}
		return null;
	}

}
