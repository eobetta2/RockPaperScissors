import java.util.Scanner;

public class HumanPlayer implements PlayerInterface {

    private final Scanner humanScanner;

    //the constructor creates a scanner to process your replies
    public HumanPlayer(Scanner scanner) {
        humanScanner = scanner;
    }

    public String play() {
        System.out.println("Select 1, 2, or 3 for Rock, Paper, Scissors");

        //saves your response as an integer
        int choice = humanScanner.nextInt();

        //returns your choice
        return CHOICES[choice - 1];
    }

}
