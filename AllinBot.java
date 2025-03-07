import java.util.ArrayList;

class AllinBot extends MaxxWinBot {

    public AllinBot(String name) {
        super(name);
        this.setStrategy("I only roll if my hand if my hand is less 25 or if someone is getting close to the winning score.");
    }

    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winningScore) {
        if (handScore > 25) {
            for (int i = 0; i < otherScores.size(); i++) {
                if (otherScores.get(i) == winningScore - 10) {
                    return true;
                }
            }
        } else {
            return false;
        }

        if (myScore >= winningScore - 10) {
            return false;
        }

        return true;
    }
}