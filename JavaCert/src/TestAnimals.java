import com.ibm.javacert.packageTest2.Animals;
import com.ibm.javacert.packageTest2.Kinder;

public class TestAnimals {
	
	public void doStuff(Animal a){
		System.out.println("In The Animal version");
	}
	
	public void doStuff(Horse h){
		System.out.println("In the Horse versidon");
	}
	
	public static void printLength(int [] arr){
		System.out.println(arr.length);
	}
	public static void go(double x)
	{
		System.out.println("double input " + x);
	}
	public static void go(double x, double y){
		System.out.println("double double");
	}
	public static void go(int x, int y){
		System.out.println("int, int");
	}
	public static void go(byte ...b){
		System.out.println("byte ...");
	}
	public static void main(String[] args){
		TestAnimals ta = new TestAnimals();
		Animals a;
		a = new Animals();
		Horse h = new Horse();
		Animal ah = new Horse();
		Animal [] arr = {new Animal(), new Dog2(), new Animal()};
		int [][] intArr = new int[5][];
		
		for(int i =0; i<5;i++){
			int random = (int) (Math.random()*10);
			intArr[i]= new int[random];
			System.out.println("Array intArr["+i+"].length = " + intArr[i].length);
		}
		printLength(new int[]{5,2,1,6,2,5,8});
		
		Kinder k = new Kinder(8);
		k.run();
		
		Integer i = new Integer(1);
		i++;
		Integer z = new Integer(1);
		z++;
		if(i==z)// this ONLY WORKS IF WRAPPER WAS BOXED AND UNDER 127 (size less than byte)
			System.out.println("i=z");
		else
			System.out.println("i!=z");
		
		System.out.println(Integer.parseInt("324"));// returns int
		System.out.println(Integer.valueOf("500"));// return Integer
		System.out.println(i.intValue());// takes Integer instance and gets int 
		
		float f = 1234.3211f;
		long l = 0x23f4L;
//		Animal anObj=null;		If not initialized then compiler will complain when using it
//		anObj.eat();			but will run if initialized even with a null
		//ta.doStuff(a);
		ta.doStuff(h);
		
		a.eat();
		h.eat();
		ah.eat();
		h.eat("Apples");
		for(Animal animal: arr){
			animal.makeNoise();
			if(animal instanceof Dog2){
				Dog2 d = (Dog2) animal; 
				d.playDead();
			}
		}
		char c = (char) -69;
		
		byte ab=8;
		byte b=3;
		byte cb = (byte)(ab + b);
		cb +=23;
		ab *=b;
		
		System.out.println(c);
		
		go((byte)10);
		go((short)50);
		go((long)312);
		go(234.23f);
		go((byte)20, (byte)30);
//		Board b = new Board(3);
//		
//		for(int i=0;i<3;i++){
//			for(int j=0; j<3;j++){
//				int u,l,r,d;
//				u=(int) (Math.random()*9.0);
//				d=(int) (Math.random()*9.0);
//				r=(int) (Math.random()*9.0);
//				l=(int) (Math.random()*9.0);
//				b.insert(new Tile(u,d,l,r), i, j);
//				
//			}
//		}
		
//		System.out.println(b);
//		System.out.println(b.getAdjacentNumber('d', 0, 0));
		
		
	}
}
