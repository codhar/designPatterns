package com.images;

public class RealImage implements Image {
	
	private String  realImage;
	
	public RealImage(String realImage) {
		super();
		this.realImage = realImage;
		loadFromDisk(realImage);
	}

	@Override
	public void display() {
		System.out.println("Display "+realImage);
	}
	
	private void loadFromDisk(String fileName){
		System.out.println("Loading " +fileName);
	}

}
