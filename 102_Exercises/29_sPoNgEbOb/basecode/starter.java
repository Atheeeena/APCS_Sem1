/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static String toSponge(String a) {
		String out = "";
		for (int x = 0; x < a.length(); x ++) {
			String letter = a.substring(x, x + 1);
			if(x % 2 == 0) {
				letter = letter.toLowerCase();
			}
			else {
				letter = letter.toUpperCase();
			}
			out += letter;
		}
		return out;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your word or phrase:");
		String input = sc.nextLine();
		System.out.println("Your word or phrase as sPoNgE cAsE: ");
		while (input.indexOf(" ") != -1) {
			String word = input.substring(0, input.indexOf(" "));
			System.out.print(toSponge(word) + " ");
			input = input.substring(input.indexOf(" ") + 1);
		}
		System.out.print(toSponge(input));
	}
}
