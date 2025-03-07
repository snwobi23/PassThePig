import java.util.ArrayList;

class Player {
    private String name;
    private int myScore = 0;
    private String strategy;

    public Player(String n) {
        name = n;
    }

    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winningScore) {
        return false;
    }

    public String getName() {
        return name;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public int getScore() {
        return myScore;
    }

    public void setScore(int score) {
        this.myScore = score;
    }
}