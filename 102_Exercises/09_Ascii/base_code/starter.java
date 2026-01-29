/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What would you like to print out? (Animal, Object, or Face) ");
		String input = sc.nextLine();
		if (input.equals("Animal") || input.equals("animal")) {
			System.out.println("      /\\_______/\\   ");
			System.out.println("     |           |   ");
			System.out.println("     |   O   O   |   ");
			System.out.println("     |     .     |   ");
			System.out.println("     |     ^     |   ");
			System.out.println("      ‾‾‾‾‾‾‾‾‾‾‾    ");
		}
		else if (input.equals("Object") || input.equals("object")) {
			System.out.println("    __  ");
			System.out.println("   (-^)>");
			System.out.println(" (    ) ");
			System.out.println("  ‾‾‾‾ ");
		}
		else if (input.equals("Face") || input.equals("face")) {
			System.out.println("/\\/\\/\\/\\/\\/\\");
			System.out.println("|          |");
			System.out.println("(  0   0   )");
			System.out.println("|    ^     |");
			System.out.println("|   ___    |");
			System.out.println("|          |");
			System.out.println(" ‾‾‾‾‾‾‾‾‾‾");
		}
	}
}
