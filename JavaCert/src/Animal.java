
public class Animal {
	public void eat(){
		System.out.println("Generic Animal Eating Generically");
	}
	public void printYourself(){
		
	}
	void makeNoise(){
		System.out.println("generic noise");
	}
}
class Dog2 extends Animal{
	public String eat(int x, double y){
		System.out.println("Dog Eat");
		return "";
	}
	void makeNoise(){
		System.out.println("bark");
	}
	void playDead(){
		System.out.println("roll over");
	}
	public String eat(double y, int x){
		return "";
	}

}