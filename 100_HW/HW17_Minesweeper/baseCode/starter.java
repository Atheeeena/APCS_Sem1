import java.util.*;

class starter{
    public static void main(String[] args){
        System.out.println("Welcome to Minesweeper!");
        System.out.println("On the grid, 9 means untouched space.");
        System.out.println("Any other number means how many bombs are adjacent to the square.");
        System.out.println("Clear all empty spots and don't touch the bombs!");
        System.out.println();
        
        System.out.println("How difficult would you like the game?");
        System.out.println("1 - Easy (10 bombs)");
        System.out.println("2 - Medium (25 bombs)");
        System.out.println("3 - Hard (40 bombs)");
        System.out.println("4 - Impossible (99 bombs)");
        
        Scanner sc = new Scanner(System.in);
        int diff = sc.nextInt();
        
        int[][] guessGrid = new int[10][10];
        for(int i = 0; i < guessGrid.length; i++){
            for(int j = 0; j < guessGrid[0].length; j++){
                guessGrid[i][j] = 9;
            }
        }
        
        
        int[][] bombProxGrid = new int[10][10];
        mapSetUp(diff, bombProxGrid);

        boolean alive = true;
        while(alive){
            printGrid(guessGrid);
            System.out.println("-------------------------------------");
            System.out.print("Please enter a row: ");
            int r = sc.nextInt();
            System.out.print("Please enter a col: ");
            int c = sc.nextInt();
            
            boolean boom = move(r, c, bombProxGrid);
            if(boom){           
                System.out.println("-------------------------------------");
                System.out.println("You've hit a bomb! Better luck next time!");
                printGrid(bombProxGrid);
                break;
            }
            reveal(r, c, guessGrid, bombProxGrid);
            int v = 20;
            while(v > 0) {
                for(int a = 0; a < guessGrid.length; a++) {
                    for(int b = 0; b < guessGrid[0].length; b++) {
                        if(guessGrid[a][b] == 0) {
                            reveal(a, b, guessGrid, bombProxGrid); //"floods" the board; empty squares nearby are revealed
                        }
                    }
                }
                v--;
            }
            
            System.out.println("-------------------------------------");
            if(checkWin(guessGrid, bombProxGrid)){
                System.out.println("You won! Congratz!");
                break;
            }
        }
    }
    
    /*
        This method should completely generate a grid of bombs and adjacent values
        EX:
            0 1 9 1 0 2 9 2 0 0 
            0 1 1 1 0 2 9 2 1 1 
            0 0 0 0 0 2 2 2 1 9 
            0 0 0 0 0 1 9 2 3 3 
            1 1 1 0 0 1 1 2 9 9 
            1 9 1 0 0 0 0 1 2 2 
            1 1 1 0 0 0 0 0 0 0 
            0 0 1 1 1 0 0 0 0 0 
            1 1 2 9 1 0 0 0 0 0 
            1 9 2 1 1 0 0 0 0 0 
            
        Start by defining how many bombs the difficulty states.
        
        There are 2 steps to this:
        1. Generate bombs randomly
        2. Generate all the adjacent values in a grid
        
        For step 1:
        - Create a loop that goes until there are no more bombs to place
        - Within that, iterate through the entire 2D array and place bombs
            - To place a bomb randomly, this should be a 1 in 10 chance to place a bomb
                - All bombs should be the value 9
            - Make sure to not place bombs on bombs that are already there
            - When a bomb is placed, make sure to track that for your outer loop
        - This should loop through the 2D array over and over until ALL bombs have been placed
        
        For step 2:
        - Loop through the 2D array
            - For every bomb, call the add adjacent method,  
    */
    public static void mapSetUp(int diff, int [][] bombProxGrid){
        int remaining;
        if(diff == 1) {
            remaining = 10;
        }
        else if(diff == 2) {
            remaining = 25;
        }
        else if(diff == 3) {
            remaining = 40;
        }
        else {
            remaining = 99;
        }
        
        while(remaining > 0) {
            for(int r = 0; r < bombProxGrid.length; r++) {
                for(int c = 0; c < bombProxGrid[0].length; c++) {
                    if (bombProxGrid[r][c] != 9 && (int)(Math.random() * 10) == 9 && remaining > 0) {
                        bombProxGrid[r][c] = 9;
                        remaining--;
                    }
                }
            }
        }
        
        for(int r = 0; r < bombProxGrid.length; r++) {
            for(int c = 0; c < bombProxGrid[0].length; c++) {
                if(bombProxGrid[r][c] == 9) {
                    addAdj(r, c, bombProxGrid);
                }
            }
        }
    }
    
