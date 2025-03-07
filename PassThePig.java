import java.util.ArrayList;

class PassThePig {

    public static void main(String[] args) {
        ArrayList<String> pigList = new ArrayList<>();
        final int GAME_WIN_VALUE = 100;
        addPig(pigList, "Dot", 349);
        addPig(pigList, "No Dot", 302);
        addPig(pigList, "Razorback", 224);
        addPig(pigList, "Trotter", 88);
        addPig(pigList, "Snouter", 30);
        addPig(pigList, "Leaning Jowler", 7);

        shuffleList(pigList);
        ArrayList<Player> players = new ArrayList<>();
        players.add(new NeverPassBot("Dum"));
        players.add(new AllinBot("Du"));
        players.add(new MaxxWinBot("MaxiBot"));
        shufflePlayers(players);

        System.out.println("Let's play Pass the Pigs!");

        boolean gameOver = false;
        Player winner = null;

        while (!gameOver) {
            for (int i = 0; i < players.size(); i++) {  
                Player player = players.get(i);
                int handScore = 0;
                boolean playerTurn = true;

                while (playerTurn) {
                    int pigroll1 = (int) (Math.random() * pigList.size());
                    int pigroll2 = (int) (Math.random() * pigList.size());

                    String roll1Outcome = pigList.get(pigroll1);
                    String roll2Outcome = pigList.get(pigroll2);

                    System.out.print(player.getName() + " rolls a " + roll1Outcome + " and a " + roll2Outcome);

                    if ((roll1Outcome.equals("Dot") && roll2Outcome.equals("No Dot")) ||
                            (roll1Outcome.equals("No Dot") && roll2Outcome.equals("Dot"))) {
                        System.out.println(". That's a PIG OUT!");
                        handScore = 0;
                        playerTurn = false;
                    } else {
                        int rollScore = getRollScore(roll1Outcome, roll2Outcome);
                        handScore += rollScore;
                        System.out.println(". Handscore is now " + handScore + ".");

                        if (!player.wantsToRoll(player.getScore(), handScore, getOtherScores(players), GAME_WIN_VALUE)) {
                            System.out.println(player.getName() + " passes.");
                            player.setScore(player.getScore() + handScore);
                            playerTurn = false;
                        }
                    } 

                    if (player.getScore() >= GAME_WIN_VALUE) {
                        gameOver = true;
                        winner = player;
                        break;
                    }
                }
            }

            displayScores(players);

            if (gameOver) {
                break;
            }
        }

        System.out.println("Game over! Winner is: " + winner.getName());
    }

    public static void addPig(ArrayList<String> list, String outcome, int count) {  // add the diffrent types of pigs to the list of pigs
        for (int i = 0; i < count; i++) {
            list.add(outcome);
        }
    }

    public static int getRollScore(String pig1, String pig2) {
        if (pig1.equals("Dot") && pig2.equals("Dot")) {
            return 1;
        }
        if (pig1.equals("No Dot") && pig2.equals("No Dot")) {
            return 1;
        }
        if (pig1.equals("Razorback") && pig2.equals("Razorback")) {
            return 20;
        }
        if (pig1.equals("Trotter") && pig2.equals("Trotter")) {
            return 20;
        }
        if (pig1.equals("Snouter") && pig2.equals("Snouter")) {
            return 40;
        }
        if (pig1.equals("Leaning Jowler") && pig2.equals("Leaning Jowler")) {
            return 60;
        }
        if (pig1.equals("Trotter") || pig2.equals("Trotter")) {
            return 5;
        }
        if (pig1.equals("Snouter") || pig2.equals("Snouter")) {
            return 10;
        }
        if (pig1.equals("Leaning Jowler") || pig2.equals("Leaning Jowler")) {
            return 15;
        }
        if (pig1.equals("Razorback") || pig2.equals("Razorback")) {
            return 5;
        }
        
        return 0;
    } 

    public static void shuffleList(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            int j = (int) (Math.random() * list.size());
            String temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }

    public static void shufflePlayers(ArrayList<Player> players) {
        for (int i = 0; i < players.size(); i++) {
            int j = (int) (Math.random() * players.size());
            Player temp = players.get(i);
            players.set(i, players.get(j));
            players.set(j, temp);
        }
    }

    public static ArrayList<Integer> getOtherScores(ArrayList<Player> players) {
        ArrayList<Integer> playerScores = new ArrayList<>();
        for (int i = 0; i < players.size(); i++) { 
            playerScores.add(players.get(i).getScore());
        }
        return playerScores;
    }

    public static void displayScores(ArrayList<Player> players) {
        for (int i = 0; i < players.size(); i++) { 
            Player player = players.get(i);
            System.out.print(player.getName() + ": " + player.getScore() + " | ");
        }
        System.out.println();
    }
}