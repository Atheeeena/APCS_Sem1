/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/
import java.util.Scanner;
import java.util.Random;


class starter {
	// The goal of the first method is to give back whether the year given is a leap year or not. 2004 is a leap year.
	public static boolean isLeapYear(int a) {
		if (a % 4 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	// The goal of the second method is to add all the digits of a number up. Ex: 12345 has a total of 15.
	public static int getDigitSum(int a) {
		int y = a;
		int b = 10;
		int lastNum = 0;
		int finalSum = 0;
		int numOfDigits = (int)(Math.log10(y)+1);
		while (numOfDigits > 0) {
			while (true) {
				if (y % b == 0) {
					break;
				}
				y -= 0.1 * b;
				lastNum += 1;
			}
			finalSum += lastNum;
			b *= 10;
			numOfDigits -= 1;
			lastNum = 0;
		}
		return finalSum;
	}
	// The goal of the third method is to check if 3 numbers are consecutive. 15 16 17 are consecutive. It will print if they are or not.
	public static boolean printIfConsecutive(int a, int b, int c) {
		if (c - b == 1 && b - a == 1) {
			System.out.println("These numbers are consecutive!");
			return true;
		}
		else {
			System.out.println("These numbers are not consecutive!");
			return false;
		}
	}
	// Assume that the first number is always the smallest and the third number is always the largest.

	public static void main(String args[]) {
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		System.out.println();
		if(isLeapYear(year))
			System.out.println(year + " is a leap year!");
		else
			System.out.println(year + " is not a leap year!");

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a 5 digit number");
		int number = sc.nextInt();
		int sum = getDigitSum(number);
		System.out.println();
		System.out.println("The sum of the digits of " + number + " is " + sum);

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println("Enter a number");
		int num2 = sc.nextInt();
		System.out.println("Enter a number");
		int num3 = sc.nextInt();
		System.out.println();
		printIfConsecutive(num1, num2, num3);
		System.out.println();
		System.out.println("----------------------------------------");
	}
}
