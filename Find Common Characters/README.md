# Question
Find Common Characters

# Source
https://leetcode.com/problems/find-common-characters/

# Solution
 - Time complexity: O(N) ** N is the total number of characters in *words*
 - Create int array *freq* with Integer.MAX_VALUE to track the minimum frequency for each char
 - Loop through each string
   - Create int array *count* to track the minimum frequency for that string
   - count[word.charAt(i)-'a'] => e.g) if the word.charAt(i) is 'a', it means, count[0]
   - Increase and store frequency for each character
   - Find the minimum frequency between *freq* and *count* 
 - Each character by frequency to the List<String> *result* as a string (result.add("" + c) is to make the character to string)