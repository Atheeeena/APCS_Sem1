/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}
	public static int randAge() {
		int rand = (int)(Math.random()*200 + 50);
		return rand;
	}

	public static void main(String args[]) {
		// Your code goes below here
		int same = 1;
		PooleDwarf dwarf1 = new PooleDwarf(randAge(), randName());
		PooleDwarf dwarf2 = new PooleDwarf(randAge(), randName());
		PooleDwarf dwarf3 = new PooleDwarf(randAge(), randName());
		PooleDwarf dwarf4 = new PooleDwarf(randAge(), randName());
		PooleDwarf dwarf5 = new PooleDwarf(randAge(), randName());
		PooleDwarf dwarf6 = new PooleDwarf(randAge(), randName());
		PooleDwarf dwarf7 = new PooleDwarf(randAge(), randName());
		if(dwarf1.isSameName(dwarf2.getName())) {
			same++;
		}
		if(dwarf1.isSameName(dwarf3.getName())) {
			same++;
		}
		if(dwarf1.isSameName(dwarf4.getName())) {
			same++;
		}
		if(dwarf1.isSameName(dwarf5.getName())) {
			same++;
		}
		if(dwarf1.isSameName(dwarf6.getName())) {
			same++;
		}
		if(dwarf1.isSameName(dwarf7.getName())) {
			same++;
		}
		System.out.println("The name " + dwarf1.getName() + " was used " + same + " times.");
	}
}
