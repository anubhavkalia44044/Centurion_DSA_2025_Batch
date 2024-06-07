package Trees;
import java.util.*;
public class LeetCode_103_Zig_zag_level_order_traversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        List<List<Integer>> ans=new ArrayList<>();
        fun(root,0,map);
        System.out.println(map);
        //return new ArrayList<>();
        for(Integer i:map.keySet()){
            if(i%2==1){
                // rev
                ans.add(map.get(i).reversed());
            }else{
                ans.add(map.get(i));
            }
        }
        return ans;
    }
    public void fun(TreeNode root,int h,HashMap<Integer,List<Integer>> map){
        if(root==null){
            return ;
        }
        if(map.containsKey(h)){
            map.get(h).add(root.val);
        }else{
            map.put(h,new ArrayList<>());
            map.get(h).add(root.val);
        }
        fun(root.left,h+1,map);
        fun(root.right,h+1,map);

    }
}
