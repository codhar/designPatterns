package com.ItemTypes;

import com.interfaces.Item;
import com.interfaces.Packing;
import com.packaing.Wrapper;

public abstract class Burger implements Item {

	@Override
	public abstract String name();

	@Override
	public abstract float price();

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

}
