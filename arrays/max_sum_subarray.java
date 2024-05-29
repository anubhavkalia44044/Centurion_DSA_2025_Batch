package arrays;

import java.util.Scanner;

public class max_sum_subarray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=a[j];
                if(sum>max){
                    max=sum;
                }
            }
        }
        System.out.println(max);
    }
}
