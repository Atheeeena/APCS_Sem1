
import java.util.Scanner;


class piFind {
    public static double pi(long a) {
        double denominator = 1;
        double pi = 0;
        for (long x = 0; x < a; x++) {
            if(x%2 == 0) {
                pi += 1/denominator;
            }
            else {
                pi -= 1/denominator;
            }
            denominator += 2;
        }
        pi *= 4;
        return pi;
    }
	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("How many equations would you like to perform? ");
	    long accuracy = sc.nextLong();
	    System.out.println("Pi is approximately " + pi(accuracy));
	}
}
