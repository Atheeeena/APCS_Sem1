/*
 *	Author:  
 *  Date: 
*/

import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.*;
import java.util.Scanner;

class starter {
	static long startTime = 0;
	static ArrayList<String> arr = new ArrayList<String>();

	public static void main(String args[]) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to TypeMaster!");
		String time = getTime();
		System.out.println("It is currently " + time + " and we are ready to type!");
		System.out.println("Given a sentence, type it correctly as quickly as possible!");
		while (true) {
			System.out.println("\n------------------------------------------");
			System.out.println("Would you like to:\n1. Play random\n2. Play set\n3. Quit");
			int ans = sc.nextInt();
			sc.nextLine();
			if (ans == 1) {
				System.out.println("You've chosen to randomly select a sentence.");
				String randSent = getSentence();
				System.out.println("\n-----------------Your sentence is:-----------------\n" + randSent + "\n---------------------------------------------------");
				countdown();
				startTimer();
				String input = sc.nextLine();
				int errors = compareSentences(randSent, input);
				System.out.println("Nice job! Here are your results: ");
				double x = endTimer();
				System.out.println("Time: " + x);
				System.out.println("Errors: " + errors + "/" + lettersInSentence(randSent));
				System.out.println(((lettersInSentence(randSent))/x) * 60 + " letters per minute");
				System.out.println(((wordsInSentence(randSent))/x) * 60 + " words per minute");
			}
			else if (ans == 2) {
				System.out.print("Please input the sentence number: ");
				int selection = sc.nextInt();
				sc.nextLine();
				String chosen = getSentence(selection);
				System.out.println("\n-----------------Your sentence is:-----------------\n" + chosen + "\n---------------------------------------------------");
				countdown();
				startTimer();
				String input = sc.nextLine();
				int errors = compareSentences(chosen, input);
				System.out.println("Nice job! Here are your results: ");
				double x = endTimer();
				System.out.println("Time: " + x);
				System.out.println("Errors: " + errors + "/" + lettersInSentence(chosen));
				System.out.println(((lettersInSentence(chosen))/x) * 60 + " letters per minute");
				System.out.println(((wordsInSentence(chosen))/x) * 60 + " words per minute");
			}
			else if (ans == 3) {
				break;
			}
			else {
				System.out.println("That is not a correct option.");
			}
		}
		
	}

	// This method returns the local current time as a String
	public static String getTime(){
		LocalTime now = LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm:ss a");
        return now.format(format);
	}

	// This method starts a clock that can be used throughout the program
	public static void startTimer(){
		startTime = System.nanoTime();
	}

	// This method stops the timer clock and returns a double of the seconds and milliseconds of the stopwatch
	public static double endTimer() throws InterruptedException{
		long endTime = System.nanoTime();
		long timeSeconds = ((endTime - startTime)/1000000);
		double decSeconds = timeSeconds/1000.0;
		return decSeconds;
	}

	// This method does a 3 second countdown and prints it to the terminal
	public static void countdown(){
		System.out.println("Starting countdown...");
		for (int i = 0; i < 3; i++) {
			System.out.println(3-i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("Go!");
	}

	// This method sets up a list of sentences to be called from. 
	// This should only be called once prior to getting sentences.
	private static void populateArrayList(){
		File f = new File("sentences.txt");
		try(Scanner fsc = new Scanner(f)){
			while(fsc.hasNextLine()){
				arr.add(fsc.nextLine());
			}
		}
		catch(FileNotFoundException e){
			System.err.println("File not found: " + e.getMessage());
		}
	}

	// This chooses 1 of the 100 sentences in the list to return.
	public static String getSentence(){
		populateArrayList();
		int rand = (int)(Math.random()*100);
		return arr.get(rand);
	}

	// This returns the same sentence for the same integer given.
	public static String getSentence(int index){
		populateArrayList();
		return arr.get(index%100);
	}

	//  This returns the number of letters, spaces, and punctuations in a sentence.
	public static int lettersInSentence(String sent){
		return sent.length();
	}
	
	// This returns the number of words in a sentence
	public static int wordsInSentence(String sent){
		int spaceCount = 0;
		while(sent.indexOf(" ") > -1){
			spaceCount++;
			sent = sent.substring(sent.indexOf(" ")+1);
		}
		return ++spaceCount;
	}

	// This method does a letter by letter comparison of each word and returns the number of errors.
	public static int compareSentences(String given, String typed){
		int errors = 0;
		while(given.length() > 0 && typed.length() > 0){
			if(!given.substring(0,1).equals(typed.substring(0,1)))
				errors++;
			given = given.substring(1);
			typed = typed.substring(1);
		}
		return errors;
	}

}
