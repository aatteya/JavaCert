/**
 * 
 */
package com.ibm.javacert.food;

/**
 * @author AhmedAtteya
 *
 */
public abstract class Fruit extends Parent {
	public String color;
	public static int numberOfFruits;
	public Fruit(){
		numberOfFruits++;
	}
	public void useStuff(){
		int z = x+y;
	}
	public void showSample(int x, int y){
		System.out.println();
	}
	public abstract void methodStuff();
	
	public void doesNotCompile(){
		Parent p = new Parent();
		p.x = p.y;
	}

}
