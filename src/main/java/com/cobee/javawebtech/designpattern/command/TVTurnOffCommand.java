package com.cobee.javawebtech.designpattern.command;

public class TVTurnOffCommand implements TVCommandAware {

	private TV tv;
	
	public TVTurnOffCommand() {
		super();
	}

	public TVTurnOffCommand(TV tv) {
		super();
		this.tv = tv;
	}

	public TV getTv() {
		return tv;
	}

	public void setTv(TV tv) {
		this.tv = tv;
	}
	
	public void execute() {
		tv.turnOff();
	}

}
