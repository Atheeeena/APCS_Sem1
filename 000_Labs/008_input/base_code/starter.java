/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name? ");
		String name = sc.nextLine();
		System.out.println("What is your age? ");
		int age = sc.nextInt();
		System.out.println("What month were you born in? (1-12) ");
		int month = sc.nextInt();
		System.out.println("What day were you born? (1-31) ");
		int day = sc.nextInt();
		System.out.println("What year were you born? ");
		int year = sc.nextInt();
		System.out.println("If you have a dollar and 2 quarters, how much money do you have? (0.0-#) ");
		double amount = sc.nextDouble();
		System.out.println("Your name is " + name + " and you were born on " + month + "/" + day + "/" + year + ".");
		System.out.println("You are " + age + " years old!!!");
		System.out.println("You have $" + amount + " in your wallet.");
	}
}
