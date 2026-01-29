/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static String getObject() {
        int x = (int)(Math.random()*3);
        if (x == 0) {
            return "rock";
        }
        else if (x == 1) {
            return "paper";
        }
        else {
            return "scissors";
        }
    }
    public static int compare2(String a, String b) {
        if (a.equals(b)) {
            return 0;
        }
        else if ((a.equals("rock") && b.equals("scissors")) || (a.equals("paper") && b.equals("rock")) || (a.equals("scissors") && b.equals("paper"))) {
            return 1;
        }
        else {
            return 2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Would you like to play the computer? (yes/no/done)");
            String answer = sc.nextLine();
            if (answer.equals("yes")) {
                while (true) {
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("Please enter rock/paper/scissors:");
                    String input = sc.nextLine();
                    if (input.equals("rock") || input.equals("paper") || input.equals("scissors")) {
                        int win = compare2(input, getObject());
                        if (win == 0) {
                            System.out.println("It was a tie!");
                            break;
                        }
                        else if (win == 1) {
                            System.out.println("You win!");
                            break;
                        }
                        else {
                            System.out.println("You lost!");
                            break;
                        }
                    }
                    else {
                        System.out.println("That is not one of the options.\n");
                    }
                }
            }
            else if (answer.equals("no")) {
                System.out.println("--------------------------------------------------------------");
                System.out.println("How many times should the computer play itself?");
                int numOfTimes = sc.nextInt();
                sc.nextLine();
                int ties = 0;
                int winsFor1 = 0;
                int winsFor2 = 0;
                while (numOfTimes > 0) {
                    int compWin = compare2(getObject(), getObject());
                    if (compWin == 0) {
                        ties += 1;
                    }
                    else if (compWin == 1) {
                        winsFor1 += 1;
                    }
                    else {
                        winsFor2 += 1;
                    }
                    numOfTimes -= 1;
                }
                System.out.println("Results: ");
                System.out.println("Computer 1 wins: " + winsFor1);
                System.out.println("Computer 2 wins: " + winsFor2);
                System.out.println("Ties: " + ties);
            }
            else if (answer.equals("done")) {
                System.out.println("--------------------------------------------------------------");
                System.out.println("Thanks for playing!");
                break;
            }
            else {
                System.out.println("Not a correct option.");
            }
        }
        
    }
}
