package arrays;

import java.util.Scanner;

public class freq_of_all_elements {
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int aux[]=new int[100000+1];
        for(int i=0;i<n;i++){
            int val=a[i];
            aux[val]++;
            // aux[val]=aux[val]+1;
        }
        for(int i=0;i<aux.length;i++){
            if(aux[i]>0)
            System.out.println(i+" - "+aux[i]);
        }
    }
}
