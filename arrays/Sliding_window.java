package arrays;

import java.util.Scanner;

public class Sliding_window {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sliding_sum=0;
        for(int i=0;i<k;i++){
            sliding_sum=sliding_sum+a[i];
        }
        System.out.println("("+0+","+(k-1)+") -> "+sliding_sum);
        for(int i=1;i<n-k+1;i++){
            sliding_sum=sliding_sum+a[k+i-1]-a[i-1];
            System.out.println("("+i+","+(i+k-1)+") -> "+sliding_sum);
        }






    }
}
