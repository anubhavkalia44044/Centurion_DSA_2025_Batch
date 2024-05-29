package arrays;

import java.util.Scanner;

public class Selection_sort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int req_ind=0;
        for(int i=0;i<n;i++){
            req_ind=i;
            for(int j=i;j<n;j++){
                if(a[req_ind]>=a[j]){
                    req_ind=j;
                }
            }
            // swap
            int temp=a[i];
            a[i]=a[req_ind];
            a[req_ind]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
