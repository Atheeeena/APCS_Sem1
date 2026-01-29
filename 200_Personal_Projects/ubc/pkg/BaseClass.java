/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	Scanner sc = new Scanner(System.in);
	double ave = 0.0;
	double x = 1.0;
	while(x < 6) {
		System.out.print("Input grade: ");
		double input = sc.nextDouble();
		ave = (ave + input) / x;
		x = x + 1;
		System.out.println("Average: " + ave);
	}
	public BaseClass() {
		
		
	}

}
