/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Warrior[] warrior = new Warrior[100];
		Wizard[] wizard = new Wizard[100];
		int numOfWizards = 100;
		int numOfWarriors = 100;
		int wizardNum = 0;
		int warriorNum = 0;
		int round = 0;
		
		for(int count = 0; count < 100; count++) {
			warrior[count] = new Warrior(nameGenerator());
			wizard[count] = new Wizard(nameGenerator());
		}
		
		while (wizardNum < 99 && warriorNum < 99) {
			while (!(warrior[warriorNum].isDead()) && !(wizard[wizardNum].isDead())) {
				if (round%2 == 0) {
					wizard[wizardNum].attack(warrior[warriorNum]);
					if ((warrior[warriorNum].isDead())) {
						numOfWarriors--;
						if (!(warriorNum == 99)) {
							warriorNum++;
						}
					}
					else {
						warrior[warriorNum].attack(wizard[wizardNum]);
						if (wizard[wizardNum].isDead()) {
							numOfWizards--;
							if (!(wizardNum == 99)) {
								wizardNum++;
							}
						}
					}
				}
				else {
					warrior[warriorNum].attack(wizard[wizardNum]);
					if ((wizard[wizardNum].isDead())) {
						numOfWizards--;
						if (!(wizardNum == 99)) {
							wizardNum++;
						}
					}
					else {
						wizard[wizardNum].attack(warrior[warriorNum]);
						if (warrior[warriorNum].isDead()) {
							numOfWarriors--;
							if (!(warriorNum == 99)) {
								warriorNum++;
							}
						}
					}
				}
				round++;
			}
			
			
			if (wizardNum == 99 || warriorNum == 99) {
				if (numOfWarriors == 0) {
					System.out.println("The was was won by wizards.");
				}
				else {
					System.out.println("The war was won by warriors.");
				}
				System.out.println("There are " + numOfWarriors + " warriors remaining and " + numOfWizards + " wizards remaining.");
			}
		}

	}
	public static String nameGenerator() {
		String name = "";
		int current = 0;
		String next = "";
		String previous = "";
		String [] syllable = new String[20];
		syllable[0] = "quin";
		syllable[1] = "chan";
		syllable[2] = "er";
		syllable[3] = "ty";
		syllable[4] = "ler";
		syllable[5] = "tin";
		syllable[6] = "ex";
		syllable[7] = "zor";
		syllable[8] = "len";
		syllable[9] = "mich";
		syllable[10] = "ell";
		syllable[11] = "lyn";
		syllable[12] = "sor";
		syllable[13] = "ray";
		syllable[14] = "jay";
		syllable[15] = "bee";
		syllable[16] = "vee";
		syllable[17] = "ax";
		syllable[18] = "for";
		syllable[19] = "may";
		int letterCount = (int)(Math.random()*3 + 2);
		while (current < letterCount) {
			next = syllable[(int)(Math.random()*20)];
			if (!(next.equals(previous))) {
				previous = next;
				name += next;
				current++;
			}
		}
		return name;
	}
}
