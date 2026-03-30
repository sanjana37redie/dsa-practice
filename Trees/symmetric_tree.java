// Problem: Check if Tree is Symmetric

class SymmetricTree {

    class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        return compare(root.left, root.right);
    }

    private boolean compare(TreeNode t1, TreeNode t2) {

        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;

        if (t1.val != t2.val) return false;

        return compare(t1.left, t2.right) &&
               compare(t1.right, t2.left);
    }
}
