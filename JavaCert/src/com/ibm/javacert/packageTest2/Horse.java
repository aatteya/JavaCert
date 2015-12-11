package com.ibm.javacert.packageTest2;

public class Horse extends Animals {
	
	public static Horse createHorse(){
		return new Horse();
	}
	public void eat(){
		System.out.println("Horse Eating stuff");
	}
	public void eat(String s){
		System.out.println("Overloaded Horse Eating" + s);
	}
	public void comp(int x, double y){
		super.comp(y,x);
	}
}
