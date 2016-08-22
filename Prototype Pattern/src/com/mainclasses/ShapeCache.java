package com.mainclasses;

import java.util.Hashtable;

import com.abstractClasses.Shape;
import com.shapes.Circle;
import com.shapes.Rectangle;
import com.shapes.Square;

public class ShapeCache {
	
	public static Hashtable<String, Shape> shapeTypes = new Hashtable<String, Shape>();
	
	public static Shape gerShape(String shapeId){
		Shape chachedShape = shapeTypes.get(shapeId);
		return (Shape) chachedShape.clone();
	}
	
	public static void loadCache(){
		Circle circle = new Circle();
		circle.setId("1");
		shapeTypes.put(circle.getId(),circle);
		
		Rectangle rectangle= new Rectangle();
		rectangle.setId("2");
		shapeTypes.put(rectangle.getId(),rectangle);
		
		Square square = new Square();
		square.setId("3");
		shapeTypes.put(square.getId(), square);
	}

}
