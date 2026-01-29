/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the first number: ");
		int num1 = sc.nextInt();
		System.out.print("Please enter the second number: ");
		int num2 = sc.nextInt();
		if(num1 == num2) {
			System.out.println(num1 + " is equal to " + num2);
		}
		else {
			System.out.println(num1 + " is not equal to " + num2);
		}
	}
}
