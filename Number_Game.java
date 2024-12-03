import java.util.Scanner;
import java.util.Random;
public class Number_Game {
    public static void main(String [] args) {
    Random random=new Random();
    int randomNumber=random.nextInt(100)+1;
    Scanner scanner=new Scanner(System.in);
    int userGuess=0;
    int attempts=0;
    System.out.println("Welcome to the Random Number Guessing Game!");
    System.out.println("I have selected a random number between 1 and 100. ");
    System.out.println("Try to guess it!");

    while(userGuess!=randomNumber) {
        System.out.print("Enter your guess: ");
        userGuess=scanner.nextInt();
        attempts++;

        if(userGuess<randomNumber)  {
            System.out.println("Too low! Try again.");
        }
        else if(userGuess>randomNumber) {
            System.out.println("Too high! Try again.");
        }else {
            System.out.println("Congratulations! You've gyessed the correct number!");
            System.out.println("It took you "+ attempts + " attempts.");
        }
    }
    scanner.close();
    }
}
