package arrays;

import java.util.Scanner;

public class sec_max_element {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int s1=0;
        int s2=-1;
        for(int i=0;i<n;i++){
            if(s1<a[i]){
                //s1=a[i];
                s2=s1;
                s1=a[i];
            }else if(s2<a[i] && s1!=a[i]){
                s2=a[i];
            }
        }
        System.out.println(s1+" "+s2);
    }
}
