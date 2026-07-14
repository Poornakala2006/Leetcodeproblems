class Solution {

    public void preorder(TreeNode root, List<Integer> ans) {
        if (root == null) {
            return;
        }

        ans.add(root.val);          // Root
        preorder(root.left, ans);   // Left
        preorder(root.right, ans);  // Right
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        preorder(root, ans);
        return ans;
    }
}