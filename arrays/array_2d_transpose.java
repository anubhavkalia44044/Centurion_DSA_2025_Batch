package arrays;

import java.util.Scanner;

public class array_2d_transpose {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                a[row][col]=sc.nextInt();
            }
        }
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                if(row-col>0){
                    // swap
                    int temp=a[row][col];
                    a[row][col]=a[col][row];
                    a[col][row]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
