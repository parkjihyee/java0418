package com.yedam.java.ch08_01;

public class Television implements RemotControl {
	
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	}
	
	public void setVolume(int volume) {
		if(volume >= RemotControl.MAX_VOLUME) {
			this.volume = RemotControl.MAX_VOLUME;
		}else if(volume <= RemotControl.MIN_VOLUME) {
			this.volume = RemotControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
	System.out.println("현재 TV 볼륨 : " + this.volume);

	}
}