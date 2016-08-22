package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class CustomArrayList<E> extends ArrayList<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	ArrayList<Object> temp = new ArrayList<Object>();
	
	

	public CustomArrayList(ArrayList<Object> temp) {
		super();
		this.temp = temp;
	}

	public ArrayList<Object> getTemp() {
		return temp;
	}

	public void setTemp(ArrayList<Object> temp) {
		this.temp = temp;
	}
	
	public Object getObject(Object obj) {
		Iterator<Object> iterator = this.temp.listIterator();
		while(iterator.hasNext()){
			if(iterator.equals(obj)){
				return iterator;
			}
		}
		return null;
	}
	
	public boolean contains(Object obj){
		Iterator<Object> iterator = this.temp.listIterator();
		while(iterator.hasNext()){
			if(iterator.equals(obj)){
				return true;
			}
		}
		return false;
	}
	
}
