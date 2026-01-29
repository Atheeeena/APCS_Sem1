/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class collatz {
    long max;
    public static int steps(int a) {
        max = 0;
        long x = a;
        int steps = 0;
        while(x != 1) {
            if(x%2 == 1) {
                x = x*3;
                x++;
                steps++;
                if(x > max) {
                    max = x;
                }
            }
            else {
                x = x/2;
                steps++;
            }
        }
        return steps;
    }
	public static void main(String args[]) {
	    int y = 10000000;
	    int maxsteps = 0;
		while(y<100000000) {
		    if (steps(y) > maxsteps) {
		        System.out.println("Steps for " + y + ": " + steps(y));
		        System.out.println("The max number reached was: " + max);
		        maxsteps = steps(y);
		        max = 0;
		    }
		    y++;
		}
	}
}
