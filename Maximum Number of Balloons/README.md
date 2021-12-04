# Question
Maximum Number of Balloons

# Source
https://leetcode.com/problems/maximum-number-of-balloons/

# Solution
 - Create int array *letters* to count characters 'a-z'.
 - Store the frequency of all characters in the given String *text* into the *letters*.
 - Declare int *min* and initialize it to letters[0] (the frequency of *a*).
 - Store minimum value between *min* and letters[1] (the frequency of *b*).
 - Store minimum value between *min* and letter[11]/2 (letter[11] points to the frequency of *l*. The reason we divide it by 2 is that *balloon* includes two *l*).
 - Store minimum value between *min* and letters[13] (the frequency of *n*).
 - Store minimum value between *min* and letter[14]/2 (letter[14] points to the frequency of *o*. The reason we divide it by 2 is that *balloon* includes two *o*).
 - Return *min*.