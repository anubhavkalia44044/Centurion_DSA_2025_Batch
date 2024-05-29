package arrays;

import java.util.Scanner;

public class Prefix_Sum_1D {
    public static void main(String Rajnandini[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int q=sc.nextInt();
        // Write Logic for calculation of Prefix array
        int pre[]=new int[n];
        int sum=0;
        pre[0]=a[0];
        for(int i=1;i<n;i++){
            //sum+=a[i];
            //pre[i]=sum;
            pre[i]=pre[i-1]+a[i];
        }
        for(int i=0;i<q;i++){
            int l=sc.nextInt();
            int r=sc.nextInt();
            //System.out.println();
            if(l!=0)
            System.out.println(pre[r]-pre[l-1]);
            else
                System.out.println(pre[r]);
        }

    }
}
