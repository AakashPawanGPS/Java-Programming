package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
	    int score = 5000;
	    int levelCompleted = 5;
	    int bonus = 100;

//	    if(score == 5000)
//            System.out.println("Your Score was 5000");

		if(gameOver==true){
			int finalScore= score +(levelCompleted*bonus);
			System.out.println("Your final score was : "+finalScore);
		}

		gameOver = true;
		score = 10000;
		levelCompleted = 8;
		bonus = 200;

		if(gameOver==true){
			int finalScore= score +(levelCompleted*bonus);
			System.out.println("Your final score was : "+finalScore);
		}

		//int savedFinalScore = finalScore;----> cant access finalScore



    }
}
