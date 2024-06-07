package Trees;
import java.util.*;
public class LeetCode_199_Right_side_View_HashMap {
    public List<Integer> rightSideView(TreeNode root){
        HashMap<Integer,Integer> map=new HashMap<>();
        fun(root,0,map);
        System.out.println(map);
        List<Integer> ans=new ArrayList<>();
        for(Integer i: map.keySet()){
            ans.add(map.get(i));
        }
        return ans;
    }
    public void fun(TreeNode root,int h,HashMap<Integer,Integer> map){
        if(root==null)
            return;
        map.put(h,root.val);
        fun(root.left,h+1,map);
        fun(root.right,h+1,map);
    }
}
