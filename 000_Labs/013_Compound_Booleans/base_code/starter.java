/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the first number: ");
		int x = sc.nextInt();
		System.out.print("Please enter the second number: ");
		int y = sc.nextInt();
		System.out.print("Please enter the third number: ");
		int z = sc.nextInt();
		if(x > y && x > z) {
			System.out.println(x + " is the largest number.");
		}
		if(y > x && y > z) {
			System.out.println(y + " is the largest number.");
		}
		if(z > y && z > x) {
			System.out.println(z + " is the largest number.");
		}
		if(x < y && x < z) {
			System.out.println(x + " is the smallest number.");
		}
		if(y < x && y < z) {
			System.out.println(y + " is the smallest number.");
		}
		if(z < y && z < x) {
			System.out.println(z + " is the smallest number.");
		}
	}
}
