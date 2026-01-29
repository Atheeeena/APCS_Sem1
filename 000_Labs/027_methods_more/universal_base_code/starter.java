/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BankAccount x = new BankAccount();
		BankAccount y = new BankAccount("Jacob");
		BankAccount z = new BankAccount("Damion", 985.35, true);
		System.out.print("Default balance: ");
		x.checkBalance();
		System.out.println();
		x.displayAccountInfo();
		System.out.print("Jacob's balance: ");
		y.checkBalance();
		System.out.println();
		y.displayAccountInfo();
		System.out.print("Damion's balance: ");
		z.checkBalance();
		System.out.println();
		z.displayAccountInfo();
	}
}
