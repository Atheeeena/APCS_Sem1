/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static String reverseString(String a) {
		int x = 0;
		int y = 0;
		int wordCount = 1;
		for (x = 0; x < a.length(); x++) {
			if ((a.substring(x, x+1)).equals(" ")) {
				wordCount++;
			}
		}
		String[] arr = new String[wordCount];
		for (x = 0; x < arr.length; x++) {
			arr[x] = "";
		}
		x = 0;
		String reverse = "";
		while(x < a.length()) {
			if ((a.substring(x, x+1)).equals(" ")) {
				y++;
			}
			else {
				arr[y] += a.substring(x, x+1);
			}
			x++;
		}
		for (x = wordCount - 1; x >= 0; x--) {
			reverse += arr[x] + " ";
		}
		return reverse;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a sentence: ");
		String input = sc.nextLine();
		System.out.println(reverseString(input));
	}
}
