import java.util.ArrayList;

class PassThePig {
    public  static void main(String[] args){
        System.out.println("hi");

        ArrayList<String> pigList = new ArrayList<>();
        
        addPig(pigList,"Dot",349);
        addPig(pigList,"No Dot",302);
        addPig(pigList,"Razorback",224);
        addPig(pigList,"Trotter",88);
        addPig(pigList,"Snouter",30);
        addPig(pigList,"Leaning Jowler",7);
        
        shuffleList(pigList);

        for (String pig : pigList) {
            System.out.println(pig);
        }
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
}