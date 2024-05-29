package arrays;

import java.util.Scanner;

public class Binary_Search {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            // int mid=(left+right)/2;
            if(a[mid]>key){
                right=mid-1;
            }else if(a[mid]<key){
                left=mid+1;
            }else{
                System.out.println(mid+" - "+a[mid]);
                break;
            }
        }

    }
}
