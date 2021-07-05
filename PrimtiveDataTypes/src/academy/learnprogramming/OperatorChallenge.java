package academy.learnprogramming;

public class OperatorChallenge<bool> {
    public static void main(String[] args) {
        double v1 = 20d;
        double v2 = 80d;
        double v3 = ((v1+v2)*100.00)%40;
        boolean bool = (v3==0)?true : false;
        System.out.println(bool);
        if(v3!=0)
            System.out.println("Got some remiander");


    }
}
