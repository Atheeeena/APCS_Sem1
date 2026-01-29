/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int randomNumber = (int)(Math.random() * 999 + 1);
		System.out.print("Guess the number(1-1000): ");
		int guess = sc.nextInt();
		if(randomNumber == guess) {
			System.out.println("Congratulations! You guessed the number!");
		}
		else {
			System.out.println("That is not the correct number.");
		}
	}
}
