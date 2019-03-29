import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        //creation and initialization of the input handler(scanner) , the computer player and your player
        Scanner scanner = new Scanner(System.in);
        PlayerInterface computer = new ComputerPlayer(new Random());
        PlayerInterface human = new HumanPlayer(scanner);

        System.out.println("Welcome to a simple Rock-Paper-Scissors tutorial at Sail 2019!");

        do {
            //string variables store your play choices
            String comp = computer.play();
            String you = human.play();

            System.out.printf("You chose %s and the computer chose %s", you, comp);

            if (you.equals(comp)) {
                //checks if you and the computer had the same selection
                System.out.println(", IT'S A TIE!");

            } else if ( ("Rock".equals(you) && "Scissors".equals(comp)) ||
                    ("Scissors".equals(you) && "Paper".equals(comp)) ||
                    ("Paper".equals(you) && "Rock".equals(comp)) ) {
                //checks if you won
                System.out.println(", You win!");

            } else {
                //if you didn't draw and you didn't win , then you must have lost
                System.out.println(", You lose!");

            }

        } while (playAgain(scanner)); // a do-while loop ensures the program is run at least once

    }

    private static boolean playAgain(Scanner scanner) {

        //this method asks you if you want to play again and returns true if you do and false otherwise
        System.out.println("Play again?");
        System.out.println("Reply 1 for Yes, 0 for No");

        if (scanner.nextInt() == 1) {
            System.out.println("Awesome!");
            return true;

        } else {
            System.out.println("Thanks for playing!");
            return false;

        }

    }

}
