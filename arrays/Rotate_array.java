package arrays;

import java.util.Scanner;

public class Rotate_array {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int b[]=new int[2*n];

        for(int i=0;i<2*n;i++){
            b[i]=a[i%n];
        }
        for(int i=k;i<k+n;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
    }
}
