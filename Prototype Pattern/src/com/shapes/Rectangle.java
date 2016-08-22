package com.shapes;

import com.abstractClasses.Shape;

public class Rectangle extends Shape{
	
	public Rectangle(){
		 type = "Rectangle";
	}
	
	@Override
	public void draw(){
		System.out.println("inside rectangle draw method");
	}

}
