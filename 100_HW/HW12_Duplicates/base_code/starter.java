/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int[] array1 = new int[20];
		int targetNum = (int)(Math.random() * 10 + 1);
		int duplicateCount = 0;
		
		for(int count = 0; count < 20; count++) {
			array1[count] = (int)(Math.random() * 10 + 1);
		}
		for(int count = 0; count < 20; count++) {
			if (array1[count] == targetNum) {
				System.out.println("Index " + count + " is equal to " + targetNum);
				duplicateCount++;
			}
		}
		System.out.println("There are " + duplicateCount + " indexes equal to " + targetNum + ".\n");
		for(int x = 0; x < 20; x++) {
			if (x != 0 && array1[x] == array1[x - 1]) {
				System.out.println("Index " + x + " is equal to index " + (x - 1) + "\nThe number they are equal to is " + array1[x] + ".");
			}
		}
	}
}
