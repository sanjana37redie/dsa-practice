// Problem: Inorder Traversal (Left → Root → Right)

import java.util.*;

class InorderTraversal {

    class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public List<Integer> traverse(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        performInorder(root, result);
        return result;
    }

    private void performInorder(TreeNode node, List<Integer> list) {

        if (node == null) return;

        performInorder(node.left, list);
        list.add(node.val);
        performInorder(node.right, list);
    }
}
