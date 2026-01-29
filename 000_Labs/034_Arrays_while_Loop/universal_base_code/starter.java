/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int[] array1 = new int[1000];
		int count = 0;
		while (count < 1000) {
			array1[count] = (int)(Math.random() * 1001);
			count++;
		}
		count = 0;
		while (count < 1000) {
			System.out.println("Array's value at index " + count + " is " + array1[count]);
			count++;
		}
	}
}
