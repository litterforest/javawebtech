package com.cobee.javawebtech.designpattern.state;

public class Room {

	private int roomNumber;
	private RoomState roomState;

	public Room() {
		super();
	}

	public Room(RoomState roomState) {
		super();
		this.roomState = roomState;
	}

	public Room(int roomNumber, RoomState roomState) {
		super();
		this.roomNumber = roomNumber;
		this.roomState = roomState;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public RoomState getRoomState() {
		return roomState;
	}

	public void setRoomState(RoomState roomState) {
		this.roomState = roomState;
	}

	void book() {
		roomState.book(this);
	}

	void checkin() {
		roomState.checkin(this);
	}

	void checkout() {
		roomState.checkout(this);
	}

	void unbook() {
		roomState.unbook(this);
	}

}
