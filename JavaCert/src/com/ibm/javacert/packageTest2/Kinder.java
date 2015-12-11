package com.ibm.javacert.packageTest2;

class AgedP{
	String name = "hello";
	public AgedP(){}
	public AgedP(int x){}
}

public class Kinder extends AgedP{
	public Kinder(int x){
		this.name = "hi"; 
	}
}

class cumming{
	static String s = "-";
	public static void main(String[] args){
		AgedP [] a = new AgedP[2];
		Kinder[] b = new Kinder[2];
		sifter(a);
		sifter(b);
		sifter(7);
		System.out.println(s);
	}
	static void sifter(AgedP[]... a){s+="1";}
	static void sifter(Kinder[]... b){s+="2";}
	static void sifter(Kinder[] b){s+="3";}
	static void sifter(Object o){s+="4";}
}
