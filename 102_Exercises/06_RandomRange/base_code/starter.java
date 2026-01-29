/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num1 = 7;
		int num2 = 6;
		while (num1 >= num2) {
			System.out.print("Please input the first number: ");
			num1 = sc.nextInt();
			System.out.print("Please input the second number: ");
			num2 = sc.nextInt();
			if (num1 < num2) {
				System.out.println("Your range is " + num1 + " and " + num2);
				int one = (int)(Math.random() * (num2 - num1) + num1);
				int two = (int)(Math.random() * (num2 - num1) + num1);
				int three = (int)(Math.random() * (num2 - num1) + num1);
				int four = (int)(Math.random() * (num2 - num1) + num1);
				int five = (int)(Math.random() * (num2 - num1) + num1);
				System.out.println("5 random numbers between " + num1 + " and " + num2 + " are:\n" + one + "\n" + two + "\n" + three + "\n" + four + "\n" + five);
			}
			else {
			System.out.println("THe second number must be larger than the first number.");
			}
		}
		}
	}
