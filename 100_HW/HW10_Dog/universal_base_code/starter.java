/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Dog name?");
		String name1 = sc.nextLine();
		System.out.println("How old is " + name1 + "?");
		int age1 = sc.nextInt();
		Dog dog1 = new Dog(name1);
		dog1.setAge(age1);
		System.out.println(name1 + " is a " + dog1.getBreed() + " that is " + age1 + " years old!");
		Dog charles = new Dog("Charles", "Labrador");
		System.out.println(charles.getName() + " is a " + charles.getBreed() + " that is " + charles.getAge() + " years old!");
		boolean mSleep = dog1.isSleeping();
		boolean cSleep = charles.isSleeping();
		if (mSleep) {
			System.out.println(dog1.getName() + " is asleep! Don't wake " + dog1.getName() + " up!");
		}
		else {
			dog1.bark();
		}
		if (!mSleep && cSleep) {
			System.out.println(charles.getName() + " woke up from hearing " + dog1.getName() + " brak!");
			charles.bark();
		}
	}
}
