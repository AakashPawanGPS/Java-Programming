

class LengthIdentifier
{
    public static int reverse(int num){
        int rem=0,rev=0;
        while((num)!=0){
            rem=num%10;
            rev+=rev*10+rem;
            num=num/10;
        }
        return rev;
    }
    public static int palindrome(int num){
        int rem=0,rev=0;
        int tem=num;
        while((num)!=0){
            rem=num%10;
            rev+=rev*10 + rem;
            num=num/10;
        }
        if(tem==rev){
            return tem;
        }
        return 0;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        int num = 124;


        int sum=0;

//        System.out.println(len);
        while(num!=0){
            sum=num+reverse(num);
            if(sum == palindrome(sum)){
                System.out.println(sum);
                break;
            }
            else{
                num=sum;
            }
        }

    }
}