/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter a second number: ");
		int num2 = sc.nextInt();
		
		System.out.println(num1 + " to the power of " + num2 + " is " + pow(num1, num2));
	}
	public static int pow(int a, int b) {
		int x = a;
		int y = b;
		int answer = 1;
		while (y > 0) {
			answer = answer * x;
			y = y - 1;
		}
		return answer;
	}
}
