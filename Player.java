class Player {
    private String name;
    private String strategy;
    private int myScore;

public Player(String n){
    name = n;
    myScore = 0;
}

public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winningScore) {
    if (int myScore == 0) {
        return true;
    } else {
        return false
    }
}

public String getName() {
 return name;
}

public String getStrategy() {
 return strategy;
}

public int getScore() {
    return score;
}

public void setScore(int score) {
    this.myScore = score;
}







}