package wpm_count;
import java.time.LocalTime;
//import packages
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class wpm {
	
	//random words to type. Stored in an array
	private static String[] words = {"envelope", "cantelope", "car", "dodge",
				"hello", "dog", "cat", "name","computer", "java"};
	
	//Scanner obj constructor
	private static Scanner scan;

	public static void main(String[] args) throws InterruptedException {
		// 3....2....1...GO!!!!!
		System.out.println("3");
		//sleep for one second
		TimeUnit.SECONDS.sleep(1);
		
		System.out.println("2");
		TimeUnit.SECONDS.sleep(1);
		
		System.out.println("1");
		TimeUnit.SECONDS.sleep(1);
		
		//random number generator obj constructor
		Random rand = new Random();
		//generate random words to type
		for(int i = 0; i < 10; i++) {
			System.out.print(words[rand.nextInt(9)] + " ");
		}
		
		System.out.println("\n");
		
		//get current time to calculate the typng speed
		double start = LocalTime.now().toNanoOfDay();
		
		//scanner obj then get user input then show the users typing speed
		scan = new Scanner(System.in);
		String typedWords = scan.nextLine();
		
		//end time then run the calculation
		double end = LocalTime.now().toNanoOfDay();
		
		double elapsedTime = (end - start) / 1000000000.0;
		
		int numOfChars = typedWords.length();
		
		int wpm = (int) ((((double)numOfChars / 5) / elapsedTime) * 60);
		
		System.out.println("Your WPM is " + wpm + "!");
		
	}

}
