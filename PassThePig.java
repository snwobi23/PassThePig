import java.util.ArrayList;

class PassThePig {
    public  static void main(String[] args){
        ArrayList<String> pigList = new ArrayList<>();
        int handScore = 0;
        int final GAME_SCORE = 100;
        
        addPig(pigList,"Dot",349);
        addPig(pigList,"No Dot",302);
        addPig(pigList,"Razorback",224);
        addPig(pigList,"Trotter",88);
        addPig(pigList,"Snouter",30);
        addPig(pigList,"Leaning Jowler",7);

        shuffleList(pigList);
        

        Player player = new Player("Human");
        System.out.println("Let's play Pass the Pigs!");

        int pigroll1 = (int)(Math.random() * pigList.size());
        int pigroll2 = (int)(Math.random() * pigList.size());

        String roll1Outcome = pigList.get(pigroll1);
        String roll2Outcome = pigList.get(pigroll2);

        System.out.println("Player rolled:");
        System.out.println(roll1Outcome);
        System.out.println(roll2Outcome);


    }


    public static void addPig(ArrayList<String> list, String outcome, int count) {
        for (int i = 0; i < count; i++) {
            list.add(outcome);
        }
    }

    public static void shuffleList(ArrayList<String> list) {

        for (int i = 0; i < list.size(); i++) {
            int j = (int)(Math.random() * list.size());
            String temp = list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
        }
    }

    public static void pigOutcome(String pig1, String pig2, Player player) {
        int score = 0;

        if ((pig1.equals("Dot") && pig2.equals("No Dot")) || (pig1.equals("No Dot") && p2.equals("Dot"))){ 
            System.out.println(player.getName() + "is out the game!");
            player.setScore(0);
            return;
        }

        if (pig1.equals("Dot") && p2.equals("Dot")) {
            score = 1;
            System.out.println("You ");
        }else if  (pig1.equals("No Dot") && p2.equals("Dot")){
            score = 1;
            System.out.println("You ");
        } else if  (pig1.equals("No Dot") && p2.equals("Dot")){
            score = 1;
            System.out.println("You ");
        } else if  (pig1.equals("No Dot") && p2.equals("Dot")){
            score = 1;
            System.out.println("You ");
        } else if  (pig1.equals("No Dot") && p2.equals("Dot")){
            score = 1;
            System.out.println("You ");
        } else if  (pig1.equals("No Dot") && p2.equals("Dot")){
            score = 1;
            System.out.println("You ");
        } else if  (pig1.equals("No Dot") && p2.equals("Dot")){
            score = 1;
            System.out.println("You ");
        } else {
            if (pig1.equals("Razorback") || pig2.equals("Razorback")){
                score = 5;
                System.out.println("yo");
            }  else if (pig1.equals("Razorback") || pig2.equals("Razorback")){
                score = 1;
                System.out.println("You ");
            }  else if (pig1.equals("Razorback") || pig2.equals("Razorback")){
                score = 1;
                System.out.println("You ");
            }  else if (pig1.equals("Razorback") || pig2.equals("Razorback")){
                score = 1;
                System.out.println("You ");
                System
            } 
        }

        player.setScore(player.getScore() + score);
    }
}