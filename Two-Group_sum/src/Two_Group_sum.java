import java.util.Scanner;

public class Two_Group_sum {
    public static int calculate(int arr[] , int n , int sum1 , int sum2 , int lenSum1 , int lenSum2){
        if(n<0){
            if(Math.abs(lenSum1-lenSum2)>1){
                return Integer.MAX_VALUE;
            }
            else {
                return Math.abs(sum1-sum2);
            }
        }
        return Math.min(calculate(arr,n-1,sum1,sum2,lenSum1,lenSum2),calculate(arr,n-1,sum1+arr[n],sum2-arr[n],lenSum1+1,lenSum2-1));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        String[] str = string.split(",");
        int n = str.length;
        int arr[] = new int[n];
        int totalsum = 0;

        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(str[i]);
            totalsum=totalsum+arr[i];
        }
        int min=calculate(arr,n-1,0,totalsum,0,n);
        System.out.println((int)(totalsum/2f - min/2f)+" "+(int)(totalsum/2f - min/2f));
    }
}
