
public interface PlayerInterface {
    //specifies how each player, wether human or computer must behave and what each player must be able to do
    String[] CHOICES = new String[] { "Rock", "Paper", "Scissors" };

    //this method returns the choice of either rock , paper or scissors
    String play();
}
