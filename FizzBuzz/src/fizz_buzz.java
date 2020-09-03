
public class fizz_buzz {

	public static void main(String[] args) {
		// fizzbuzz!!!!
		System.out.println("The Fizz Buzz Challenge!!!!");
		
		//call the fizzbuzz method
		fizzBuzz();
				
	}
	
	//the method where fizzbuzz will be performed
	private static void fizzBuzz() {
		//start the loop
		for(int i = 1; i <= 100; i++){
		//if i is / by 3
		if((i % 3) == 0) {
			System.out.println("Fizz");
			}
		//else if / by 5
		else if ((i % 5) == 0) {
			System.out.println("Buzz");
			}
		//else if / 15
		else if ((i % 15) == 0) {
			System.out.println("Fizz Buzz");
			}
		//other wise print i
		else {
			System.out.println(i);
			}
		}
	}

}
