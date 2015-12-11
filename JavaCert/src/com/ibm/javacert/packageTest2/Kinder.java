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
	
	public void run(){
		cumming.run();
	}
}

class cumming{
	static String s = "-";
	
	static void run(){
		AgedP [] a = new AgedP[2];
		Kinder[] b = new Kinder[2];
		sifter(a);// calls Object version as var args are the last option
		sifter(b);// calls Kinder[] b version as var args are last option
		sifter(7);// calls Object version as int can be implicitly wrapped into Integer which implicitly wraps to Object
		System.out.println(s);
	}

	static void sifter(AgedP[]... a){s+="1";}
	static void sifter(Kinder[]... b){s+="2";}
	static void sifter(Kinder[] b){s+="3";}
	static void sifter(Object o){s+="4";}
}
