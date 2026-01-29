/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;
import pkg.*;

class starter {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean isCorrect = true;
        String [] words = new String [10000];
        String [] textColors = new String [10000];
        String [] backColors = new String [10000];
        String [] response = new String [10000];
        int amtOfAnswers = 1;
        int count = 0;
        int choice = 0;
        String textColorEquals = "";
        String backColorEquals = "";
        String lines = "--------------------------------------";
        System.out.println("Please enter a difficulty level: 1, 2, or 3");
        int diff = sc.nextInt();
        sc.nextLine();

        /* 
            Basics of the game:
            - Given a set of words, the player must memorize the colors
            - After a 5 second delay, the player must type in each color one at a time on separate lines
            - At any point, if they type in an incorrect color, the game ends. The game will print out the correct colors.
            - If they get them all right, the game will continue and add one more word to the series.
            - The series changes every round.
        */

        //  Given the Colors class, use the following method calls to help this program.
        // Colors.print("Test 1");         // This prints out the value given without a new line   
        // Colors.println("Test 2");       // This prints out the value given then a new line
        // Colors.print("Test 3", "BRIGHT_Red");       // 2 String parameters: Value, Color of text
        // Colors.println("Test 4", "BRIGHT_Red");     // 2 String parameters: Value, Color of text WITH a new line after
        // Colors.print("Test 5", "BRIGHT_Red", "BG_Blue");         // 3 String parameters: Value, Color of text, Color of background
        // Colors.println("Test 6", "BRIGHT_Red", "BG_Blue");       // 3 String parameters: Value, Color of text, Color of background WITH a new line after
        // Notice: for the colors, you must concatenate "BRIGHT_" or "BG_" to the input parameter to get the bright or background versions of the colors.

        // Feel free to comment out the test code above when you start your assignment

        if(diff == 1){
            while (isCorrect) {
                System.out.println(lines);
                while (count < amtOfAnswers) {
                    words[count] = getColorWord();
                    System.out.println(words[count]);
                    count++;
                }
                count = 0;
                System.out.println(lines);
                System.out.println("Remember the phrase above!");
                System.out.print("You have : ");
                delay(5);
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nPlease enter the words that you saw on separate lines!");
                while (count < amtOfAnswers) {
                    response[count] = sc.nextLine();
                    count++;
                }
                count = 0;
                for (count = 0; count < amtOfAnswers; count ++) {
                    if (!((words[count].toUpperCase()).equals(response[count].toUpperCase()))) {
                        isCorrect = false;
                    }
                }
                if (isCorrect) {
                    System.out.println("You got it! Onto the next level!");
                    amtOfAnswers++;
                    count = 0;
                }
                else {
                    System.out.println("You got it wrong! Try again!");
                    System.out.print("WORDS ");
                    for (count = 0; count < amtOfAnswers; count ++) {
                        System.out.print(words[count] + " ");
                    }
                }
            }

        }
        
        else if(diff == 2){
            while (isCorrect) {
                System.out.println(lines);
                while (count < amtOfAnswers) {
                    textColorEquals = getColorWord();
                    words[count] = getColorWord();
                    textColors[count] = "BRIGHT_" + textColorEquals;
                    Colors.println(words[count], textColors[count]);
                    count++;
                }
                count = 0;
                System.out.println(lines);
                System.out.println("Remember the phrase above!");
                System.out.print("You have : ");
                delay(5);
                choice = (int)(Math.random()*2);
                if (choice == 0) {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nPlease enter the words that you saw on separate lines!");
                    while (count < amtOfAnswers) {
                        response[count] = sc.nextLine();
                        count++;
                    }
                    count = 0;
                    for (count = 0; count < amtOfAnswers; count ++) {
                        if (!((words[count].toUpperCase()).equals(response[count].toUpperCase()))) {
                            isCorrect = false;
                        }
                    }
                }
                else {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nPlease enter the text colors that you saw on separate lines!");
                    while (count < amtOfAnswers) {
                        response[count] = sc.nextLine();
                        count++;
                    }
                    count = 0;
                    for (count = 0; count < amtOfAnswers; count ++) {
                        if (!((textColors[count].toUpperCase()).equals("BRIGHT_" + (response[count].toUpperCase())))) {
                            isCorrect = false;
                        }
                    }
                }
                
                if (isCorrect) {
                    System.out.println("You got it! Onto the next level!");
                    amtOfAnswers++;
                    count = 0;
                }
                else {
                    System.out.println("You got it wrong! Try again!");
                        System.out.print("WORDS ");
                        for (count = 0; count < amtOfAnswers; count ++) {
                            System.out.print(words[count] + " ");
                        }
                        System.out.println();
                        System.out.print("TEXT COLORS ");
                        for (count = 0; count < amtOfAnswers; count ++) {
                            System.out.print(textColorEquals + " ");
                        }
                }
            }
        }
        
