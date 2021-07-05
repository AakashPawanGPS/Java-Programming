package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void revSort(int arr[],int len){
        int temp=0;
        for(int i=0;i<len;i++){
            for (int j=0;j<len;j++){
                if(arr[j]<arr[i]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
	// write your code here
        int N,K;
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        K=sc.nextInt();
        int[] arr;
        arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        revSort(arr,N);

        int sum=0,i;
        for(i=0;i<N;i++){
            sum+=arr[i];
            if(sum>K){
                System.out.println(N-i-1);
                break;
            }
        }
        if(sum<K){
            System.out.println(N);
        }

    }
}
