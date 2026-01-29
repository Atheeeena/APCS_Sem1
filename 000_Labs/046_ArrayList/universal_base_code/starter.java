/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;
import java.util.ArrayList;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList <String> arr = new ArrayList<String>();
		System.out.println("Welcome to the Cookie Store!");
		String ans = "yes";
		int num = 1;
		while(ans.toLowerCase().equals("yes")) {
			System.out.println("What is your #" + num + " cookie?");
			String input = sc.nextLine();
			arr.add(input);
			num++;
			System.out.println("Would you like another? (Yes/No)");
			ans = sc.nextLine();
		}
		System.out.println("--------------------------------------------------\nHere's your final cookie list: ");
		for(int x = 0; x < num - 1; x++) {
			System.out.println("Cookie #" + (x + 1) + ": " + arr.get(x));
		}
	}
}