        else if(diff == 3){
            while (isCorrect) {
                System.out.println(lines);
                while (count < amtOfAnswers) {
                    textColorEquals = getColorWord();
                    backColorEquals = getColorWord();
                    words[count] = getColorWord();
                    textColors[count] = "BRIGHT_" + textColorEquals;
                    backColors[count] = "BG_" + backColorEquals;
                    Colors.println(words[count], textColors[count], backColors[count]);
                    count++;
                }
                count = 0;
                System.out.println(lines);
                System.out.println("Remember the phrase above!");
                System.out.print("You have : ");
                delay(5);
                choice = (int)(Math.random()*3);
                if (choice == 0) {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nPlease enter the words that you saw on separate lines!");
                    while (count < amtOfAnswers) {
                        response[count] = sc.nextLine();
                        count++;
                    }
                    count = 0;
                    for (count = 0; count < amtOfAnswers; count ++) {
                        if (!((words[count].toUpperCase()).equals(response[count].toUpperCase()))) {
                            isCorrect = false;
                        }
                    }
                }
                else if (choice == 1) {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nPlease enter the text colors that you saw on separate lines!");
                    while (count < amtOfAnswers) {
                        response[count] = sc.nextLine();
                        count++;
                    }
                    count = 0;
                    for (count = 0; count < amtOfAnswers; count ++) {
                        if (!((textColors[count].toUpperCase()).equals("BRIGHT_" + (response[count].toUpperCase())))) {
                            isCorrect = false;
                        }
                    }
                }
                else {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nPlease enter the background colors that you saw on separate lines!");
                    while (count < amtOfAnswers) {
                        response[count] = sc.nextLine();
                        count++;
                    }
                    count = 0;
                    for (count = 0; count < amtOfAnswers; count ++) {
                        if (!((backColors[count].toUpperCase()).equals("BG_" + (response[count].toUpperCase())))) {
                            isCorrect = false;
                        }
                    }
                }
                
                if (isCorrect) {
                    System.out.println("You got it! Onto the next level!");
                    amtOfAnswers++;
                    count = 0;
                }
                else {
                    System.out.println("You got it wrong! Try again!");
                        System.out.print("WORDS ");
                        for (count = 0; count < amtOfAnswers; count ++) {
                            System.out.print(words[count] + " ");
                        }
                        System.out.println();
                        System.out.print("TEXT COLORS ");
                        for (count = 0; count < amtOfAnswers; count ++) {
                            System.out.print(textColorEquals + " ");
                        }
                        System.out.println();
                        System.out.print("BACKGROUND COLORS ");
                        for (count = 0; count < amtOfAnswers; count ++) {
                            System.out.print(backColorEquals + " ");
                        }
                }
            }
            /*
                Difficulty level 3:
                    This should act the same as difficulty level 2 with the following changes:
                    The user will receive a series of colors as words, as text color, and as background color (ex. "Red", "Blue", "Green", etc.)
                    The computer will randomly choose either to check the word as text, as a color, or as background color
                    The user must type in the colors in the correct order
                    All of the text words, the text colors and the background colors should be stored to be checked later
            */
        

        }
        else {
            System.out.println("Wrong number, try again.");
        }
    }

    // This method should take in a String array as a parameter and print out each element in the array.
    public static void printArray(String[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
	}


    // This method can be called to return a random color. This syntax is the correct syntax for the Colors class. 
    public static String getColorWord(){
        int rand = (int)(Math.random()*5);
        switch (rand){
            case 0: return "Purple";
            case 1: return "Red";
            case 2: return "Green";
            case 3: return "Yellow";
            case 4: return "Blue";
            default: return "White";
        }
    }

    // This method can be called to delay for a certain number of seconds.
    // The parameter count represents the number of seconds to delay.
    public static void delay(int count){
        for (int i = 0; i < count; i++) {
			System.out.print(count-i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
        }
    }
}
