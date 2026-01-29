/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Donkey donkey = new Donkey();
		Ogre shrek = new Ogre();
		int i;
		String statement = "Shrek is not ugly";
		if(shrek.isUgly()){
			statement = new String(shrek.name + " IS UGLY!");
		}
		System.out.println(statement);
		donkey.interact(shrek);
		for(i = 0; i < 5; i++){
			shrek.interact(donkey);
		}
		System.out.println("That printed out " + i + " times");

	}
}
