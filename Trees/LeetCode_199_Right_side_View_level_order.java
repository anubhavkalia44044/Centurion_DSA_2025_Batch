package Trees;
import java.util.*;
public class LeetCode_199_Right_side_View_level_order {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        Queue<TreeNode> temp=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)
            return new ArrayList<>();
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
        List<Integer> ll=new ArrayList<>();
        for (int i=0;i<ans.size();i++){
            int ind=ans.get(i).size()-1;
            ll.add(ans.get(i).get(ind));
        }
        return ll;

    }
}
