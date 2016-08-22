package com.meals;

import com.items.ChickenBurger;
import com.items.Coke;
import com.items.Pepsi;
import com.items.VegBurger;

public class MealBuilder {
	
	public Meal prepareVegMeal(){
		Meal vegMeal = new Meal();
		vegMeal.addItem(new VegBurger());
		vegMeal.addItem(new Coke());
		return vegMeal;
	}
	
	public Meal prepareNonVegMeal(){
		Meal nonVegMeal = new Meal();
		nonVegMeal.addItem(new ChickenBurger());
		nonVegMeal.addItem(new Pepsi());
		return nonVegMeal;
	}

}
