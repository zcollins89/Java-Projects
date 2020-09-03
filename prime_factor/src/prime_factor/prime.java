package prime_factor;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		//the method where the calculations will be performed
		primeFactor();

	}
	
	private static void primeFactor() {
		int numIn;
		//get user input and print a welcome message
		System.out.println("Prime Factorization! \nEnter a number: \n");
		Scanner input = new Scanner(System.in);
		numIn = input.nextInt();
		
		//setup the loop and factor the numbers
		for(int i = 2; i < numIn; i++) {
			while(numIn % i == 0) {
				System.out.println(i + " ");
				numIn /= i;
			}
		}
		
		if(numIn > 2) {
			System.out.println(numIn);
		}
	}

}
