package com.cobee.javawebtech.designpattern.command;

public class TV implements TVAware {
	
	private int channel;
	
	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public void turnOn()
	{
		System.out.println("电视机打开了");
	}
	
	public void turnOff()
	{
		System.out.println("电视机关闭了");
	}
	
	public void changeChannel(int channel)
	{
		this.channel = channel;
		System.out.println("电视机转到" + channel + "台");
	}
	
	
	
}
