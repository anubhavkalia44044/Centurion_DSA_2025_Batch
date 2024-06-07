package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class LeetCode_Level_Order_traversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        Queue<TreeNode> temp=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)
            return ans;
        q.add(root);
        List<Integer> lst=new ArrayList<>();

        while(!q.isEmpty()){
            lst=new ArrayList<>();
            temp=new LinkedList<>();
            while(!q.isEmpty()){
                if(q.peek().left!=null)
                    temp.add(q.peek().left);
                if(q.peek().right!=null)
                    temp.add(q.peek().right);
                lst.add(q.remove().val);
            }
            q=temp;
            ans.add(lst);
        }
        return ans;

    }
}
