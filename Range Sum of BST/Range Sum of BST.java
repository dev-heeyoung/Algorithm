// Solution 1) Iterative version
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        Stack<TreeNode> stack = new Stack<>();
        
        stack.push(root);
        int sum = 0;
        
        while(!stack.empty()){
            TreeNode tmp = stack.pop();
            if(tmp == null)
                continue;
            if(tmp.val > low) 
                stack.push(tmp.left);
            if(tmp.val < high)
                stack.push(tmp.right);
            if(tmp.val >= low && tmp.val <= high)
                sum += tmp.val;
        }
        return sum;
    }
}

// Solution 2) Recursive version1
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null)
            return 0;
        
        int total = 0;
        
        if(root.val > low) 
            total += rangeSumBST(root.left, low, high);
        
        if(root.val < high) 
            total += rangeSumBST(root.right, low, high);
        
        if(root.val <= high && root.val >= low)
            total += root.val;
        
        return total;
    }
}

// Solution 3) Recursive version2
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null)
            return 0;
        
        return  ((root.val <= high && root.val >= low) ? root.val : 0) + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }
}