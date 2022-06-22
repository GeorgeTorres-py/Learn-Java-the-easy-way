import java.util.Scanner;
public class HiLo {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playAgain = "";
        int numberOfTries  = 0;
        int numberOfTries = numberOfTries + 1;
        do{
// Create a random number for the user to guess
            int theNumber = (int)(Math.random() * 100 + 1);

// System.out.println( theNumber );
            int guess = 0;
            while (guess != theNumber) {
                    System.out.println("Guess a number between 1 and 100:");
                    guess = scan.nextInt();
                if (guess < theNumber)
                    System.out.println(guess + " is too low. Try again.");
                else if (guess > theNumber)
                    System.out.println(guess + " is too high. Try again.");
                else
                    System.out.println(guess + " is correct. You win!");
            } // End of while loop for guessing
            System.out.println("Would you like to play again? (y/n)");
            playAgain = scan.next();
    }   while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Thanks for playing my first java game!");
        scan.close();
    }
}
/*
what i learned in this chapter and from creating this game

• Creating a new class, HiLo
• Importing an existing Java package, java.util.Scanner
• Using a Scanner object to accept keyboard input
• Declaring and initializing integer and string variables
• Generating a random number with Math.random() and casting it to an
integer
• Using while and do-while loops to repeat a set of steps while a condition
is true
• Printing text strings and variable values to the command line console
• Scanning integers and strings from the keyboard and storing them in
variables
• Testing various conditional expressions in if and if-else statements
• Using String methods to compare string values with equalsIgnoreCase()
• Closing input resources like Scanner objects with the close() method
multi line comments
**/
