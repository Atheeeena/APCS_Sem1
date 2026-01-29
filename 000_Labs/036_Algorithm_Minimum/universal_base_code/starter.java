/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int[] array1 = new int[(int)(Math.random() * 149 + 51)];
		
		for(int count = 0; count < array1.length; count++) {
			array1[count] = (int)(Math.random() * 100 + 1);
		}
		
		int min = 100;
		int max = 1;
		double avg = 0;
		for(int count = 0; count < array1.length; count++) {
			if (array1[count] < min) {
				min = array1[count];
			}
			if (array1[count] > max) {
				max = array1[count];
			}
			avg += array1[count];
		}
		avg /= array1.length;
		System.out.println("The array has " + array1.length + " elements.");
		System.out.println("The minimum amount is " + min);
		System.out.println("The maximum amount is " + max);
		System.out.println("The average amount is " + avg);
	}
}
