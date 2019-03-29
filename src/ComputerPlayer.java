import java.util.Random;

public class ComputerPlayer implements PlayerInterface {

    private final Random computerRandom;

    //the constructor uses a random generator to make choices for the computer
    public ComputerPlayer(Random random) {
        computerRandom = random;
    }

    public String play() {
        //returns the random computer selection
        return CHOICES[computerRandom.nextInt(CHOICES.length)];
    }
}
