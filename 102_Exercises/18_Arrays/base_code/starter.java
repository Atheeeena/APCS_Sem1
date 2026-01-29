/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int [] array1 = new int[1001];
		int a = 0;
		int b = 3;
		while (a < 1001) {
			array1[a] = b;
			System.out.println("Array number 1 at index " + a + " has the value " + array1[a]);
			a++;
			b+=3;
		}
		int [] array2 = new int[1001];
		int c = 0;
		int d = 1000;
		while (c < 1001) {
			array2[c] = d;
			System.out.println("Array number 2 at index " + c + " has the value " + array2[c]);
			c++;
			d--;
		}
	}
}
