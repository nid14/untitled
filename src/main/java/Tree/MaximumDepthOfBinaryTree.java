package Tree;
// 3-> 9->20->15-7

import recursion.TreeNode;

public class MaximumDepthOfBinaryTree {
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lefghtHieght = maxDepth(root.left);
        int rightHight = maxDepth(root.right);
        int ch = Math.max(lefghtHieght, rightHight);
        return ch+1;
    }
}
