package com.yedam.java.ch11_01;

import java.util.Map;
import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		Map<Key, String> map = new HashMap<Key, String>();		//식별값을 내가 지정할 수 있음
		
		map.put(new Key(1), "홍길동");
		//map이라는 변수에 홍길동이 들어가있음. 이것을 꺼내려면
		String value = map.get(new Key(1));
		System.out.println(value);
		
		
		Map<Member, String> mMap = new HashMap<Member, String>();
		
		mMap.put(new Member("blue"), "하늘색");
		
		String mValue = mMap.get(new Member("blue"));
		System.out.println(mValue); 
	}

}
//물리적으로 서로 다른 존재를 논리적(맥락적)으로 같다고 보는것. hashCode와 equals를 오버라이딩해서.