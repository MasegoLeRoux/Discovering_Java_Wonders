# Rock-Paper-Scissors Game

This is a simple console-based Rock-Paper-Scissors game implemented in Java.

## How to Play

1. Clone or download the repository to your local machine.
2. Open the project in your preferred Java development environment.
3. Compile and run the `RockPaperScissorsGame.java` file.

## Gameplay Instructions

1. Enter your name to start the game.
2. You will play against the computer in a series of rounds.
3. Choose your move by typing "ROCK", "PAPER", or "SCISSORS" (case-insensitive).
4. The computer's move will be randomly generated.
5. The winner of each round will be displayed, along with the current score.
6. The first player to win a specified number of rounds (default: 2) wins the game.
7. You can choose to play again after a game is finished.

## Sample Output

Welcome to the Rock-Paper-Scissors game!
Enter your name: Alice
Hello, Alice!

Select your move:
1->ROCK
2->PAPER
3->SCISSORS
Please make use of words
Enter your choice:
ROCK
Computer chose: SCISSORS
Congratulations, Alice! You win this round!
Score: Alice 1 - 0 Computer
Next round...

Select your move:
1->ROCK
2->PAPER
3->SCISSORS
Please make use of words
Enter your choice:
PAPER
Computer chose: ROCK
Congratulations, Alice! You win this round!
Score: Alice 2 - 0 Computer
Do you want to play again? (YES/NO):
NO

Game over!
Congratulations, Alice! You win the game!

## Customization

You can customize the number of rounds needed to win by modifying the `roundsToWin` variable in the code.

## License

This project is licensed under the [MIT License](LICENSE).
