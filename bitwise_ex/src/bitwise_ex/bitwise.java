//bitwise operations in Java 
//https://www.youtube.com/watch?v=qfH2Fkc1ujg
//https://www.tutorialspoint.com/Java-Bitwise-Operators
package bitwise_ex;

public class bitwise {
	
	public static void main(String[] args) {
		//in decimal
		bitwiseDeci();

	}
	
	//in decimal
	private static void bitwiseDeci() {
		//declare the variables		
		int a = 55, b = 27;
		
		//bin AND
		int and = a & b;
		
		//bin OR
		int or = a | b;
		
		//bin XOR
		int xor = a ^ b;
		
		//bin One Complement
		int one = ~a;
		
		//left shift + the num o bits to shift
		int left = a << 3;
		
		//right shift + the num o bits to shift
		int right = a >> 3;
		
		//right shift zero fill + the num o bits to shift
		int rightZero = a >>> 3;
		
		//print
		System.out.println("AND: " + and + ". In binary: " + Integer.toBinaryString(and));
		System.out.println("OR: " + or + ". In binary: " + Integer.toBinaryString(or));
		System.out.println("XOR: " + xor + ". In binary: " + Integer.toBinaryString(xor));
		System.out.println("One's Complement: " + and + ". In binary: " + Integer.toBinaryString(one));
		System.out.println("Left shift: " + left + ". In binary: " + Integer.toBinaryString(left));
		System.out.println("Right shift: " + right + ". In binary: " + Integer.toBinaryString(right));
		System.out.println("Right shift zero fill: " + rightZero + ". In binary: " + Integer.toBinaryString(rightZero));
		
	}
	

}
