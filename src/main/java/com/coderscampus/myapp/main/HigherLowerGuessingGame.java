package com.coderscampus.myapp.main;

import java.util.concurrent.ThreadLocalRandom;

import org.hamcrest.core.Is;

import java.util.Scanner;

import com.coderscampus.myapp.service.MyService;

public class HigherLowerGuessingGame {

    private MyService myService = new MyService();

    public static void main(String[] args) {

        new HigherLowerGuessingGame().execute();
    }
}

    public void execute() {
        // Your code goes here, not in the main() method
        // This removes any need to consume statics

        int userInputInt = 0;

        // Generate random int number (randomNumber) between 1 and 100 inclusive. randomNumber
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 100 + 1);

        // set guessAttemptsRemaining to 5
        int guessAttemptsRemaining = 5;

        // Create userInput string for storing future input from the user.

        String userInput = "user did not give any input yet";


//		while the user still has guesses remaining, 
//		keep letting the user guess till he guesses correctly or runs out of guesses.

        while (guessAttemptsRemaining > 0 && userInputInt != randomNumber) {
//			ask user for (new) input		
            System.out.println("Pick a number between 1 and 100");

            java.util.Scanner scannerUserInput = new
                    java.util.Scanner(System.in);

            userInput = scannerUserInput.next();


            // first make it an integer, so it can be compared to other numbers.
            try {
                userInputInt = Integer.parseInt(userInput);
            } catch (NumberFormatException nFE) {
//					    userInput is not an Integer. So let the user specify new input by continuing to a new iteration of the loop.
                System.out.println("Your guess is not between 1 and 100, please try again");
                continue;
            }


            //					String userInput;
            if ((userInputInt >= 1) == (userInputInt <= 100)) {
                //						the input is in the valid range, so we can continue normally.
            } else {
                System.out.println("Your guess is not between 1 and 100, please try again");
                continue;
                //						The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
            }

            //					only after the checkUserInputRangeOK is OK, the script will continue here.

            // Compare userInputInt to randomNumber
            if (userInputInt < randomNumber) {
                System.out.println("Please pick a higher number");
                //			substract one guess attempt.
                guessAttemptsRemaining--;
                //			continue the script and it will loop around as long as there are still guess attempts remaining.
            }
            if (userInputInt > randomNumber) {
                System.out.println("Please pick a lower number");
                guessAttemptsRemaining--;
                //			continue the script and it will loop around as long as there are still guess attempts remaining.
            }
            if (userInputInt == randomNumber) {
                System.out.println("You win!");
                //			scannerUserInput.close();
                //			thought I have to close the scanner, but it complains it cannot be resolved.
                System.exit(0);
            }


            if (guessAttemptsRemaining == 0) {
                //		we only get here when the guessAttemptsRemaining equal zero. Because the above loop has the entry condition.
                System.out.println("You lose, the number to guess was:" + randomNumber);
                //			scannerUserInput.close();
                //			thought I have to close the scanner, but it complains it cannot be resolved.
                System.exit(0);
            }

        }


    }