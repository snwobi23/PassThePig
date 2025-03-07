import java.util.ArrayList;

class NeverPassBot extends AllinBot {

    public NeverPassBot(String name) {
        super(name);
        this.setStrategy("Im the never pass bot. I never pass :).");
    }

    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winningScore) {
        return true;
    }
}