/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
		public static void toStringArray(int[] arr) {
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		}
		public static int getArrayAverage(int[] arr) {
			int avg = 0;
			for (int i = 0; i < arr.length; i++) {
				avg += arr[i];
			}
			avg /= arr.length;
			return avg;
		}
		public static int getArrayMax(int[] arr) {
			int max = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > max) {
					max = arr[i];
				}
			}
			return max;
		}
		public static int getArrayMin(int[] arr) {
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] < min) {
					min = arr[i];
				}
			}
			return min;
		}
		public static void main(String args[]) {
			int[] array1 = new int[100];
			for (int i = 0; i < array1.length; i++) {
				int targetNum = (int)(Math.random() * 100 + 1);
				array1[i] = targetNum;
			}
			System.out.print("The values of the array are ");
			toStringArray(array1);
			System.out.println("The average of the array is " + getArrayAverage(array1));
			System.out.println("The maximum value of the array is " + getArrayMax(array1));
			System.out.println("The minimum of the array is " + getArrayMin(array1));
		}
	}
