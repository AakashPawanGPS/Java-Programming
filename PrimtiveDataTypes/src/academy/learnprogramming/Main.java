package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        String myString = "This is a string";
        System.out.println(myString);
        myString = myString + " And this also";
        System.out.println(myString);
        myString = myString +" \u0044";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString+"49.55";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString +myInt;
        System.out.println(lastString);

        double number= 120.57d;
        lastString = lastString+number;
        System.out.println(lastString);
    }
}
