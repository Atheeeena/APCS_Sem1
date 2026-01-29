/* 
    Lecture note example - Methods
*/
import java.util.Scanner;
class LectureMethod{
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Number 2: ");
        int num2 = sc.nextInt();
        
        int num1Squared = squared(num1);
        int num2Squared = squared(num2);
        int num1Absolute = absolute(num1);
        int num2Absolute = absolute(num2);
        
        System.out.println(num1 + " squared is " + num1Squared);
        System.out.println(num2 + " squared is " + num2Squared);
        System.out.println(num1 + "'s absolute value is " + num1Absolute);
        System.out.println(num2 + "'s absolute value is " + num2Absolute);
	}
	
	public static int squared(int a) {
	    int answer = a * a;
	    return answer;
	}
	
	public static int absolute(int a) {
	    if (a < 0) {
	        a *= -1;
	    }
	    return a;
	}
}