/**
 * 
 */
package com.ibm.javacert.packageTest2;

/**
 * @author AhmedAtteya
 *
 */
public class B extends Thread implements Runnable {
	
	public String name;
	String code;
	long id;
	
	public B(){
		
	}
	public B(String name, String code, long id){
		this.name = name;
		this.code = code;
		this.id = id;
	}
	
	public void setBName(String name){
		this.name = name;
	}
	
	String getCode(){
		return code;
	}
	
	public void doStuff(Animals a){
		System.out.println("Animals");
	}
	public void doStuff(Horse h){
		System.out.println("Horse");
		
	}
	public void run(){
		Animals a=null;
		Horse h=null;
		a = new Animals();
		h = Horse.createHorse();
		a.eat();
		h.eat();
		h.comp(2.5,2);
		h.comp(2,2.5);
		System.out.println(Animals.getNumberOfAnimals());
		System.out.println(a.getName());
		System.out.println(h.getName());
		System.out.println(a.toString());
		System.out.println(h.toString());
	}

}
