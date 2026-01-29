/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String ans1 = new String("Math");
		String lower1 = new String("math");
		String ans2 = new String("Venus");
		String lower2 = new String("venus");
		String ans3 = new String("Apple");
		String lower3 = new String("apple");
		int whichAns = (int)(Math.random() * 3);
		System.out.println("You must guess the word with two hints!\n");
		if (whichAns == 0) {
			System.out.println("It is a subject in school!\nWhat is your guess? ");
			String guess = sc.nextLine();
			if (guess.equals(ans1) || guess.equals(lower1)) {
				System.out.println("That is correct!\nYou win!");
			}
			else {
				System.out.println("You did not guess right, here is another hint!\nIt has to do with numbers");
				guess = sc.nextLine();
				if (guess.equals(ans1) || guess.equals(lower1)) {
					System.out.println("That is correct!\nYou win!");
				}
				else {
					System.out.println("You did not guess right, it was " + lower1 + "\nYou Lose!");
				}
			}
		}
		else if (whichAns == 1) {
			System.out.println("It is a planet in our Solar System!\nWhat is your guess? ");
			String guess = sc.nextLine();
			if (guess.equals(ans2) || guess.equals(lower2)) {
				System.out.println("That is correct!\nYou win!");
			}
			else {
				System.out.println("You did not guess right, here is another hint!\nIt has a very thick atmosphere");
				guess = sc.nextLine();
				if (guess.equals(ans2) || guess.equals(lower2)) {
					System.out.println("That is correct!\nYou win!");
				}
				else {
					System.out.println("You did not guess right, it was " + lower2 + "\nYou Lose!");
				}
			}
		}
		else if (whichAns == 2) {
			System.out.println("It is a fruit!\nWhat is your guess? ");
			String guess = sc.nextLine();
			if (guess.equals(ans3) || guess.equals(lower3)) {
				System.out.println("That is correct!\nYou win!");
			}
			else {
				System.out.println("You did not guess right, here is another hint!\nIt is red");
				guess = sc.nextLine();
				if (guess.equals(ans3) || guess.equals(lower3)) {
					System.out.println("That is correct!\nYou win!");
				}
				else {
					System.out.println("You did not guess right, it was " + lower3 + "\nYou Lose!");
				}
			}
		}
	}
}
