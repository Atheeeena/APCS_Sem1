import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the passwordsay you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the passwordsay passwords
		int strength1 = 0;
		int strength2 = 0;
		int strengthBoth = 0;
		int strengthNeither = 0;
		boolean case1 = false;
		boolean case2 = false;
        for(int x = 0; x < passwords.length; x++) {
            if(passwords[x].contains("!") || passwords[x].contains("@") || passwords[x].contains("#") || passwords[x].contains("$") || passwords[x].contains("%") || passwords[x].contains("^") || passwords[x].contains("&") || passwords[x].contains("*")) {
                case2 = true;
            }
            if(passwords[x].length() >= 8) {
                case1 = true;
            }
            if(case1 && case2) {
                strengthBoth++;
                case1 = false;
                case2 = false;
            }
            else if(case1) {
                strength1++;
                case1 = false;
            }
            else if(case2) {
                strength2++;
                case2 = false;
            }
            else {
                strengthNeither++;
            }
        }
        System.out.println("There are " + strength1 + " passwords of strength 1 with 8 or more characters.");
        System.out.println("There are " + strength2 + " passwords of strength 2 with a special symbol.");
        System.out.println("There are " + strengthBoth + " passwords of strength 3 with both strength 1 and 2.");
        System.out.println("There are " + strengthNeither + " passwords with no strength.");
		
	}
}
