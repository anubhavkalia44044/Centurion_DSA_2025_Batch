package Trees;
import java.util.*;
public class LeetCode_515_Largest_value_in_each_tree_row {
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        Queue<TreeNode> temp=new LinkedList<>();
        List<Integer> ans=new ArrayList<>();
        if(root==null)
            return ans;
        q.add(root);
        List<Integer> lst=new ArrayList<>();

        while(!q.isEmpty()){
            lst=new ArrayList<>();
            temp=new LinkedList<>();
            int max=Integer.MIN_VALUE;
            while(!q.isEmpty()){
                if(q.peek().left!=null)
                    temp.add(q.peek().left);
                if(q.peek().right!=null)
                    temp.add(q.peek().right);
                max=Math.max(max,q.peek().val);
                lst.add(q.remove().val);
            }
            q=temp;
            ans.add(max);
        }
        return ans;
    }
}
