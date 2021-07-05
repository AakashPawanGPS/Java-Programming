package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Aakash",265);
        System.out.println("New Score is "+newScore);
        calculateScore(180);
        calculateScore();
    }

    public static int calculateScore(String playerName , int score){
        System.out.println("Player "+playerName+" has scored "+score+" runs.");
        return score*1000;
    }

    public static int calculateScore(int score){                  //overloading same method with different parameter
        System.out.println("Player has scored "+score+" runs.");
        return score*1000;
    }

    public static int calculateScore(){
        System.out.println("Player has scored No runs.");
        return 0;
    }

//    public static void calculateScore(){                         //DataType should not be changed
//        System.out.println("Player has scored runs.");
//
//    }
}
