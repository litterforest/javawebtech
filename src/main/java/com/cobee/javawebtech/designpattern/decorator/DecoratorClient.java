package com.cobee.javawebtech.designpattern.decorator;

public class DecoratorClient {

	public static void main(String[] args) {
		
		SimpleCar simpleCar = new SimpleCar(300000.0D, "这是一台奥迪A4L", "A4L");
		SimpleCarPart part = new SimpleCarPart(2000.0D, " 带有GPS导航 ", simpleCar);
		SimpleCarPart part1 = new SimpleCarPart(3000.0D, " 带有倒车影像", part);
		SimpleCarPart part2 = new SimpleCarPart(5000.0D, " 带有真皮坐椅", part1);
		
		System.out.println(part2.getTotalDescription());
		System.out.println(part2.getTotalCost());
		
	}

}
