/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int max1 = Math.max(13 - 6 * 11, 30 % 7 * (-2));
		double sqrt1 = Math.sqrt(3 * 8 + 31 % 7);
		double pow1 = Math.pow(37 / 3, 35 % 21);
		double max2 = Math.max(Math.pow( 2,14%3), Math.sqrt( 2*6));
		System.out.println("Maximum = " + max1);
		System.out.println("Square root = " + sqrt1);
		System.out.println("Power = " + pow1);
		System.out.println("Max = " + max2);
		//extra work starts below this line
		System.out.println("What is the first value? ");
		double x = sc.nextDouble();
		System.out.println("What is the second value? ");
		double y = sc.nextDouble();
		System.out.println("Max = " + Math.max(x,y));
		System.out.println("Square root of y = " + Math.sqrt(y));
		System.out.println("x^y = " + Math.pow(x,y));
	}
}
