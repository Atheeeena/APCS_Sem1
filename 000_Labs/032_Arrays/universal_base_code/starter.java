/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] array = new int[10];
		int i = 0;
		int a = 9;
		while (i < 10) {
			array[i] = a;
			System.out.println("Array " + i + " is " + array[i]);
			i++;
			a--;
		}
	}
}
