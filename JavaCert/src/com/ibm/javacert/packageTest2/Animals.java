package com.ibm.javacert.packageTest2;

public class Animals {
	
	private static int numberOfAnimals;
	private String name;
	
	public Animals(){
		this(makeRandomName());
	}
	public Animals(String name){
		this.setName(name);
		setNumberOfAnimals(getNumberOfAnimals() + 1);
	}
	
	private static String makeRandomName(){
		String [] a = {"Fifi", "Hector", "Shiko", "Lolo", "Toto"};
		return a[(int)(Math.random()*5)];
	}
	public void eat(){
		System.out.println("Generic Eating");
		
	}
	
	public void comp(double y, int x){
		System.out.println(x + " Original " + y);
	}
	public static int getNumberOfAnimals() {
		return numberOfAnimals;
	}
	private static void setNumberOfAnimals(int numberOfAnimals) {
		Animals.numberOfAnimals = numberOfAnimals;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
