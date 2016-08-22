package com.mainClass;

import com.draw.GreenCircle;
import com.draw.RedCircle;
import com.shapes.Circle;
import com.shapes.Shape;

public class BridgePatternDemo {
	
	public static void main(String srgs[]){
		Shape redshape = new Circle(100, 100, 10, new RedCircle());
		Shape greenShape = new Circle(200, 200, 20, new GreenCircle());
		
		redshape.draw();
		greenShape.draw();
	}

}
