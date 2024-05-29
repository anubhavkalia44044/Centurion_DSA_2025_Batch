package arrays;

import java.util.Scanner;

public class Subarray_sum_equal_k {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int tar_sum=sc.nextInt();
        int i=0;
        int j=0;
        int curr_sum=0;
        while(i<=j){
            if(curr_sum<tar_sum){
                curr_sum+=a[j];
                //curr_sum=curr_sum+a[j];
                j++;
            }else if(curr_sum>tar_sum){
                curr_sum-=a[i];
                i++;
            }else{
                System.out.println(i+"-"+(j-1));
                break;
            }
        }
    }
}
