package com.yedam.java.ch11_01;

public class ClassExample {

	public static void main(String[] args) throws ClassNotFoundException {
		//인스턴스에 대한 정보가 아니라 클래스에 대한 정보임.
		//Class clazz = Member.class; //클래스이름: Member
		//Class clazz = Class.forName("com.yedam.java.ch11_01.Member");
		Member member = new Member("blue");
		Class clazz = member.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
		
		String textPath = clazz.getResource("info.txt").getPath();
		System.out.println(textPath);
	}

}
