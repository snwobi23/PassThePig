import java.util.ArrayList;
import java.util.Scanner;

class Human extends Player {
    private Scanner sc;

    public Human(String name) {
        super(name);
        this.setStrategy("My roll based on logic");
        this.sc = new Scanner(System.in);
    }

   public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winningScore) {
        System.out.println("Do you want to roll? (yes/no)");
        String response = sc.nextLine().toLowerCase();
        
        while(!response.equals("yes") && !response.equals("no")) {
            System.out.println("Incorrect. Do you want to roll? (yes/no)");
            response = sc.nextLine().toLowerCase();
        }

        if (myScore < 20) {
            return false;
        }

        return response.equals("yes");

    }

}
