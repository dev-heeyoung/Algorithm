# Question
Number of Islands

# Source
https://leetcode.com/problems/number-of-islands/

# Solution
- Time complexity: O(MxN)
- Solution with a Depth First Search.
- 1) If a node contains '1' (land), start DFS.
- 2) During DFS, every visited node should be set to '0'. It will be done when all for edges of the grid are all surrounded by water.
- 3) After DFS, increase *numOfIslands* by 1. It presents the number of islands.
- Check all the nodes and repeat 1)-3).
- Return *numOfIslands*.