package arrays;

import java.util.Scanner;

public class freq_of_max_element {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(max<a[i]){
                max=a[i];
            }else{

            }
        }
        System.out.println(max);
        int count=0;
        for(int i=0;i<n;i++){
            if(max==a[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
