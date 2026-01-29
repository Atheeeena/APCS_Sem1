/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static boolean checkPrime(int a) {
		int x = 2;
		int y = 1;
		while (a%x != 0) {
			y++;
			x++;
		}
		if(y == a-1) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void printPrimes(int a) {
		int z = 2;
		while(z <= a) {
			if(checkPrime(z)) {
				System.out.println(z);
			}
			z++;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number and we'll print every prime until that number: ");
		int input = sc.nextInt();
		printPrimes(input);
	}
}
