/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	private String owner;
	private int accountNumber;
	private double balance;
	private boolean isActive;
	private static int nextAccountNumber = (int)(Math.random()*950 + 50);

	public BankAccount() {
		owner = "Unknown";
		accountNumber = 0;
		balance = 0;
		isActive = false;
		nextAccountNumber++;
	}
	public BankAccount(String o) {
		owner = o;
		accountNumber = nextAccountNumber;
		balance = 0;
		isActive = true;
		nextAccountNumber++;
	}
	public BankAccount(String o, double b, boolean i) {
		owner = o;
		accountNumber = nextAccountNumber;
		balance = b;
		isActive = i;
		nextAccountNumber++;
	}
	

	public void printDetails() {
		System.out.println("Name: " + owner);
		System.out.println("Balance: $" + balance);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Active: " + isActive);
		System.out.println("------------------------------------");
	}

}