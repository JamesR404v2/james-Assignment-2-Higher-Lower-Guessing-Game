package com.coderscampus.myapp.main;

import java.util.concurrent.ThreadLocalRandom;

import org.hamcrest.core.Is;

import java.util.Scanner;

import com.coderscampus.myapp.service.MyService;

public class HigherLowerGuessingGame {
	
	private MyService myService = new MyService();
	
	public static void main(String[] args) {

//		String userInput = "no user input yet";
		int userInputInt = 0;
		
		new HigherLowerGuessingGame().execute();
	}

	public void execute() {
		// Your code goes here, not in the main() method
		// This removes any need to consume statics

		
		// Generate random int number (randomNumber) between 1 and 100 inclusive. randomNumber
		
		int randomNumber = ThreadLocalRandom.current().nextInt(1, 100 +1 );
//		System.out.println(randomNumber);
//		Can uncomment to confirm a random number is generated correctly (it is).
		
		// set guessAttemptsRemaining to 5
		int guessAttemptsRemaining = 5;
				
		// User guesses. "Pick a number between 1 and 100"
		
		
		String userInput = "user did not give any input yet";
//		public String userInput;
		
		userInput = userGuess();
		
		
		// validate userInput and ensure it is a number between 1 and 100, if not, ask for input again.
		
//		int userInputInt = 0;
//		declaring this in the main function instead, so it is usable in the userGuess function.
		
int userInputInt = convertUserInputToUserInputInt(userInput);
		
		
		checkUserInputRangeOK(userInputInt);
		// only after the checkUserInputRangeOK is OK, the script will continue here.
		
		
		
		// Compare userInputInt to randomNumber
		if (userInputInt < randomNumber)
			System.out.println("Please pick a higher number");
			guessAttemptsRemaining -1
			
			userInput = userGuess();
//			after we get userInput, we need to do all the other steps mentioned above... *sigh* I need the program to start at the beginning but I do not have goto.
		if
		
		
		if
		
		
//		1.       “Please pick a higher number” (if the number they chose is lower than the randomly generated number), or
//		then substract a guessAttemptsRemaining, if still more than 0 guesses remaining, give another guess
//		  if 0 guesses or less, then go to LoseGame
		
		
//
//		2.       “Please pick a lower number” (if the number they chose is higher than the randomly generated number), or
//		then substract a guessAttemptsRemaining, if still more than 0 guesses remaining, give another guess
//		  if 0 guesses or less, then go to LoseGame
//
//		3.       “You win!” (if they guess the correct number)
		// exit programm.
//		
		
		private void LoseGame();
		{
		System.out.println("You lose, the number to guess was:" randomNumber);
		System.exit(0);
		}
		
		
		
		
	}

	public int checkUserInputRangeOK(int userInputInt) {
		String userInput;
		if ((userInputInt >= 1) == (userInputInt <= 100)) {
//			System.out.println("your input is a number between 1 and 100, woohoo!");
			// when valid, check how the userInput matches the randomNumber and return output	
			// but I'll do that by returning the programm to where we first called this function - so that the guessAttemptsRemaining variable is available.
			
			return userInputInt;
		}
		else
		{
			System.out.println("Your guess is not between 1 and 100, please try again");
			userInput = userGuess();
			// again need to try to convert the new guess to a number again
			userInputInt = convertUserInputToUserInputInt(userInput);
			// then when convertUserInputToUserInputInt completes, need to check if the number is between 1 and 100 again.
			checkUserInputRangeOK(userInputInt);
		}
		return userInputInt;
	}

	public int convertUserInputToUserInputInt(String userInput) {
		//		first make it an integer, so it can be compared to other numbers.
		int userInputInt = 0;
		try {
//			int userInputInt = 0;
			// declaring variable so it can be used.
//			had it declared earlier in the script but still wasn't usable here....
			userInputInt = Integer.parseInt(userInput);			
			}
		catch(NumberFormatException nFE) {
//		    System.out.println("Not an Integer");
			System.out.println("Your guess is not between 1 and 100, please try again");
//			and go to the function to get new user input, without subtracting a remaining guess.
			userInput = userGuess();
			convertUserInputToUserInputInt(userInput);
			}
		return userInputInt;
	}

	String userGuess() {
		System.out.println("Pick a number between 1 and 100");
		
		java.util.Scanner scannerUserInput = new
		java.util.Scanner(System.in);
		
		String userInput = scannerUserInput.next();
		return userInput;
	}

}
