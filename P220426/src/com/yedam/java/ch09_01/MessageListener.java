package com.yedam.java.ch09_01;

import com.yedam.java.ch09_01.Button.OnClickListener;

public class MessageListener implements OnClickListener {

	@Override
	public void onClick() {
		System.out.println("메세지를 보냅니다.");
	}

}
