import java.util.ArrayList;

class Bot extends Human {

    public Bot(String name) {
        super(name);
    }

    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winningScore) {
        if (handScore > 15 && handScore < 25) {
            return false;
        }

        if (myScore >= winningScore - 5) {
            return false;
        }

        return true;
    }
}