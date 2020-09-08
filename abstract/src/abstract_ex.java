
//abstraction example
//https://www.youtube.com/watch?v=52frlN8webg
//declare the abstract class
abstract class Dog{
	
	String breed;
	
	public abstract void bark();
	
	public abstract void poop();
}

class great_dane extends Dog{
	public void poop() {
		System.out.println("Dog pooped!");
	}
	
	public void bark() {
		System.out.println("Dog is barking!!");
	}
}

public class abstract_ex {

	public static void main(String[] args) {
		great_dane d = new great_dane();
		
		d.poop();
		d.bark();

	}

}
