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
	public BankAccount(String o, double b) {
		owner = o;
		accountNumber = nextAccountNumber;
		balance = b;
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
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String o) {
		owner = o;
	}
	public double getBalance() {
		return balance;
	}
	public void closeAccount() {
		isActive = false;
	}
	public void deposit(double a) {
		if (isActive) {
			balance += a;
			System.out.println("You have deposited $" + a);
		}
		else {
			System.out.println("This account is not active");
		}
	}
	public void withdraw(double a) {
		if (a <= balance) {
			balance -= a;
			System.out.println("Your account balance is now $" + balance);
		}
		else {
			System.out.println("You do not have enough money");
		}
	}
	public void displayAccountInfo() {
		System.out.println("Name: " + owner);
		System.out.println("Balance: $" + balance);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Active: " + isActive);
		System.out.println("------------------------------------");
	}
}

