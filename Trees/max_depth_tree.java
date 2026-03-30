// Problem: Maximum Depth of Binary Tree
// Find height of tree

class TreeDepthCalculator {

    class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public int getDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }
}
