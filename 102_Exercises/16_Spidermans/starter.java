/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Spiderman tobey = new Spiderman("Tobey Maguire", 48, "Green Goblin");
		Spiderman andrew = new Spiderman("Andrew Garfield", 40, "Electro");
		Spiderman tom = new Spiderman("Tom Holland", 27, "The Vulture");
		Spiderman robbie = new Spiderman("Robbie Daymond", 43, "Venom");
		
		System.out.println("Tobey is " + tobey.getAge() + " years old");
		tobey.printArt();
	}
}
