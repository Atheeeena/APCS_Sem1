package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String name;
	int age;
	String breed;
	public Dog() {
		this.name = "Clifford";
		this.age = 3;
		this.breed = "Big Red Dog";
	}
	public Dog(String name) {
		this.name = name;
		this.age = 1;
		this.breed = "Dog Dog";
	}
	public Dog(String name, String breed) {
		this.name = name;
		this.age = 3;
		this.breed = breed;
	}
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		this.breed = "Dog Dog";
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getBreed() {
		return this.breed;
	}
	public boolean isSleeping() {
		if(Math.random() > .5) {
			return true;
		}
		else {
			return false;
		}
	}
	public void bark() {
		System.out.println(this.name + " barks!");
	}
}
