/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String input = sc.nextLine();
		System.out.println("Letter by letter: ");
		for(int i = 0; i < input.length(); i++) {
			System.out.println(i + ": " + input.substring(i, i + 1));
		}
	}
}
