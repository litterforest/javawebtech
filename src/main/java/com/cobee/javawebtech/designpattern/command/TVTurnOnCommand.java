/**
 * 
 */
package com.cobee.javawebtech.designpattern.command;

/** 
 * <pre>电视机开机命令</pre>
 * @author 陈淦森
 * @version 1.0.1
 * @date 2017年11月2日
 *
 */
public class TVTurnOnCommand implements TVCommandAware {

	private TV tv;
	
	public TVTurnOnCommand() {
		super();
	}

	public TVTurnOnCommand(TV tv) {
		super();
		this.tv = tv;
	}

	public TV getTv() {
		return tv;
	}

	public void setTv(TV tv) {
		this.tv = tv;
	}

	/* (non-Javadoc)
	 * @see com.cobee.javawebtech.designpattern.command.TVCommandAware#execute()
	 */
	public void execute() {
		
		tv.turnOn();

	}

}
