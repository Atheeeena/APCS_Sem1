/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		System.out.println("Hello traveler! What is your name?");
		String name = sc.nextLine();
		System.out.println("And what is your title?");
		String title = sc.nextLine();
		System.out.println("Are you a wizard, a warrior, or a rogue? ");
		String userClass = sc.nextLine();
		if(userClass.equals("Wizard") || userClass.equals("wizard")) {
			System.out.println("You are a wizard?\nI've never met one before.");
		}
		else if(userClass.equals("Warrior") || userClass.equals("warrior")) {
			System.out.println("You are a warrior?\nMeet Finnigan to begin your training. You'll be ready for war in no time.");
		}
		else if(userClass.equals("Rogue") || userClass.equals("rogue")) {
			System.out.println("You are a rogue?\nI guess you did sneak up on me.");
		}
		else {
			System.out.println("That is not an option.");
		}
		int points = 20;
		System.out.println("Let's get you ready for your journey!\nYou have 20 points to spend, max of 10 on each.");
		while(x == 0) {
			System.out.println("First up: Strength");
			int str = sc.nextInt();
			if (str > 10 || str < 0) {
				System.out.println("Must be between 0 and 10.");
			}
			else {
				points -= str;
					while(x == 0) {
						System.out.println("You have " + points + " points left to spend.");
						System.out.println("Second: Dexterity");
						int dex = sc.nextInt();
						if (dex > 10 || dex < 0) {
							System.out.println("Must be between 0 and 10.");
						}
						else {
							points -= dex;
							while(x == 0) {
								System.out.println("You have " + points + " points left to spend.");
								System.out.println("Third: Intelligence");
								int intl = sc.nextInt();
								if (intl > 10 || intl < 0) {
									System.out.println("Must be between 0 and 10.");
								}
								else if ((points - intl) < 0) {
									System.out.println("You don't have enough points to do that.");
								}
								else {
									points -= intl;
									while(x == 0) {
										System.out.println("You have " + points + " points left to spend.");
										System.out.println("Finally: Charisma");
										int chr = sc.nextInt();
										if (chr > 10 || chr < 0) {
											System.out.println("Must be between 0 and 10.");
										}
										else if ((points - chr) < 0) {
											System.out.println("You don't have enough points to do that.");
										}
										else {
											points -= chr;
											System.out.println("You have " + points + " points leftover.");
											System.out.println();
											System.out.println("------------------------------------------");
											System.out.println("You are " + name + ", the " + title + " of CVHS.");
											System.out.println("You are a " + userClass + " with the followig stats!");
											System.out.println("Strength - " + str);
											System.out.println("Dexterity - " + dex);
											System.out.println("Intelligence - " + intl);
											System.out.println("Charisma - " + chr);
											System.out.print("Good luck on your quest, " + name + "!");
											break;
			}
		}
			}
		}
			}
		}
			}
		}
	}
}
