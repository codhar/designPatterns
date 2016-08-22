package com.abstractFactory;

import com.interfaces.Color;
import com.interfaces.Shape;

public abstract class AbstractFactory {
	public abstract Color getColor(String color);
	public abstract Shape getShape(String shape);
	
}
