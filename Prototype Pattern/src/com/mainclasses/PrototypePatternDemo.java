package com.mainclasses;

import com.abstractClasses.Shape;

public class PrototypePatternDemo {

	public static void main(String[] args) {
		ShapeCache.loadCache();
		
		Shape shape1 = (Shape) ShapeCache.gerShape("1");
		shape1.draw();
		
		Shape shape2 = (Shape) ShapeCache.gerShape("2");
		shape2.draw();
		
		Shape shape3 = (Shape) ShapeCache.gerShape("3");
		shape3.draw();
	}

}
