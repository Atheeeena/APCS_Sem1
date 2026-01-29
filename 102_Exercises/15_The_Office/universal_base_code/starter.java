/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.employeeToString();
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.employeeToString();
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		pam.employeeToString();
		Employee kevin = new Employee(2983, "Kevin", "Malone", 3540.27);
		kevin.employeeToString();
		michael.raiseSalary(15);
		michael.employeeToString();
		dwight.raiseSalary(20);
		dwight.employeeToString();
		jim.raiseSalary(20);
		jim.employeeToString();
		pam.raiseSalary(20);
		pam.employeeToString();
		kevin.raiseSalary(5);
		kevin.employeeToString();
		System.out.println("Michael's annual salary is " + michael.getAnnualSalary());
		System.out.println("Dwight's annual salary is " + dwight.getAnnualSalary());
		System.out.println("Jim's annual salary is " + jim.getAnnualSalary());
		System.out.println("Pam's annual salary is " + pam.getAnnualSalary());
		System.out.println("Kevin's annual salary is " + kevin.getAnnualSalary());
	}
}
