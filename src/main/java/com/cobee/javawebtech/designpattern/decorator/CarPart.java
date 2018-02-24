/**
 * 
 */
package com.cobee.javawebtech.designpattern.decorator;

/** 
 * <pre>汽车的零件对象，相当于装饰者</pre>
 * @author 陈淦森
 * @version 1.0.1
 * @date 2017年10月27日
 *
 */
public abstract class CarPart extends Car {
	
	private Car car;

	public CarPart() {
		super();
	}

	public CarPart(Double cost, String description, Car car) {
		super(cost, description);
		this.car = car;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	/* (non-Javadoc)
	 * @see com.cobee.javawebtech.designpattern.decorator.Car#getTotalCost()
	 */
	@Override
	public Double getTotalCost() {
		return car.getTotalCost() + getCost();
	}

	/* (non-Javadoc)
	 * @see com.cobee.javawebtech.designpattern.decorator.Car#getTotalDescription()
	 */
	@Override
	public String getTotalDescription() {
		return car.getTotalDescription() + getDescription();
	}

}
