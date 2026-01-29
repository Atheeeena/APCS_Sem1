/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.print("What number would you like to square root? ");
		double input = sc.nextDouble();
		if (input < 0) {
			input = -input;
		}
		System.out.print("How many decimals of accuracy would you like? (More than 8 may take significant time) ");
		double decimalNum = sc.nextDouble();
		double result = 1;
		while (decimalNum != 0) {
            result = result * 10;
            decimalNum = decimalNum - 1;
        }
		double x = input;
		while (x*x != input) {
			if (x*x > input) {
				x = x / 2.25;
			}
			else if (x*x < input) {
				x = x * 2.18;
			}
			if (x*x > (input-((1/result)*input)) && x*x < (input+((1/(result*10000))*input))) {
				break;
			}
		}
		double y = x;
		System.out.println(x + " is about the square root of " + input);
		while (x*x != input) {
			if (x*x > input) {
				x = x * 0.99;
			}
			else if (x*x < input) {
				x = x * 1.01;
			}
			if (x*x > (input-((1/(result*10000))*input)) && x*x < (input+((1/result)*input))) {
				break;
			}
		}
		System.out.println(x + " is about the square root of " + input);
		if (x<y) {
			System.out.println("The square root of " + input + " is between " + x + " and " + y);
		}
		else if (x>y) {
			System.out.println("The square root of " + input + " is between " + y + " and " + x);
		}


		
	}
}
