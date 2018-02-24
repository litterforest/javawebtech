package com.cobee.javawebtech.designpattern.state;

/**
 * <pre>
 * 房间处于空闲状态
 * </pre>
 * 
 * @author 陈淦森
 * @version 1.0.1
 * @date 2017年11月7日
 *
 */
public class FreeState extends RoomState {

	public FreeState() {
		super();
	}

	public FreeState(String description) {
		super(description);
	}

	public void book(Room room) {
		System.out.println("已预约" + room.getRoomNumber() + "号房间");
		BookedState bookedState = new BookedState(" 处于已预约状态  ");
		room.setRoomState(bookedState);
	}

	public void checkin(Room room) {
		System.out.println("非法操作checkin()，"+ room.getRoomNumber() +"号房间状态是：" + super.getDescription());
	}

	public void checkout(Room room) {
		System.out.println("非法操作checkout()，"+ room.getRoomNumber() +"号房间状态是：" + super.getDescription());
	}

	public void unbook(Room room) {
		System.out.println("非法操作unbook()，"+ room.getRoomNumber() +"号房间状态是：" + super.getDescription());
	}

}
