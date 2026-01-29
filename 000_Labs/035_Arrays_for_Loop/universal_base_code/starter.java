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
		for(int count = 0; count < 1000; count++) {
			array1[count] = (int)(Math.random() * 1001);
		}
		for(int count = 0; count < 1000; count++) {
			System.out.println("Array's value at index " + count + " is " + array1[count]);
		}
	}
}
