package Trees;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class LeetCode_pathsum {
    public boolean hasPathSum(TreeNode root, int tar) {
        if(root==null)
            return false;
        if(root.left==null && root.right==null && (tar-root.val)==0){
            return true;
        }
        boolean ans_l=hasPathSum(root.left,tar-root.val);
        boolean ans_r=hasPathSum(root.right,tar-root.val);

        return ans_l || ans_r;

    }
}
