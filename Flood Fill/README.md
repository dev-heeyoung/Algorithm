# Question
Flood Fill

# Source
https://leetcode.com/problems/flood-fill/

# Solution
 - Time complexity: Time complexity: O(m*n), m is number of rows, n is number of columns.
 - Approach: Depth-First Search
 - *preColor*: The color of the starting pixel.
 - floodfill the starting pixel: we change the color of that pixel to the new color, then check the 4 neighboring pixels to make sure they are valid pixels of the same color(*preColor*), and of the valid ones, we floodfill those, and so on.