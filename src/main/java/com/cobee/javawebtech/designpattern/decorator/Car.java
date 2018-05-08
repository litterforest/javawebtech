package com.cobee.javawebtech.designpattern.decorator;

public abstract class Car {

	private Double cost;
	private String description;

	public Car() {
		super();
	}

	public Car(Double cost, String description) {
		super();
		this.cost = cost;
		this.description = description;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public abstract Double getTotalCost();

	public abstract String getTotalDescription();

}
