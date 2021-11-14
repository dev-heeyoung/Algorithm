# Question
First Unique Character in a String

# Source
https://leetcode.com/problems/first-unique-character-in-a-string/

# Solution
- Created int array to store the frequency of each character.
- Loop through input String and increase the frequency by one.
- The reason for - 'a', is that it "shifts" the ascii/unicode value so that A - Z have values 0 - 25.
- Find the index where the frequency is 1, which means non-repeating character, and return the index.
- If there's no value with 1 frequency, return -1.