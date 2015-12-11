
public class Horse extends Animal {
	public void printYourself(){
		super.printYourself();
		//then print
	}
	public void eat(){
		System.out.println("Horse eating Hay");
	}
	public void eat(String s){
		System.out.println("Horse eatinmg" + s);
	}
}
