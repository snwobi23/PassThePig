import java.util.ArrayList;

class MaxxWinBot extends Human {

    public MaxxWinBot(String name) {
        super(name);
        this.setStrategy("I only roll if my hand if my hand is less 25 and greater than 15, and I don't risk it at the end");
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