package com.mainClasses;

import com.classes.Rectangle;
import com.classes.Shape;
import com.classes.Square;
import com.decorator.GreenShapeDecorator;
import com.decorator.RedShapeDecorator;

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		
		Shape square = new Square();
		
		Shape redSquare = new RedShapeDecorator(square);
		
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		
		Shape greenRectangle = new GreenShapeDecorator(new Rectangle());
		
		System.out.println("Square with normal border");
		square.draw();
		
		System.out.println("Square with red Border");
		redSquare.draw();
		
		System.out.println("Rectangle with red Border");
		redRectangle.draw();
		
		System.out.println("Rectangle with Green Border");
		greenRectangle.draw();

	}

}
