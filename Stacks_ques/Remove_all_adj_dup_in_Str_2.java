package Stacks_ques;

import java.util.Stack;

public class Remove_all_adj_dup_in_Str_2 {
    public String removeDuplicates(String s, int k) {
        char ch[]=s.toCharArray();
        int n=ch.length;
        Stack<Character> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        for(int i=0;i<n;i++){
            if(st1.isEmpty()){
                st1.push(ch[i]);
                st2.push(1);
            }else{
                if(ch[i]==st1.peek()){
                    int count=st2.pop();
                    st2.push(count+1);
                    if(st2.peek()==k){
                        st1.pop();
                        st2.pop();
                    }

                }else{
                    st1.push(ch[i]);
                    st2.push(1);
                }
            }
        }

        System.out.println(st1);
        System.out.println(st2);
        StringBuilder sb=new StringBuilder();
        while(!st1.isEmpty()){
            char c=st1.pop();
            int count=st2.pop();
            for(int i=0;i<count;i++){
                sb.insert(0,c);
            }
        }
        return sb.toString();
    }
}
