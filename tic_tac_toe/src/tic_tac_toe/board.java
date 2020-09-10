//tic tac toe tutorial from https://www.youtube.com/watch?v=gQb3dE-y1S4
package tic_tac_toe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class board {
	
	private static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
	private static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		//draw the game board using a 2D array
		char [] [] gameBoard = {{' ', '|', ' ', '|', ' '},
				{'-', '+', '-', '+', '-'}, 
				{' ', '|', ' ', '|', ' '},
				{'-', '+', '-', '+', '-'},
				{' ', '|', ' ', '|', ' '}};
		
			
		//game board method
		drawGameBoard(gameBoard);
		
		
		//always get user and cpu input
		while(true) {
			//scanner obj then get user input
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter your placement: 1-9: ");
			int playerPos = scan.nextInt();
			//userPlacement(gameBoard, playerPos, "player");
			
			//check if position is taken
			while(playerPositions.contains(playerPos) || cpuPositions.contains(playerPos)) {
				//System.out.println("Position taken!!");
				playerPos = scan.nextInt();
			}
			
			userPlacement(gameBoard, playerPos, "player");
			
			//check for a winner then print
			String result = checkWinner();
			
			if(result.length() > 0) {
				System.out.println(result);
				break;
			}
				
			
			Random rand = new Random();
			int cpuPos = rand.nextInt(9) + 1;
									
			//check if position is taken
			while(playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)) {
				//System.out.println("Position taken!!");
				cpuPos = rand.nextInt(9) + 1;
			}
			//place the cpu piece
			userPlacement(gameBoard, cpuPos, "CPU");
							
			//game board method
			drawGameBoard(gameBoard);
			
			//check for a winner then print
			result = checkWinner();
			
			if(result.length() > 0) {
				System.out.println(result);
				break;
			}
			
		}
		
	}
	
	private static void drawGameBoard(char [] [] gameBoard) {
		//loop through then draw
		for(char [] row : gameBoard) {
			for(char c : row) {
				System.out.print(c);
					}
		System.out.println();
		} 

	}
	
	private static void userPlacement(char [][] gameBoard, int pos, String user) {
		
		char symbol = ' ';
		
		//if the user is a human
		if(user.equals("player")) {
			symbol = 'X';
			playerPositions.add(pos);
		}
		else if (user.equals("CPU")) {
			symbol = 'O';
			cpuPositions.add(pos);
		}
		
		//place the users choice in the correct placement
				switch(pos) {
					case 1:
						gameBoard[0][0] = symbol;
						break;
					case 2:
						gameBoard[0][2] = symbol;
						break;
					case 3:
						gameBoard[0][4] = symbol;
						break;
					case 4:
						gameBoard[2][0] = symbol;
						break;
					case 5:
						gameBoard[2][2] = symbol;
						break;
					case 6:
						gameBoard[2][4] = symbol;
						break;
					case 7:
						gameBoard[4][0] = symbol;
						break;
					case 8:
						gameBoard[4][2] = symbol;
						break;
					case 9:
						gameBoard[4][4] = symbol;
						break;
					default:
						break;
				}
		
	}
	
	private static String checkWinner() {
		//check the rows for a winner
		List topRow = Arrays.asList(1, 2, 3);
		List midRow = Arrays.asList(4, 5, 6);
		List botRow = Arrays.asList(7, 8, 9);
				
		//next collums
		List leftCol = Arrays.asList(1, 4, 7);
		List midCol = Arrays.asList(2, 5, 8);
		List rightCol = Arrays.asList(3, 6, 9);
		
		//Diagonals
		List cross1 = Arrays.asList(1, 5, 9);
		List cross2 = Arrays.asList(7, 5, 3);
		
		List<List> winning = new ArrayList<List>();
		
		winning.add(topRow);
		winning.add(midRow);
		winning.add(botRow);
		winning.add(leftCol);
		winning.add(midCol);
		winning.add(rightCol);
		winning.add(cross1);
		winning.add(cross2);
		
		//loop through the array list to determine the winner
		for(List l : winning) {
			if(playerPositions.containsAll(l)) {
				return "Congratulations you won!!!!!";
			}
			else if(cpuPositions.containsAll(l)){
				return "Computer wins!!!!! Try again next time!!";
			}
			//tie
			else if(playerPositions.size() + cpuPositions.size() == 9) {
				return "Tie!!!";
			}
		}
		
		return "";
		
	}

}
