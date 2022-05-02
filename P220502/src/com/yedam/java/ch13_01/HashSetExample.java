package com.yedam.java.ch13_01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); //값이 들어가지 못함. 중복된 개체라서.
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println(); //중복되는 값은 먼저 들어간것은 자리를 지키고
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		System.out.println();
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체 수 : " + set.size());
		
		
		for(String str : set) {
			System.out.println("\t"+str); }
			
		set.clear();  //모든 객체를 제거하고 비움
		if(set.isEmpty()) {
			System.out.println("비어있음.");}
	}
 }
