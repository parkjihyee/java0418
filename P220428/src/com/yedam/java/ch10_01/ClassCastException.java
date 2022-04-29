package com.yedam.java.ch10_01;

public class ClassCastException {

	public static void main(String[] args) {
		changeDog(new Dog());
		changeDog(new Cat());
	}
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
		   Dog dog = (Dog) animal;
	}
	}
}
//강제변환시 instanceof 
//상속관계가 있을때 타입변환이 일어난다?

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}