import java.util.Scanner;

public class HiLo {

    public static void main(String[] args) {
        
        //This line creates a Scanner object called scan that pulls input from the computer’s keyboard, System.in.
        Scanner scan = new Scanner(System.in);
        
        //line below generates random number between 1-100
        int theNumber = (int)(Math.random() * 100 + 1);
        System.out.println(theNumber);
        int guess = 0;
        System.out.println("Guess a number between 1 - 100:");
        guess = scan.nextInt();
        System.out.println("you entered " + guess + ".");
    }
}
