import java.util.*;

// Java implementation to find the 
// sum of two integers of base B 
class BaseNumSum {

    // Function to find the sum of 
    // two integers of base B 
//    public static int sumBaseB(int num1,int num2, int base)
//    {
//        int sum=0,newnum=0,carry=0,power=1;
//        while(num1/power || num2/power) {
//            sum = ((num1/power)%10 + (num2/power)%101)+carry;
//            newnum= ((sum%base) *power)+ newnum;
//            carry = sum/base;
//            power*=10;
//        }
//
//
//        if(carry>0){
//            newnum = carry*power + newnum;
//        }
//        System.out.println(newnum);
//
//        return 0;
//    }

    // Driver Code 
    public static void main (String[] args)
    {
        int num1,num2,base;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        base = sc.nextInt();
        // Function Call
        int sum=0,newnum=0,carry=0,power=1;
        while(((num1/power)) || ((num2/power))) {
            sum = ((num1/power)%10 + (num2/power)%101)+carry;
            newnum= ((sum%base) *power)+ newnum;
            carry = sum/base;
            power*=10;
        }


        if(carry){
            newnum = carry*power + newnum;
        }
        System.out.println(newnum);
//        sumBaseB(num1, num2, base);

    }
}