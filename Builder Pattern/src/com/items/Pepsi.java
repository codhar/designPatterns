package com.items;

import com.ItemTypes.ColdDrink;

public class Pepsi extends ColdDrink {

	@Override
	public String name() {
		return "Pepsi";
	}

	@Override
	public float price() {
		return 15.00f;
	}

}
