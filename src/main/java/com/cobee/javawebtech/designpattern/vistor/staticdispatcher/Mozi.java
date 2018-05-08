package com.cobee.javawebtech.designpattern.vistor.staticdispatcher;

/**
 * 方法重载是静态分派，在编译期确定
 * @author Administrator
 *
 */
public class Mozi {
	
	public void ride(Horse horse)
	{
		System.out.println("骑马");
	}
	
	public void ride(WhiteHorse horse)
	{
		System.out.println("骑白马");
	}
	
	public void ride(BlackHorse horse)
	{
		System.out.println("骑黑马");
	}

	public static void main(String[] args) {
		
		Mozi mozi = new Mozi();
		WhiteHorse whiteHorse = new WhiteHorse();
		BlackHorse blackHorse = new BlackHorse();
		mozi.ride(blackHorse);
		mozi.ride(whiteHorse);

	}

}
