package com.ibm.javacert.food;

import com.ibm.javacert.food.Fruit;

/**
 * 
 */

/**
 * @author AhmedAtteya
 *
 */
class Apple extends Fruit {
	public Apple(String color){
		this.color=color;
	}
	
	public void setColor(String color){
		this.color=color;
	}
	
	public String getColor(){
		return color;
	}

	@Override
	public void methodStuff() {
		// TODO Auto-generated method stub
		System.out.println("hey");
	}
}
