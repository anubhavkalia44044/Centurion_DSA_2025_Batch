package arrays;

import java.util.Scanner;

public class prefix_sum_2d {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=scanner.nextInt();
            }
        }
        int q=scanner.nextInt();
        for(int i=0;i<q;i++){
            int sr=scanner.nextInt();
            int sc=scanner.nextInt();
            int er=scanner.nextInt();
            int ec=scanner.nextInt();
            int sum=0;
            for(int row=sr;row<=er;row++){
                for(int col=sc;col<=ec;col++){
                    sum=sum+a[row][col];
                }
            }
            System.out.println(sum);
        }
    }
}
