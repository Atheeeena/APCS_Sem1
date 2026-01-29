/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [][] arr = new int[3][3];
		arr[0][0] = 6;
		arr[0][1] = 2;
		arr[0][2] = 24;
		arr[1][0] = 8;
		arr[1][1] = 19;
		arr[1][2] = 5;
		arr[2][0] = 3;
		arr[2][1] = 1;
		arr[2][2] = 4;
		int avg = 0;
		for(int r = 0; r < arr.length; r++) {
			for(int c = 0; c < arr[0].length; c++) {
				System.out.print(arr[r][c] + " ");
				avg += arr[r][c];
			}
			System.out.println();
		}
		avg /= 9;
		System.out.println("The average is " + avg);
	}
}
