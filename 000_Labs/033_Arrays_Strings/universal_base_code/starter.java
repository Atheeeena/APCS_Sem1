/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		String [] array = new String[10];
		array[0] = "If I could save time in a bottle";
		array[1] = "The first thing that I'd like to do";
		array[2] = "Is to save every day";
		array[3] = "'Til eternity passes away";
		array[4] = "Just to spend them with you";
		array[5] = "If I could make days last forever";
		array[6] = "If words could make wishes come true";
		array[7] = "I'd save every day like a treasure and then";
		array[8] = "Again, I would spend them with you";
		array[9] = "But there never seems to be enough time";
		int i = 0;
		while (i < 10) {
			System.out.println(array[i]);
			i++;
		}
	}
}
