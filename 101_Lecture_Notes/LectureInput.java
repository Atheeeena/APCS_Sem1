/*
    Lecture note example - Input!!
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double coffeePrice = 2.5;
        double piePrice = 8;
        double iceCreamPrice = 4.75;
        System.out.println("☕︎Welcome to Sweet Treats!☕︎");
        System.out.println("Here is our menu:");
        System.out.println("1. ☕︎ Coffee - $" + coffeePrice);
        System.out.println("2. 🥧 Pie - $" + piePrice);
        System.out.println("3. 🍦 Ice Cream - $" + iceCreamPrice);
        System.out.println();
        
        System.out.println("What is the name for your order?");
        String name = sc.nextLine();
        System.out.println();
        
        System.out.println("How many cups of coffee would you like?");
        int coffeeCount = sc.nextInt();
        System.out.println("How many pies would you like?");
        int pieCount = sc.nextInt();
        System.out.println("How many ice cream cones would you like?");
        int iceCreamCount = sc.nextInt();
        
        double total1 = coffeePrice * coffeeCount;
        double total2 = piePrice * piePrice;
        double total3 = iceCreamPrice * iceCreamCount;
        double currentTotal = total1 + total2 + total3;
        System.out.println("Your current total is $" + currentTotal);
        
        System.out.println("What percentage would you like to tip?");
        double tipAmount = sc.nextDouble();
        double tip = currentTotal * (tipAmount / 100);
        double correctTip = (int)tip * 100;
        double newCorrectTip = correctTip/100;
        double grandTotal = currentTotal + newCorrectTip;
        
        System.out.println(name + "'s Receipt: ");
        System.out.println(coffeeCount + " x Coffee = $" + total1);
        System.out.println(pieCount + " x Pie = $" + total2);
        System.out.println(iceCreamCount + " x Ice Cream = $" + total3);
        System.out.println("Tip (" + tipAmount + "%) = $" + newCorrectTip);
        System.out.println("----------------------------------");
        System.out.println("Grand Total = $" + grandTotal);
        System.out.println("----------------------------------");
        System.out.println("Thank you for dining at Sweet Treats!");
	}
}
