package arrays;

import java.util.Scanner;

public class array_2d_search_in_normal_array {
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
        int key=sc.nextInt();
        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++){
                if(a[row][col]==key){
                    System.out.println("key is found"+row+","+col);
                    return;
                }
            }
        }
        System.out.println("Not found");

    }
}
