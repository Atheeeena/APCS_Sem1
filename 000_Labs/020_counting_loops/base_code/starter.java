/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.print("What is your name? ");
			String name = sc.nextLine();
			System.out.print("How many times would you like your name printed? ");
			int amount = sc.nextInt();
			while (amount > 0) {
				System.out.println(name);
				amount -= 1;
			}
	}
}
