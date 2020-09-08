//polymorphism tutorial
//https://www.youtube.com/watch?v=Ft88V_rDO4I
package poly;

class Bird{
	public void sing() {
		System.out.println("chirp chirp chirp");
	}
}

class Robin extends Bird{
	public void fly() {
		System.out.println("flap goes the wings");
	}
}

class BlueJay extends Robin{
	
}

public class polymorphism {

	public static void main(String[] args) {
		//bird object
	 BlueJay b = new BlueJay();
		
		b.sing();
		b.fly();

	}

}
