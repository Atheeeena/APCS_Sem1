/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BankAccount james = new BankAccount();
		BankAccount darryl = new BankAccount("Darryl");
		BankAccount madeline = new BankAccount("Madeline", 5624.75, true);
		BankAccount alex = new BankAccount("Alex", 254.96, true);
		james.printDetails();
		darryl.printDetails();
		madeline.printDetails();
		alex.printDetails();
	}
}
