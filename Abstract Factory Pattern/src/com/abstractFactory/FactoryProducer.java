package com.abstractFactory;

import com.factoryClasses.ColorFactory;
import com.factoryClasses.ShapeFactory;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String factoryName){
		
		if(factoryName.equalsIgnoreCase("color")){
			return new ColorFactory();
		}
		else if(factoryName.equalsIgnoreCase("shape")){
			return new ShapeFactory();
		}
		return null;
	}

}
