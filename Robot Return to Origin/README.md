# Question
Robot Return to Origin

# Source
https://leetcode.com/problems/robot-return-to-origin/

# Solution
 - Iterate each letter of the given array moves.
 - Increase *x* by 1 if the letter is R.
 - Decrease *x* by 1 if the letter is L. 
 - Increase *y* by 1 if the letter is U.
 - Decrease *y* by 1 if the letter is D.
 - Return true if *x* and *y* are 0. This means the final location is (0, 0).
