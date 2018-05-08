package com.cobee.javawebtech.designpattern.command;

public class TVController implements TVAware {

	private TVTurnOnCommand TVTurnOnCommand;
	private TVTurnOffCommand TVTurnOffCommand;
	private TVChangeChannelCommand TVChangeChannelCommand;
	
	public TVTurnOnCommand getTVTurnOnCommand() {
		return TVTurnOnCommand;
	}

	public void setTVTurnOnCommand(TVTurnOnCommand tVTurnOnCommand) {
		TVTurnOnCommand = tVTurnOnCommand;
	}

	public TVTurnOffCommand getTVTurnOffCommand() {
		return TVTurnOffCommand;
	}

	public void setTVTurnOffCommand(TVTurnOffCommand tVTurnOffCommand) {
		TVTurnOffCommand = tVTurnOffCommand;
	}

	public TVChangeChannelCommand getTVChangeChannelCommand() {
		return TVChangeChannelCommand;
	}

	public void setTVChangeChannelCommand(TVChangeChannelCommand tVChangeChannelCommand) {
		TVChangeChannelCommand = tVChangeChannelCommand;
	}

	public static void main(String[] args) {
		TVController TVController = new TVController();
		
		TV TV = new TV();
		TVController.setTVTurnOnCommand(new TVTurnOnCommand(TV));
		TVController.setTVChangeChannelCommand(new TVChangeChannelCommand(TV, 6));
		TVController.setTVTurnOffCommand(new TVTurnOffCommand(TV));
		
		TVController.turnOn();
		TVController.changeChannel(0);
		TVController.turnOff();
	}

	public void turnOn() {
		TVTurnOnCommand.execute();
	}


	public void turnOff() {
		TVTurnOffCommand.execute();
	}

	public void changeChannel(int channel) {
		TVChangeChannelCommand.execute();
	}

}
