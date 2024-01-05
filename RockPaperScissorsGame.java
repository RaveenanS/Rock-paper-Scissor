import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsGame {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    String[] choices = { "rock", "paper", "scissors" };

    System.out.println("Let's play Rock, Paper, Scissors!");
    System.out.println("Enter your choice: rock, paper, or scissors:");
    String userChoice = scanner.next().toLowerCase();

    int randomIndex = random.nextInt(choices.length);
    String computerChoice = choices[randomIndex];

    System.out.println("Computer chose: " + computerChoice);
    if (userChoice.equals(computerChoice)) {
      System.out.println("It's a tie!");
    } else if (userChoice.equals("rock")) {
      if (computerChoice.equals("scissors")) {
        System.out.println("You win! Rock smashes scissors.");
      } else {
        System.out.println("You lose! Paper covers rock.");
      }
    } else if (userChoice.equals("paper")) {
      if (computerChoice.equals("rock")) {
        System.out.println("You win! Paper covers rorock.");
      } else {
        System.out.println("You lose! Scissors cut paper.");
      }
    } else if (userChoice.equals("scissors")) {
      if (computerChoice.equals("paper")) {
        System.out.println("You win! Scissors cut paper.");
      } else {
        System.out.println("You lose! Rock smashes scissors.");
      }
    } else {
      System.out.println("Invalid choice. Please enter rock, paper, or scissors.");
    }

    scanner.close();
  }
}
