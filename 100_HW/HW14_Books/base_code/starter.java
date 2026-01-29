/*
 *	Author:
 *  Date:
*/

import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the file name of one of the text files in the \'books\' folder: (Ex: test.txt)");
		String textFile = sc.nextLine();
		String[] arr = fillArray(textFile);
		System.out.println();


		
		while(true){
			System.out.println("What action would you like to take?");
			System.out.println("1. Check text file (file)");
			System.out.println("2. Print the text given (print)");
			System.out.println("3. Print the text backwards (printBack)");
			System.out.println("4. Print a certain number of words (printNum)");
			System.out.println("5. Change the text file (change)");
			System.out.println("6. Check the number of words in a text (check)");
			System.out.println("7. Most common word (common)");
			String choice = sc.nextLine();
			System.out.println();

			switch (choice) {
				case "file":
					System.out.println(textFile);
					break;
				case "print":
					System.out.println("------------------------------------Printing Forward------------------------------------");
					printsArray(arr);
					System.out.println("------------------------------------Printing Forward------------------------------------");
					break;
				case "printBack":
					System.out.println("------------------------------------Printing Backward------------------------------------");
					printsArrayBack(arr);
					System.out.println("------------------------------------Printing Backward------------------------------------");
					break;
				case "printNum":
					System.out.println("How many words of the text would you like to print?");
					int num = sc.nextInt();
					sc.nextLine();
					System.out.println("------------------------------------Printing First " + num + " Words------------------------------------");
					printsNumber(arr, num);
					System.out.println("------------------------------------Printing First " + num + " Words------------------------------------");
					break;
				case "change":
					System.out.println("What is the file name of the text? (Ex: joe.txt)");
					textFile = sc.nextLine();
					arr = fillArray(textFile);
					break;
				case "check":
					System.out.println("What word/phrase would you like to check?");
					String word = sc.nextLine();
					System.out.println("There are " + checksArray(arr, word) + " uses of '" + word + "' in " + textFile);
					break;
				case "common":
					System.out.println("The most common word in " + textFile + " is: " + mostCommon(arr));
					break;
			}

			System.out.println("---------------------------------------------------------------");
		}
	}


	
	public static void printsArray(String[] arr){
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}


	
	public static void printsArrayBack(String[] arr){
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}


	
	public static void printsNumber(String[] arr, int num){
		for(int i = 0; i < num; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}


	
	public static int checksArray(String[] arr, String check){
		int uses = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].toLowerCase().equals(check.toLowerCase())) {
				uses++;
			}
		}
		return uses;	
	}


	
	public static String mostCommon(String[] arr){
		int mostUses = 0;
		int numUses = 0;
		String mostCommon = "";
		for(int i = 0; i < arr.length; i++) {
			numUses = checksArray(arr, arr[i]);
			if(numUses > mostUses) {
				mostUses = (numUses);
				mostCommon = arr[i];
			}
			
		}
		return mostCommon;
	}




	
	public static String[] fillArray(String arg) throws FileNotFoundException {
		File text = new File("./books/" + arg);
		Scanner sc = new Scanner(text);
		int lineNumber = 0;
		while(sc.hasNext()){
			sc.next();
			lineNumber++;
		}

		String[] arr = new String[lineNumber];
		sc = new Scanner(text);
		for(int i = 0; i < lineNumber; i++){
			arr[i] = sc.next();
        }
		return arr;
	}

}
