/**
 * 
 */
package com.cobee.javawebtech.designpattern.command;

/** <pre></pre>
 * @author 陈淦森
 * @version 1.0.1
 * @date 2017年11月3日
 *
 */
public class TVChangeChannelCommand implements TVCommandAware {
	
	private TV tv;
	private int channel;

	public TVChangeChannelCommand() {
		super();
	}

	public TVChangeChannelCommand(TV tv, int channel) {
		super();
		this.tv = tv;
		this.channel = channel;
	}

	public TV getTv() {
		return tv;
	}

	public void setTv(TV tv) {
		this.tv = tv;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	/* (non-Javadoc)
	 * @see com.cobee.javawebtech.designpattern.command.TVCommandAware#execute()
	 */
	public void execute() {
		tv.changeChannel(channel);
	}

}
