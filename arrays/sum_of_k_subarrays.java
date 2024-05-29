package arrays;

import java.util.Scanner;

public class sum_of_k_subarrays {
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int ind=0;ind<n-k+1;ind++){
            int sum=0;
            for(int i=ind;i<ind+k;i++){
                sum+=a[i];
            }

            System.out.println("("+ind+","+(ind+k-1)+") -> "+sum);
        }
    }
}
