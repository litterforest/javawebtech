package com.cobee.javawebtech.designpattern.state;

public class ClientMain {

	public static void main(String[] args) {
		
		Room room = new Room();
		RoomState freeState = new FreeState("空闲");
		room.setRoomState(freeState);
		room.setRoomNumber(25);
		
		room.book();
		room.book();
		room.checkin();

	}

}
