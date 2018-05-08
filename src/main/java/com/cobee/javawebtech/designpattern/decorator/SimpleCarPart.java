package com.cobee.javawebtech.designpattern.decorator;

public class SimpleCarPart extends CarPart {

	public SimpleCarPart() {
		super();
	}

	public SimpleCarPart(Double cost, String description, Car car) {
		super(cost, description, car);
	}
	
}
