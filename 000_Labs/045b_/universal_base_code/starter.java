/*
 *	Author:  
 *  Date: 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		/*
			Create a program that creates a crossword puzzle hiding 1 word given by the user!

			1. Take a word from the user
			2. Create a 2D String array with a size of 5 larger than the word size in both directions
			3. Choose what direction the word should hide in
				- Vertical, Horizontal, Diagonal
				- EXTRA: Choose if the word should hide forward or backwards
			4. For each letter in the word, hide it into a spot in the 2D array
				- This spot should be chosen randomly within the bounds of the 2D array
			5. Once the word is stored in the array, fill up the rest of the array
				- Note what value is stored in the String array and replacing non-filled values with random letters
				- Given the letters array, choose a random letter to populate it with
			6. Print out the crossword puzzle!
			7. Ask a friend to find the word!
		*/
		Scanner sc = new Scanner(System.in);
		

		String[] letters = {
            "a","b","c","d","e","f","g","h","i","j",
            "k","l","m","n","o","p","q","r","s","t",
            "u","v","w","x","y","z"
        };
		
		System.out.println("Input a word: ");
		String input = sc.nextLine();
		int wordLength = input.length();
		String[][] crossword = new String[wordLength + 5][wordLength + 5];
		int direction = (int)(Math.random() * 3);
		int firstLetterR = (int)(Math.random() * (crossword.length - wordLength));
		int firstLetterC = (int)(Math.random() * (crossword[0].length - wordLength));
		if(direction == 0) {
			for(int r = 0; r < crossword.length; r++) {
				for(int c = 0; c < crossword[0].length; c++) {
					crossword[r][c] = letters[(int)(Math.random() * letters.length)];
				}
			}
			for(int c = 0; c < wordLength; c++) {
				crossword[firstLetterR][firstLetterC + c] = input.substring(c, c + 1);
			}
			for(int r = 0; r < crossword.length; r++) {
				for(int c = 0; c < crossword[0].length; c++) {
					System.out.print(crossword[r][c] + " ");
				}
				System.out.println();
			}
		}
		else if(direction == 1) {
			for(int r = 0; r < crossword.length; r++) {
				for(int c = 0; c < crossword[0].length; c++) {
					crossword[r][c] = letters[(int)(Math.random() * letters.length)];
				}
			}
			for(int r = 0; r < wordLength; r++) {
				crossword[firstLetterR + r][firstLetterC] = input.substring(r, r + 1);
			}
			for(int r = 0; r < crossword.length; r++) {
				for(int c = 0; c < crossword[0].length; c++) {
					System.out.print(crossword[r][c] + " ");
				}
				System.out.println();
			}
		}
		else {
			for(int r = 0; r < crossword.length; r++) {
				for(int c = 0; c < crossword[0].length; c++) {
					crossword[r][c] = letters[(int)(Math.random() * letters.length)];
				}
			}
			for(int c = 0; c < wordLength; c++) {
				crossword[firstLetterR + c][firstLetterC + c] = input.substring(c, c + 1);
			}
			for(int r = 0; r < crossword.length; r++) {
				for(int c = 0; c < crossword[0].length; c++) {
					System.out.print(crossword[r][c] + " ");
				}
				System.out.println();
			}
		}
	}
}
