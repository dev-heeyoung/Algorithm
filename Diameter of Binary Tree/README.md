# Question
Diameter of Binary Tree

# Source
https://leetcode.com/problems/diameter-of-binary-tree/

# Solution
 - Time complexity: O(N) ** N is the total number of nodes (Each node is visited once)
 - Approach: Depth-first Search
 - Initalize an int diameter to keep track of the longest path we find from the DFS.
 - Implement a recursive function longestPath which takes a TreeNode as input. It should recursively explore the entire tree rooted at the given node. Once it's finished, it should return the longest path out of its left and right branches:
    - if node is None, we have reached the end of the tree, hence we should return 0;
    - we want to recursively explore node's children, so we call longestPath again with node's left and right children. In return, we get the longest path of its left and right children leftPath and rightPath;
    - if leftPath plus rightPath is longer than the current longest diameter found, then we need to update diameter;
    - finally, we return the longer one of leftPath and rightPath. Remember to add 11 as the edge connecting it with its parent.