package arrays;

import java.util.Scanner;

public class sum_of_all_elements_of_array {
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            if(a[i]>=0)
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
}
