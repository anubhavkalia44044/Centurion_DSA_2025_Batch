package arrays;

import java.util.Scanner;

public class array_2d {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++){
                a[row][col]=sc.nextInt();
            }
        }

        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++){
                System.out.print(a[row][col]+"\t");
            }
            System.out.println();
        }


    }
}
