// Problem: Validate Binary Search Tree

class ValidateBST {

    class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean isValid(TreeNode root) {
        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean check(TreeNode node, long min, long max) {

        if (node == null) return true;

        if (node.val <= min || node.val >= max) {
            return false;
        }

        return check(node.left, min, node.val) &&
               check(node.right, node.val, max);
    }
}
