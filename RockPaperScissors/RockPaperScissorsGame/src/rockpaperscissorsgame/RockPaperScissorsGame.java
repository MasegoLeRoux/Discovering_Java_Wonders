/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rockpaperscissorsgame;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Masego
 */

public class RockPaperScissorsGame {
	
	  static int determineWinner(String user, String computer) {

	if ((user.equals("ROCK") && computer.equals("SCISSORS")) ||
            (user.equals("PAPER") && computer.equals("ROCK")) ||
            (user.equals("SCISSORS") && computer.equals("PAPER"))) {
            return 1; // User wins
        }
        
        if ((computer.equals("ROCK") && user.equals("SCISSORS")) ||
            (computer.equals("PAPER") && user.equals("ROCK")) ||
            (computer.equals("SCISSORS") && user.equals("PAPER"))){
	
            return -1; // User computer
        }
		
        
        return 0; // Neither wins
    }
	
    public static void main(String[] args) {
        int userWins = 0;
        int computerWins = 0;
        int roundsToWin = 2;

        System.out.println("Welcome to the Rock-Paper-Scissors game!");

        // Prompt user for their name and validate it
        Scanner scanner = new Scanner(System.in);
        String userName;
        do {
            System.out.print("Enter your name: ");
            userName = scanner.nextLine().trim();

            if (userName.isEmpty()) {
                System.out.println("Name cannot be empty. Please enter your name.");
            }
        } while (userName.isEmpty());

        System.out.println("Hello, " + userName + "!");

        do {
            System.out.println("\nSelect your move:\n1->ROCK\n2->PAPER\n3->SCISSORS\nPlease make use of words");
            String[] choices = {"ROCK", "PAPER", "SCISSORS"};
            Random random = new Random();
            int computerChoice = random.nextInt(3);

            System.out.println("Enter your choice:");
            String userChoice = scanner.nextLine().toUpperCase();
	    
	    if (!userChoice.equals("ROCK") && !userChoice.equals("PAPER") && !userChoice.equals("SCISSORS")) {
                System.out.println("Invalid choice. Please choose ROCK, PAPER, or SCISSORS.");
                continue; 
            }
            System.out.println("Computer chose: " + choices[computerChoice]);

            int result = determineWinner(userChoice, choices[computerChoice]);

            if (result == 1) {
                System.out.println("Congratulations, " + userName + "! You win this round!");
                userWins++;
            }

            if (result == -1) {
                System.out.println("Sorry, " + userName + ". Computer wins this round!");
                computerWins++;
            }

            if (result == 0) {
                System.out.println("It's a tie!");
            }

            System.out.println("Score: " + userName + " " + userWins + " - " + computerWins + " Computer");

            if (userWins >= roundsToWin || computerWins >= roundsToWin) {
                System.out.println("Do you want to play again? (YES/NO):");
            } else {
                System.out.println("Next round...");
            }

        } while ((userWins < roundsToWin && computerWins < roundsToWin) ||
                scanner.nextLine().trim().equalsIgnoreCase("YES"));

        System.out.println("\nGame over!");
        if (userWins > computerWins) {
            System.out.println("Congratulations, " + userName + "! You win the game!");
        } else if (computerWins > userWins) {
            System.out.println("Sorry, " + userName + ". Computer wins the game.");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
