import java.util.Scanner;

public class HiLo {

    public static void main(String[] args) {
        
        //This line creates a Scanner object called scan that pulls input from the computer’s keyboard, System.in.
        Scanner scan = new Scanner(System.in);
        
        //line below generates random number between 1-100
        int theNumber = (int)(Math.random() * 100 + 1);
        System.out.println( theNumber );
        int guess = 0;
        //keyword while lets java know we are building a loop
        //'!='means 'not equal to' like in python
        while (guess != theNumber){
        System.out.println("Guess a number between 1 - 100:");
        guess = scan.nextInt();
        if (guess < theNumber)
        System.out.println(guess + " is too low. Try again.");
        else if(guess > theNumber)
        System.out.println(guess + " is too high. Try agin.");
        else System.out.println(guess + " is correct! Ding Ding Ding Winner!");
        }
    }
}
