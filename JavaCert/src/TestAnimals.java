import Game.Board;
import Game.Tile;

public class TestAnimals {
	
	public void doStuff(Animal a){
		System.out.println("In The Animal version");
	}
	
	public void doStuff(Horse h){
		System.out.println("In the Horse versidon");
	}
	public static void main(String[] args){
		TestAnimals ta = new TestAnimals();
		Animal a = new Animal();
		Horse h = new Horse();
		Animal ah = new Horse();
		Animal [] arr = {new Animal(), new Dog2(), new Animal()};
		
		ta.doStuff(a);
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

		Board b = new Board(3);
		
		for(int i=0;i<3;i++){
			for(int j=0; j<3;j++){
				int u,l,r,d;
				u=(int) (Math.random()*9.0);
				d=(int) (Math.random()*9.0);
				r=(int) (Math.random()*9.0);
				l=(int) (Math.random()*9.0);
				b.insert(new Tile(u,d,l,r), i, j);
				
			}
		}
		
		System.out.println(b);
		System.out.println(b.getAdjacentNumber('d', 0, 0));
		
		
	}
}
