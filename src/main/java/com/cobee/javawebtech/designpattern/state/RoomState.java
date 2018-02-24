package com.cobee.javawebtech.designpattern.state;

public abstract class RoomState {

	private String description;

	public RoomState() {
		super();
	}

	public RoomState(String description) {
		super();
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	abstract void book(Room room);

	abstract void checkin(Room room);

	abstract void checkout(Room room);

	abstract void unbook(Room room);

}
