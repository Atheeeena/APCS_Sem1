/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int money = 100;
		int x = 0;
		int y = 0;
		int z = 0;
		int bet = 0;
		String ans = "";
		System.out.println("Slot Machine Rules: \n1. Each player starts with $100. \n2. Input a wager less than your total amount of money. \n3. The slot machine will roll 3 numbers from 1 to 10. \na. If two numbers match, you double your money. \nb. If three numbers match, you triple your money. \nc. If none match, you lose your money.");
		while(money >= 0) {
			System.out.print("\nWould you like to play the slots? (Yes/yes/Y/y) : ");
			ans = sc.nextLine();
			if (ans.equals("Yes") || ans.equals("yes") || ans.equals("Y") || ans.equals("y")) {
				System.out.print("You have $" + money + ". How much would you like to bet? ");
				bet = sc.nextInt();
				sc.nextLine();
				money -= bet;
				if (money >= 0) {
					System.out.println("Great! Let's play!!!");
					x = (int)(Math.random() * 10 + 1);
					y = (int)(Math.random() * 10 + 1);
					z = (int)(Math.random() * 10 + 1);
					System.out.println("Your rolls are:");
					System.out.println(" _________________");
					System.out.println("|  " + x + "  |  " + y + "  |  " + z + "  |");
					System.out.println(" ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
					if (x == y || x == z || y == z) {
						System.out.println("2 numbers matched! Your money bet has been doubled.");
						bet *= 2;
						money += bet;
					}
					else if (x == y && y == z) {
						System.out.println("3 numbers matched! Your money bet has been tripled.");
						bet *= 3;
						money += bet;
					}
					else {
						System.out.println("No numbers matched! Your money bet is gone.");
					}
				}
				else {
					System.out.println("Not enough money to do this.");
				}
			}
			else if (ans.equals("No") || ans.equals("no") || ans.equals("N") || ans.equals("n")) {
				System.out.println("You ended with $" + money + ".\nPlease return soon!\n--------------------------------------------------");
				break;
			}
			else {
				System.out.println("That wasn't a correct answer. Please try again.");
			}
			if (money == 0) {
				System.out.println("You are out of money!");
				break;
			}
		}
	}
}
