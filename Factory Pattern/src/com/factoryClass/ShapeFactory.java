package com.factoryClass;

import com.factoryClasses.Rectangle;
import com.factoryClasses.Square;
import com.factoryClasses.Triangle;
import com.interfaces.Shape;

public class ShapeFactory {
	
	public Shape getShape(String shapeType){
		if(shapeType.equalsIgnoreCase(null)){
			return null;
		}
		else if(shapeType.equalsIgnoreCase("Square")){
			return new Square();
		}
		else if(shapeType.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}
		else if(shapeType.equalsIgnoreCase("TRIANGLE")){
			return new Triangle();
		}
		return null;
	}

}
