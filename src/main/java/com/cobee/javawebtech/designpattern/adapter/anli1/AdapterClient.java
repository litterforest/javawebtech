package com.cobee.javawebtech.designpattern.adapter.anli1;

public class AdapterClient {

	public static void main(String[] args) {
		Deer deer = new Deer();
//		deer.run();
		
		DeerAware deerAware = new FlyDeer(deer);
		deerAware.run();
		deerAware.fly();
		
	}

}
