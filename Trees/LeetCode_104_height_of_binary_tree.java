package Trees;

public class LeetCode_104_height_of_binary_tree {
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        int l=maxDepth(root.left);
        int r=maxDepth(root.right);
        return Math.max(l,r)+1;
    }
}
