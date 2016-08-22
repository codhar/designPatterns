package com.abstractClasses;

public abstract class Shape implements Cloneable  {
	
	private String Id;
	protected String type;
	
	public abstract void draw();

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getType() {
		return type;
	}

	public Object clone(){
		Object clone = null;
		
		try{
			clone = super.clone();
		} catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
	return clone;
	}
	
	

}
