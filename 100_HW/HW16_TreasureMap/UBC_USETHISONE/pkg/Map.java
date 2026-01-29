package pkg;
import java.util.Scanner;
import java.util.Random;


public class Map {
	int [][] map;		// 2D Array as a visual representation of the map
	int treasureColumn;		// Hidden treasure location X coordinate
	int treasureRow;		// Hidden treasure location Y coordinate
	int posColumn;			// Current X position of the player
	int posRow;			// Current Y position of the player

	/*
		Initialize the 2D array map with row and column lengths.
		Initialize starting location as 0,0 including the starting map value of 2 for current location.
		Call generateTreasure to create a treasure location.
	*/
	public Map(int row, int column){
		map = new int[row][column];
		int posColumn = 0;
		int posRow = 0;
		generateTreasure();
	}

	/*
		Generate and X and Y coordinate of the treasure given the size of the map
	*/
	public void generateTreasure(){
		treasureColumn = (int)(Math.random() * map[0].length);
		treasureRow = (int)(Math.random() * map.length);
	}

	/*
		The position of the player is changed depending on a command given.
		This method should also change map values to indicate where the player is.
		Add 2 if the player is in the current location. (should also update old positons)

		Integer paramter m for move represents the below commands:
		1 - up
		2 - down
		3 - left
		4 - right
		5 - left up
		6 - right up
		7 - left down
		8 - right down

		Returns true if the player location was moved correctly
		Returns false if the player choose an invalid location
	*/
	public boolean move(int m){
		if(m == 1 && posRow != 0) {
			posRow--;
			return true;
		}
		else if(m == 2 && posRow < map.length - 1) {
			posRow++;
			return true;
		}
		if(m == 3 && posColumn != 0) {
			posColumn--;
			return true;
		}
		if(m == 4 && posColumn < map[0].length - 1) {
			posColumn++;
			return true;
		}
		if(m == 5 && (posRow == 0 || posColumn == 0)) {
			posRow--;
			posColumn--;
			return true;
		}
		if(m == 6 && (posRow == 0 || posColumn == map[0].length - 1)) {
			posRow--;
			posColumn++;
			return true;
		}
		if(m == 7 && (posRow == map.length - 1 || posColumn == 0)) {
			posRow++;
			posColumn--;
			return true;
		}
		if(m == 8 && (posRow == map.length - 1 || posColumn == 0)) {
			posRow++;
			posColumn++;
			return true;
		}
		else {
			return false;
		}
		// Dummy value to make work
	}

	/*
		Given 2 integer parameters, check validity of location and move the current positon.
		This method should also change map values to indicate where the player is.
		Add 2 if the player is in the current location. (should also update old positons)

		Returns true if the player location was moved correctly
		Returns false if the player choose an invalid location
	*/
	public boolean move(int row, int col){
		if(row < map.length && col < map[0].length) {
			posRow = row;
			posColumn = col;
		}
		return true;	// Dummy value to make work
	}

	/*
		This method checks for treasure!
		Check the current position of the player
		Adding 1 indicates that the spot has been searched for treasure.
			Only check unchecked spots.
		Returns true if treasure was found, false otherwise.
	*/
	public boolean dig(){
		if(posRow == treasureRow && posColumn == treasureColumn){
			map[posRow][posColumn] = 5;
			return true;
		}
		else if(map[posRow][posColumn] != 1) {
			map[posRow][posColumn] = 1;
			return false;
		}
		else {
			return false;
		}
		// Dummy value to make work
	}

	/*
		This method prints the location of the treasure.
		Set the map value of the treasure to 7 (7 is the lucky number!)
		Print where the treasure was
		Call printMap()
	*/
	public void printTreasureLoc(){
		map[treasureRow][treasureColumn] = 7;
		System.out.println("The treasure was at row " + treasureRow + " column " + treasureColumn);
		printMap();
	}

	/*
		Print the entire map of the 2D array.
	*/
	public void printMap(){
		for(int r = 0; r < map.length; r++) {
			for(int c = 0; c < map[0].length; c++) {
				if (r == posRow && c == posColumn) {
					System.out.print(map[r][c] + 2 + " ");
				}
				else {
					System.out.print(map[r][c] + " ");
				}
			}
			System.out.println();
		}
	}

}
