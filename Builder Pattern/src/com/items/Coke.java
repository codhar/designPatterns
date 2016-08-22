package com.items;

import com.ItemTypes.ColdDrink;

public class Coke extends ColdDrink {

	@Override
	public String name() {
		return "Coke";
	}

	@Override
	public float price() {
		return 15.00f;
	}

}
