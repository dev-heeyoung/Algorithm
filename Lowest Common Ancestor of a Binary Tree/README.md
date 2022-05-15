# Question
Lowest Common Ancestor of a Binary Tree

# Source
https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/

# Solution
 - Time Complexity: O(N)
 - Recursive approach.
 - Start traversing the tree from the root node. (Depth first manner)
 - Return null if the root points to null.
 - Return the root node if the value of root is equal to the value of p or q.
 - If root is not null and not equal to the value of p or q, call the function with left node and right node recursively. The return nodes will be stored in *left* and *right* respectively.
 - Case1) *left* and *right* both are null : return null.
 - Case2) *left* and *right* both are not null : return the root.
 - Case3) Either *left* or *right* is null : return the non-null node.

 