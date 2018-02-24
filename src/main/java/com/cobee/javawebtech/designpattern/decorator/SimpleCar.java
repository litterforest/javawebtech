package com.cobee.javawebtech.designpattern.decorator;

public class SimpleCar extends Car {

	private String model;
	
	
	public SimpleCar() {
		super();
	}

	public SimpleCar(Double cost, String description, String model) {
		super(cost, description);
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public Double getTotalCost() {
		return getCost();
	}

	@Override
	public String getTotalDescription() {
		return getDescription();
	}

}
