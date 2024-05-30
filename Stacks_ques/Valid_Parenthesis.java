package Stacks_ques;

import java.util.Stack;

public class Valid_Parenthesis {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        char ch[]=s.toCharArray();
        int n= ch.length;
        for(int i=0;i<n;i++){
            if(ch[i]=='(' || ch[i]=='{' || ch[i]=='['){
                st.push(ch[i]);
            }else{
                if(st.isEmpty())
                    return false;
                if(ch[i]==')' && st.peek()=='('){
                    st.pop();
                }else if(ch[i]=='}' && st.peek()=='{'){
                    st.pop();
                }else if(ch[i]==']' && st.peek()=='['){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(st.isEmpty())
        return true;
        else return false;
    }

}
