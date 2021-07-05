public class MinutesToYearsAndDays {

    public static void printYearsAndDays(long minutes) {
        if(minutes<0) {
            System.out.println("Invalid Value");
        }
        else {
            long year = minutes/525600;
            long remmin = minutes - (year * 525600);
            long days = remmin/1440;

            System.out.println(minutes+" min = "+year+" y and "+days+" d");
        }
    }

    public static void main(String[] args) {
        printYearsAndDays(525600);
    }
}
