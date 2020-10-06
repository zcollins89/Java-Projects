package fibonacci;

import java.util.Scanner;

public class fib_main {

	public static void main(String[] args) {
		//call userInput() method
		userInput();

	}
	
	private static void userInput() {
		//fib variable
		int fib1;
		//for user input
		Scanner scan = new Scanner(System.in);
		//Display welcome message
		System.out.println("Fibonacci sequence calculator.");
		System.out.println("Enter a number: ");
		fib1 = scan.nextInt();
		
		//this is where the actual calculations wil1 be performed
		calc(fib1);
	}
	
	private static void calc(int count) {
		//the value passed from userInout()
		int nVar1 = count;
		
		//these will be used for the calculations
		int nVar2 = 1, nVar3 = 2;
		
		//start the for loop
		for(int i = 1; i <= nVar1; i++) {
			System.out.print(nVar2 +" \n");

            /* On each iteration, we are assigning second number
             * to the first number and assigning the sum of last two
             * numbers to the second number
             */
            int sumOf2 = nVar2 + nVar3;
            nVar2 = nVar3;
            nVar3 = sumOf2;
		}
	}

	
}
