package com.factoryClasses;

import com.abstractFactory.AbstractFactory;
import com.classes.Blue;
import com.classes.Green;
import com.classes.Red;
import com.interfaces.Color;
import com.interfaces.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		if(color.equalsIgnoreCase("red")){
			return new Red();
		}
		else if (color.equalsIgnoreCase("green")){
			return new Green();
		}
		else if (color.equalsIgnoreCase("blue")){
			return new Blue();
		}
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
