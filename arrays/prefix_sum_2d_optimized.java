package arrays;

import java.util.Scanner;

public class prefix_sum_2d_optimized {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int pre[][]=new int [n][m];
        pre[0][0]=a[0][0];
        for(int i=1;i<n;i++){
            pre[i][0]=pre[i-1][0]+a[i][0];
        }
        for(int i=1;i<m;i++){
            pre[0][i]=pre[0][i-1]+a[0][i];
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                pre[i][j]=pre[i-1][j]+pre[i][j-1]-pre[i-1][j-1]+a[i][j];
            }
        }

        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int Sr=sc.nextInt();
            int Sc=sc.nextInt();
            int Er=sc.nextInt();
            int Ec=sc.nextInt();
            int sum=pre[Er][Ec]-pre[Sr-1][Ec]-pre[Er][Sc-1]+pre[Sr-1][Sc-1];
            System.out.println(sum);
        }

    }
}
