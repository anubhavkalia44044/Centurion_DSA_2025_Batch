package Stacks_ques;

import java.util.Scanner;
import java.util.Stack;

public class Next_greater_element {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            if(st.isEmpty()){
                st.push(i);
            }else{
                if(a[st.peek()]<a[i]){// Potential candidate
                    while(!st.isEmpty() && a[st.peek()]<a[i]){
                        int ind=st.pop();
                        ans[ind]=a[i];
                    }
                    st.push(i);
                }else{
                    st.push(i);
                }
            }
        }
        while(!st.isEmpty()){
            ans[st.pop()]=-1;
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
