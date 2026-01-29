/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows would you like in the 2D array?");
		int rows = sc.nextInt();
		sc.nextLine();
		System.out.println("How many columns would you like in the 2D array?");
		int columns = sc.nextInt();
		sc.nextLine();
		int [][] arr = new int[rows][columns];
		double totalAverage = 0;
		System.out.println("---------------------------------------");
		for(int r = 0; r < rows; r++) {
			for(int c = 0; c < columns; c++) {
				arr[r][c] = (int)(Math.random()*11);
				totalAverage += arr[r][c];
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}
		totalAverage /= rows * columns;
		System.out.println("---------------------------------------");
		System.out.println("What row would you like to get the average of?");
		int row = sc.nextInt();
		double rowAverage = 0;
		for(int c = 0; c < columns; c++) {
			rowAverage += arr[row][c];
		}
		rowAverage /= columns;
		System.out.println("The row average is " + rowAverage);
		System.out.println("The average of the 2D array is " + totalAverage);
	}
}
