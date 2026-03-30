// Problem: Preorder Traversal (Root → Left → Right)

import java.util.*;

class PreorderTraversal {

    class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public List<Integer> traverse(TreeNode root) {

        List<Integer> output = new ArrayList<>();
        dfs(root, output);
        return output;
    }

    private void dfs(TreeNode node, List<Integer> list) {

        if (node == null) return;

        list.add(node.val);
        dfs(node.left, list);
        dfs(node.right, list);
    }
}
