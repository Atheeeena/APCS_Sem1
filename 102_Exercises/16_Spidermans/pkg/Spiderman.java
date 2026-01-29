package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villain;		// Who's the arch nemesis of this Spiderman?

	public Spiderman(String a) {
		actor = a;
		age = 0;
		villain = "unknown";
	}
	public Spiderman(int b) {
		age = b;
		actor = "unknown";
		villain = "unknown";
	}
	public Spiderman(String a, int b) {
		actor = a;
		age = b;
		villain = "unknown";
	}
	public Spiderman(String a, int b, String v) {
		actor = a;
		age = b;
		villain = v;
	}
	
	// ---------------------------------------
	
	public String getActor() {
		return actor;
	}
	public void setActor(String a) {
		this.actor = a;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int b) {
		this.age = b;
	}
	public String getVillain() {
		return villain;
	}
	public void setVillain(String v) {
		this.villain = v;
	}


	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
