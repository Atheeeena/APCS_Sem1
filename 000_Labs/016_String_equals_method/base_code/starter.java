/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello traveler!\nAre you a wizard, a warrior, or a rogue? ");
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
	}
}
