package com.ibm.javacert.packageTest;

enum CoffeeSize { 
	BIG(8),
	HUGE(10),
	OVERWHELMING(16){
		public String getLidSize(){
			return "A";
		}
	};
	
	int ounces;
	
	CoffeeSize(int ounces){
		this.ounces = ounces;
	}
	
	public int getOunces(){
		return ounces;
	}
	
	public String getLidSize(){
		return "B";
	}
	}

class Coffee extends CoffeeTest1{
	CoffeeSize size;
	static CoffeeSize sSize;
	public static void main(String [] args){
		Coffee drink1 = new Coffee();
		drink1.size = CoffeeSize.BIG;
		for(int i = 0; i<100; i++)
			drink1.increment();
		
		
		Coffee drink2 = new Coffee();
		drink2.size = CoffeeSize.OVERWHELMING;
		
		
		
	}
	
}

public class CoffeeTest1 {
	private int x;
	
	public void increment(){
		if(x<10)
			x++;
		System.out.println("x = "+x);
	}
	public void childVar(){
		Coffee d = new Coffee();
	}
}