    /*
        Add adjacent values to each location
        Key Concept -> In a compound boolean, if the first evaluation of an && is false, the statement will STOP immediately
        
        - Using the given parameters of row and column, check first if the location is value
        - Check there isn't a bomb in the current location
        - Then add to the location to say there is a bomb adjacent
        
    */
    public static void addAdj(int r, int c, int [][] bombProxGrid){
        if(r - 1 >= 0 && c - 1 >= 0) {
            if(bombProxGrid[r - 1][c - 1] != 9) {
                bombProxGrid[r - 1][c - 1]++;
            }
        }
        if(r - 1 >= 0 && c >= 0) {
            if(bombProxGrid[r - 1][c] != 9) {
                bombProxGrid[r - 1][c]++;
            }
        }
        if(r - 1 >= 0 && c + 1 < bombProxGrid[0].length) {
            if(bombProxGrid[r - 1][c + 1] != 9) {
                bombProxGrid[r - 1][c + 1]++;
            }
        }
        if(r >= 0 && c - 1 >= 0) {
            if(bombProxGrid[r][c - 1] != 9) {
                bombProxGrid[r][c - 1]++;
            }
        }
        if(r >= 0 && c + 1 < bombProxGrid[0].length) {
            if(bombProxGrid[r][c + 1] != 9) {
                bombProxGrid[r][c + 1]++;
            }
        }
        if(r + 1 < bombProxGrid.length && c - 1 >= 0) {
            if(bombProxGrid[r + 1][c - 1] != 9) {
                bombProxGrid[r + 1][c - 1]++;
            }
        }
        if(r + 1 < bombProxGrid.length && c >= 0) {
            if(bombProxGrid[r + 1][c] != 9) {
                bombProxGrid[r + 1][c]++;
            }
        }
        if(r + 1 < bombProxGrid.length && c + 1 < bombProxGrid[0].length) {
            if(bombProxGrid[r + 1][c + 1] != 9) {
                bombProxGrid[r + 1][c + 1]++;
            }
        }
    }
    
    /*
        Checks if you can move to a location or not.
        If it's a bomb, then return true
        If not a bomb, then return false
    */
    public static boolean move(int r, int c, int [][] bombProxGrid){
        return (bombProxGrid[r][c] == 9);
    }
    
    /*
        This method updates the guessGrid with a 3 by 3 square around the location guessed
        The values from the bomb grid should be translated to the answer grid
        After transferred, call the print method on the answer grid.
    */
    public static void reveal(int r, int c, int [][] guessGrid, int[][] bombProxGrid){
        guessGrid[r][c] = bombProxGrid[r][c];
        if(r - 1 >= 0 && c - 1 >= 0) {
            guessGrid[r - 1][c - 1] = bombProxGrid[r - 1][c - 1];
        }
        if(r - 1 >= 0 && c >= 0) {
            guessGrid[r - 1][c] = bombProxGrid[r - 1][c];
        }
        if(r - 1 >= 0 && c + 1 < bombProxGrid[0].length) {
            guessGrid[r - 1][c + 1] = bombProxGrid[r - 1][c + 1];
        }
        if(r >= 0 && c - 1 >= 0) {
            guessGrid[r][c - 1] = bombProxGrid[r][c - 1];
        }
        if(r >= 0 && c + 1 < bombProxGrid[0].length) {
            guessGrid[r][c + 1] = bombProxGrid[r][c + 1];
        }
        if(r + 1 < bombProxGrid.length && c - 1 >= 0) {
            guessGrid[r + 1][c - 1] = bombProxGrid[r + 1][c - 1];
        }
        if(r + 1 < bombProxGrid.length && c >= 0) {
            guessGrid[r + 1][c] = bombProxGrid[r + 1][c];
        }
        if(r + 1 < bombProxGrid.length && c + 1 < bombProxGrid[0].length) {
            guessGrid[r + 1][c + 1] = bombProxGrid[r + 1][c + 1];
        }
    }
    
    /*
        This method should traverse the entire 2D array and check
        whether the guess grid is exactly the same as the proximity grid
        Returning true if so, false if there is a discrepancy
    */
    public static boolean checkWin(int [][] guessGrid, int [][] bombProxGrid){
        for(int r = 0; r < guessGrid.length; r++) {
            for(int c = 0; c < guessGrid[0].length; c++) {
                if(guessGrid[r][c] != bombProxGrid[r][c]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void printGrid(int [][] grid){
        System.out.println("\n    0  1  2  3  4  5  6  7  8  9");
		System.out.println("-------------------------------------");
		for(int i = 0; i < grid.length;i++){
		    System.out.print(i + "| ");
			for(int j = 0; j < grid[0].length;j++){
				System.out.print(" " + grid[i][j] + " ");
			}
			System.out.println();
		}
	}
}