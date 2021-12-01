# Question
Reverse Vowels of a String

# Source
https://leetcode.com/problems/reverse-vowels-of-a-string/

# Solution
 ## Solution 1: HashSet & Two pointers
 - Create Set with the vowels.
 - Create char array 'arr' and store all the characters from the given String s in the same order.
 - Set the 'left' to the first index of the array and the 'right' to the end of the index of the array.
 - If the set does not contain the arr[left], increase left by 1 (move left pointer to the next index).
 - If the set does not contain the arr[right], decrease right by 1 (move right pointer to the left index).
 - If the set contains the arr[left] and arr[right], switch two elements, increase the left index and decrease the right index.
 - Loop while the left index is less than the right index.
 - Create a new String from the char array and return it.

 ## Solution 2: HashSet & Stack
 - Create char Array, stack, and set, and add vowels to the set.
 - Push vowels from the given String s from the first index into the stack.
 - Loop through the given Sting s. Copy the element from the given array s if the character is not a vowel, get and take out the element from the stack if the character is a vowel.
 - Convert the char array to String and return it.