package com.ibm.javacert.food;

public class Parent {
	int x=9;
	int y=10;
	
	public final void showSample(){
		System.out.println("Hello");
	}
	public final void showSample(int x){
		System.out.println("Hello" + x);
	}
}
