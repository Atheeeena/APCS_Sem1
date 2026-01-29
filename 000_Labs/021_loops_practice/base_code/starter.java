/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = (int)(Math.random()*1001 + 1);
		System.out.print("Guess a number, 1 - 1000: ");
		int guess = sc.nextInt();
		while (guess != x) {
			if (guess > x) {
				System.out.print("Too high! Guess again: ");
				guess = sc.nextInt();
			}
			else {
				System.out.print("Too low! Guess again: ");
				guess = sc.nextInt();
			}
		}
		System.out.println("That is correct!");
	}
}
