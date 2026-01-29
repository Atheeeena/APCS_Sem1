/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		String inp = sc.nextLine();
		String y = Cipher.keyedEncode(inp, 29);
		System.out.println(y);
	}
}
