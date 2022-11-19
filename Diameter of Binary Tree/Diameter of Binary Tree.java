class Solution {
    private int diameter;
    
    public int diameterOfBinaryTree(TreeNode root) {
        if (root==null) return 0;
       
        diameter = 0;
        longestPath(root);

        return diameter;
    }
    private int longestPath(TreeNode root) {
        if (root==null) return 0;
        
        int leftLength = longestPath(root.left);
        int rightLength = longestPath(root.right);
        
        diameter = Math.max(diameter, leftLength + rightLength);
        
        return Math.max(leftLength, rightLength) + 1;
    }

}