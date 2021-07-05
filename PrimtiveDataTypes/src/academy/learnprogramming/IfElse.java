package academy.learnprogramming;

public class IfElse {
    public static void main(String[] args) {
        boolean isAlien = false;
        if(isAlien == false){
            System.out.println("Not an Alien");
            System.out.println("Im scared of aliens");}
        else
            System.out.println("Alien");

        boolean isCar = false;
        if(isCar !=true)
            System.out.println("Not to happen");

        isCar= true;
        boolean wasCar = isCar?false:true;
        System.out.println(wasCar);
    }
}
