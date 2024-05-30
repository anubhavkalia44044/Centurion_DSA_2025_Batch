package Stacks_ques;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;
import java.util.Stack;

public class Online_Stock_spanning_problem {
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int ans[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(st.isEmpty() || a[st.peek()]>a[i]){
                st.push(i);
                ans[i]=1;
            }else{
                int count=1;
                while(!st.isEmpty() && a[st.peek()]<=a[i]){
                    count+=ans[st.pop()];
                }
                ans[i]=count;
                st.push(i);
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
