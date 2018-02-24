package com.cobee.javawebtech.designpattern.state;

public class BookedState extends RoomState {

	public BookedState() {
		super();
	}

	public BookedState(String description) {
		super(description);
	}

	@Override
	void book(Room room) {
		System.out.println("非法操作book()，"+ room.getRoomNumber() +"号房间状态是：" + super.getDescription());
	}

	@Override
	void checkin(Room room) {
		System.out.println("已入住" + room.getRoomNumber() + "号房间");
	}

	@Override
	void checkout(Room room) {
		System.out.println("非法操作checkout()，"+ room.getRoomNumber() +"号房间状态是：" + super.getDescription());
	}

	@Override
	void unbook(Room room) {
		System.out.println("已退订" + room.getRoomNumber() + "号房间");
		FreeState freeState = new FreeState("房间处于空闲");
		room.setRoomState(freeState);
	}
	
	

}
