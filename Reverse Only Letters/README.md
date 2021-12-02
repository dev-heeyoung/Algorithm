# Question
Reverse Only Letters

# Source
https://leetcode.com/problems/reverse-only-letters/

# Solution
 - Approach with Two pointers
 - Create char array 'arr' and store all the characters from the given String s in the same order.
 - Set the 'left' to the first index of the array and the 'right' to the end of the index of the array.
 - If the arr[left] is not a letter, increase left by 1 (move left pointer to the next index).
 - If the arr[right] is not a letter, decrease right by 1 (move right pointer to the left index).
 - If both arr[left] and arr[right] are letters, switch two elements using string s so that there is no need to create a temperate variable for switching. Increase the left index and decrease the right index.
 - Loop while the left index is less than the right index.
 - Create a new String from the char array and return it.
